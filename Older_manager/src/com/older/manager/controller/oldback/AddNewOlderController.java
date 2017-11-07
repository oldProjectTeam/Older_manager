package com.older.manager.controller.oldback;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Oldman;
import com.older.manager.bean.Relatives;
import com.older.manager.service.oldback.AddNewOlderService;
import com.older.manager.service.oldback.OldRelativesService;
import com.older.manager.utils.Msg;
import com.older.manager.utils.SaveFile;

/**
 * 新增老人
 * 
 * @author 疯癫 再次编写：杨明 编写内容：添加一个查询所有老人电话的接口，和跳转到修改页面接口
 * 
 */
@Controller
@RequestMapping("old")
public class AddNewOlderController {

	@Autowired
	private AddNewOlderService addNewOlderService;
	@Autowired
	private OldRelativesService oldRelativesService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}; // true:允许输入空值，false:不能为空值

	/**
	 * 跳转老人列表
	 * 
	 * @return
	 */
	@RequestMapping("/skipolderinfo/{pn}")
	public String skipolderinfo(@PathVariable("pn") Integer id) {
		return "oldback/oldManInfoMange/selectallolderwith";

	}

	/**
	 * 增加老人
	 * 
	 * @param oldman
	 * @return
	 * @throws IOException
	 * @throws IllegalStateException
	 */
	@RequestMapping("/addnewolder/{pn}")
	public String addNewOlder(@Valid Oldman oldman, BindingResult result,
			@PathVariable("pn") Integer pn, MultipartFile file,
			HttpServletRequest request) throws IllegalStateException,
			IOException {
		List<Map<String, Object>> errorList = new ArrayList<Map<String, Object>>();
		if (result.hasErrors()) {
			for (FieldError fieldError : result.getFieldErrors()) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("fieldName", fieldError.getField());
				map.put("errorMessage", fieldError.getDefaultMessage());
				errorList.add(map);
			}
		} else {
			String imgUrl = null;
			if (file != null) {
				imgUrl = SaveFile.saveImg(file, request);
			}
			if (oldman != null) {
				oldman.setPhoto(imgUrl);
				addNewOlderService.addNewOlder(oldman);
				Relatives relatives = new Relatives();
				relatives.setName(oldman.getUrgencycontact());
				relatives.setSex(oldman.getSex());
				relatives.setPhone(oldman.getPhone());
				relatives.setRelation(oldman.getRelation());
				relatives.setIslive(oldman.getLiveinfo());
				relatives.setAddress(oldman.getAddress());
				relatives.setOldmanId(oldman.getId());
				oldRelativesService.addOlderRelative(relatives);
			}

			return "oldback/oldManInfoMange/selectallolderwith";
		}
		request.setAttribute("errorList", errorList);
		return "oldback/oldManInfoMange/addOldManInfo";

	}

	/**
	 * 跳转到插入老人页面
	 * 
	 * @return
	 */
	@RequestMapping("/insertnewolder")
	public String insertnewolder() {
		return "oldback/oldManInfoMange/addOldManInfo";
	}

	/**
	 * 删除老人
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/deleteolder/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteOlder(@PathVariable("id") Integer id) {

		addNewOlderService.deleteOlder(id);

		return Msg.success();
	}

	/**
	 * 更新老人
	 * 
	 * @param oldman
	 * @return
	 * @throws IOException
	 * @throws IllegalStateException
	 */
	@RequestMapping(value = "/upateolder/{id}&{pn}", method = RequestMethod.POST)
	public String updateOlder(Oldman oldman, @PathVariable("pn") Integer pn,
			MultipartFile file, HttpServletRequest request)
			throws IllegalStateException, IOException {

		String imgUrl = null;
		if (file != null) {
			imgUrl = SaveFile.saveImg(file, request);
		}
		if (oldman != null) {
			addNewOlderService.updateOlder(oldman);
		}
		return "oldback/oldManInfoMange/selectallolderwith";
	}

	/**
	 * 通过id查看一个老人
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/selectolder/{id}")
	public String selectOlder(@PathVariable("id") Integer id, Model model) {

		Oldman oldman = addNewOlderService.selectOlder(id);
		model.addAttribute("oldman", oldman);
		return "oldback/oldManInfoMange/oldManInfoView";
	}

	/**
	 * 通过id查看一个老人进行显示到页面上
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/selectolderwithedit/{id}&{pn}")
	public String selectOlderWithEdit(@PathVariable("id") Integer id,
			Model model, @PathVariable("pn") Integer pn) {

		Oldman oldman = addNewOlderService.selectOlder(id);
		model.addAttribute("oldman", oldman);
		return "oldback/oldManInfoMange/editOlderInfo";
	}

	/**
	 * 查询所有老人
	 * 
	 * @param pn
	 * @param model
	 * @return
	 */
	@RequestMapping("/selectallolder/{pn}")
	public String selectAllOlder(@PathVariable Integer pn, Model model) {
		PageHelper.startPage(pn, 5);
		List<Oldman> allolder = addNewOlderService.selectAllOlder();
		PageInfo pageInfo = new PageInfo(allolder, 5);
		model.addAttribute("pageInfo", pageInfo);
		return "oldback/oldManInfoMange/addnewolder";
	}

	/**
	 * 模糊查询返回json数据
	 * 
	 * @param pn
	 * @param str
	 * @return
	 * @throws UnsupportedEncodingException
	 */

	@RequestMapping("/selectallolderwith")
	@ResponseBody
	public Msg selectAllOlderWithJson(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			@RequestParam(value = "str", defaultValue = "") String str)
			throws Exception {
		PageHelper.startPage(pn, 5);
		List<Oldman> allolder = addNewOlderService
				.selectAllOlderWith(new String(str.getBytes("iso-8859-1"),
						"utf-8"));
		PageInfo<Oldman> pageInfo = new PageInfo<Oldman>(allolder, 5);
		return Msg.success().add("pageInfo", pageInfo);

	}

	/**
	 * 老人批量导入
	 * 
	 * @param oldman
	 * @return
	 */
	@RequestMapping(value = "/addOldManBatch", method = RequestMethod.POST)
	public String addOldManBatch(@RequestParam("file") MultipartFile file,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		// 判断文件是否为空
		if (file == null)
			return null;
		// 获取文件名
		String name = file.getOriginalFilename();
		// 进一步判断文件是否为空（即判断其大小是否为0或其名称是否为null）
		long size = file.getSize();
		if (name == null || ("").equals(name) && size == 0)
			return null;
		// 批量导入。参数：文件名，文件。
		String excelForm = file.getOriginalFilename().substring(
				file.getOriginalFilename().indexOf(".") + 1,
				file.getOriginalFilename().length());
		String msg = "";
		if (excelForm.equals("xlsx") || excelForm.equals("xls")) {
			boolean b = addNewOlderService.batchImport(name, file);
			if (b) {
				msg = "批量导入老人成功";
			} else {
				msg = "批量导入老人失败";
			}
		} else {
			msg = "请导入Excel格式的文件";
		}
		model.addAttribute("msg", msg);
		return "oldback/oldManInfoMange/batchImport";
	}

	/**
	 * 跳转到批量导入
	 * 
	 * @return
	 */
	@RequestMapping("/batchImport")
	public String batchImport() {
		return "oldback/oldManInfoMange/batchImport";
	}

	/**
	 * 批量删除
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "/deleteallolder/{ids}", method = RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteEmp(@PathVariable("ids") String ids) {
		if (ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<Integer>();
			String[] str_ids = ids.split("-");

			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			addNewOlderService.deleteBatch(del_ids);
		} else {
			Integer id = Integer.parseInt(ids);
			addNewOlderService.deleteOlder(id);
		}

		return Msg.success();
	}

	/**
	 * 老人批量导入的模板下载
	 * 
	 * @param session
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/sample")
	public ResponseEntity<byte[]> download(HttpServletRequest request)
			throws IOException {
		String path = request.getSession().getServletContext()
				.getRealPath("upload/sample/sample.xls");
		File file = new File(path);
		HttpHeaders headers = new HttpHeaders();
		String fileName = new String("sample.xls".getBytes("UTF-8"),
				"iso-8859-1");// 为了解决中文名称乱码问题
		headers.setContentDispositionFormData("attachment", fileName);
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
				headers, HttpStatus.CREATED);
	}

	/**
	 * 查询所有老人信息
	 * 
	 * @return
	 */

	@RequestMapping("/selectallolderskiptakeactivity")
	@ResponseBody
	public Msg selectAllOlderSkipTakeActivity() {
		List<Oldman> oldman = addNewOlderService.selectAllOlder();
		return Msg.success().add("oldman", oldman);

	}

	/**
	 * @Title: findAllOldManPhone
	 * @Description: 查询所有的老人电话和基本信息
	 * @param: @param pn
	 * @param: @param pageSize
	 * @param: @return
	 * @return: Msg
	 * @throws
	 */
	@RequestMapping(value = "/findAllOldManPhone")
	@ResponseBody
	public Msg findAllOldManPhone(
			@RequestParam(value = "pn", defaultValue = "1", required = true) Integer pn,
			@RequestParam(value = "pageSize", defaultValue = "5", required = false) Integer pageSize) {
		PageHelper.startPage(pn, pageSize);
		List<Oldman> list = addNewOlderService.findOldManPhone();
		PageInfo<Oldman> pageInfo = new PageInfo<Oldman>(list, 6);
		if (list == null) {
			return Msg.fail().add("msg", "没有查询到相关数据");
		} else {
			return Msg.success().add("pageInfo", pageInfo);
		}
	}

	/**
	 * @Title: intoUpdateOldManInfo
	 * @Description: 跳转到修改老年人信息界面
	 * @param: @param id
	 * @param: @param model
	 * @param: @return
	 * @return: String
	 * @throws
	 */
	@RequestMapping(value = "/intoUpdateOldManInfo")
	public String intoUpdateOldManInfo(String id, Model model) {
		Oldman oldman = addNewOlderService.selectOlder(Integer.valueOf(id));
		model.addAttribute("oldman", oldman);
		return "oldback/oldManInfoMange/editOlderInfo";
	}
}
