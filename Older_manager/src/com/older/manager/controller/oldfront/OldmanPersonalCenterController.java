/**
 * 
 */
package com.older.manager.controller.oldfront;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.disk.DiskFileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.older.manager.bean.Oldman;
import com.older.manager.bean.Oldmanaccount;
import com.older.manager.service.oldfront.IOldmanService;
import com.older.manager.utils.Msg;
import com.older.manager.utils.SaveFile;
import com.oss.gy.bean.OSSJSON;
import com.oss.gy.utils.OSSFileUtils;

/**
 * @author ym
 * @date 2017年11月23日 上午11:24:52
 */
@Controller
@RequestMapping("/PersonalCenter")
public class OldmanPersonalCenterController {

	@Autowired
	IOldmanService iOldmanService;

	/**
	 * @Title: initBinder
	 * @Description: 解决上传时间转换问题
	 * @param: @param binder
	 * @return: void
	 * @throws
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}; // true:允许输入空值，false:不能为空值

	/**
	 * @Title: intoPersonalInfo
	 * @Description: 跳转到老人个人资料页面
	 * @param: @param oldmanId
	 * @param: @param model
	 * @param: @return
	 * @param: @throws Exception
	 * @return: String
	 * @throws
	 * @author: ym
	 * @date: 2017年11月23日 下午2:28:45
	 */
	@RequestMapping("/intoPersonalInfo")
	public String intoPersonalInfo(Integer oldmanId, Model model)
			throws Exception {
		if (oldmanId > 0) {
			Oldman oldman = iOldmanService.findDetailOldmanById(oldmanId);
			model.addAttribute("oldman", oldman);
			return "oldfront/older/person/person_info";
		} else {
			return "oldfront/older/person/person_info";
		}
	}

	/**
	 * @Title: intoAcountManager
	 * @Description: 跳转到老人账户管理
	 * @param: @param oldmanId
	 * @param: @param model
	 * @param: @return
	 * @param: @throws Exception
	 * @return: String
	 * @throws
	 * @author: ym
	 * @date: 2017年11月23日 下午2:35:35
	 */
	@RequestMapping("/intoAcountManager")
	public String intoAcountManager(Integer oldmanId, Model model)
			throws Exception {
		if (oldmanId > 0) {
			Oldmanaccount oldmanaccount = iOldmanService
					.findOldmanaccountByOldmanId(oldmanId);
			model.addAttribute("oldmanaccount", oldmanaccount);
			System.out.println(">>>>>>>>>>>" + oldmanaccount);
			return "oldfront/older/person/user_manager";
		} else {
			return "oldfront/older/person/user_manager";
		}
	}

	/**
	 * @Title: modifyAcountInfo
	 * @Description: 修改老人数据
	 * @param @param oldman
	 * @param @param file
	 * @param @param request
	 * @param @return
	 * @param @throws Exception
	 * @return Msg
	 * @throws
	 * @author ym
	 * @date 2017年11月24日 上午1:17:43
	 */
	@RequestMapping("/modifyAcountInfo")
	@ResponseBody
	public Msg modifyAcountInfo(MultipartFile file, Oldman oldman,
			HttpServletRequest request) throws Exception {
		CommonsMultipartFile commonsMultipartFile = (CommonsMultipartFile) file;
		DiskFileItem fi = (DiskFileItem) commonsMultipartFile.getFileItem();
		File imgFile = fi.getStoreLocation();
		if (imgFile.exists()) {
			// 按照日期在oss里面创建文件夹
			OSSFileUtils.createFolder();
			// 删除原来的图片
			OSSFileUtils.deleteFile(oldman.getPhoto().substring(
					oldman.getPhoto().indexOf("com") + 3,
					oldman.getPhoto().length()));
			// 上传要修改的图片
			OSSJSON ossjson = OSSFileUtils.upload(OSSFileUtils.folderName()
					.substring(0, OSSFileUtils.folderName().length() - 1)
					+ "/"
					+ file.getOriginalFilename(), imgFile.getAbsolutePath());
			if (ossjson.getCode() == 0) {
				oldman.setPhoto(ossjson.getData().getAccess_url());
			}
		}
		int state = iOldmanService.modifyOldman(oldman);
		if (state != 0) {
			Oldmanaccount older = (Oldmanaccount) request.getSession()
					.getAttribute("older");
			older.setOldman(oldman);
			return Msg.success().add("msg", "更新数据成功");
		} else {
			return Msg.fail().add("msg", "更新数数据失败！");
		}
	}

	/**
	 * @Title: updateOldmanAcount
	 * @Description: TODO
	 * @param @param oldmanaccount
	 * @param @return
	 * @return Msg
	 * @throws
	 * @author ym
	 * @date 2017年11月24日 下午11:50:05
	 */
	@RequestMapping("/updateOldmanAcount")
	@ResponseBody
	public Msg updateOldmanAcount(Oldmanaccount oldmanaccount) {
		if (oldmanaccount != null) {
			int state = iOldmanService.modifyOldmanAccount(oldmanaccount);
			if (state != 0) {
				return Msg.success().add("msg", "修改成功");
			} else {
				return Msg.fail().add("msg", "修改失败！");
			}
		} else {
			return Msg.fail().add("msg", "插入数据有误");
		}
	}
}
