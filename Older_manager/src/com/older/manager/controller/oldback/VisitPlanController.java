package com.older.manager.controller.oldback;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
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
import com.older.manager.bean.Visitplan;
import com.older.manager.service.oldback.IVisitPlanService;
import com.older.manager.utils.Msg;
import com.older.manager.utils.SaveFile;

@Controller
@RequestMapping("plan")
public class VisitPlanController {

	@Autowired
	private IVisitPlanService visitPlanService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, true));
	}; // true:允许输入空值，false:不能为空值

	/**
	 * 模糊查询返回json数据
	 * 
	 * @param pn
	 * @param str
	 * @return
	 * @throws UnsupportedEncodingException
	 */

	@RequestMapping("/selectAllOldBackPlan")
	@ResponseBody
	public Msg selectAllOldBackPlanWithJson(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			@RequestParam(value = "str", defaultValue = "") String str)
			throws Exception {
		PageHelper.startPage(pn, 5);
		List<Visitplan> allolder = visitPlanService
				.selectAllOldBackPlan(new String(str.getBytes("iso-8859-1"),
						"utf-8"));
		PageInfo<Visitplan> pageInfo = new PageInfo<Visitplan>(allolder, 5);
		return Msg.success().add("pageInfo", pageInfo);

	}

	/**
	 * 批量删除
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "/deleteAllVisitPlan/{ids}", method = RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteEmp(@PathVariable("ids") String ids) {
		if (ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<Integer>();
			String[] str_ids = ids.split("-");

			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			visitPlanService.deleteBatch(del_ids);
		} else {
			Integer id = Integer.parseInt(ids);
			visitPlanService.deletePlan(id);
		}

		return Msg.success();
	}

	@RequestMapping("/selectvisitPlan/{itemPlan}")
	public String selectvisitPlan(@PathVariable("itemPlan") String itemPlan,
			Model model) {
		try {
			itemPlan = new String(itemPlan.getBytes("iso-8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String s[] = itemPlan.split(":");
		int id = Integer.parseInt(s[0]);
		Visitplan visitplan = visitPlanService.selectVisitPlanById(id);
		Oldman oldman = new Oldman();
		oldman.setName(s[1]);
		oldman.setIdcar(s[2]);
		visitplan.setOldman(oldman);
		model.addAttribute("visitplan", visitplan);
		return "oldback/healthManage/visit/selectvisitPlan";
	}

	@RequestMapping("/addVisitPlan")
	public String addVisitPlan(@Valid Visitplan visitplan,
			BindingResult result, MultipartFile file, HttpServletRequest request) {
		System.out.println(visitplan.toString());
		List<Map<String, Object>> errorList = new ArrayList<Map<String, Object>>();
		if (result.hasErrors()) {
			for (FieldError fieldError : result.getFieldErrors()) {
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("fieldName", fieldError.getField());
				map.put("errorMessage", fieldError.getDefaultMessage());
				errorList.add(map);
				System.out.println("出错的字段名为:------------->"
						+ fieldError.getField());
				System.out.println("出错信息为:---------------->"
						+ fieldError.getDefaultMessage());
			}
		} else {
			String imgUrl = null;
			if (file != null) {
				try {
					imgUrl = SaveFile.saveImg(file, request);
				} catch (IllegalStateException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (visitplan != null) {
				visitplan.setImages(imgUrl);
				visitPlanService.addVisitPlan(visitplan);
			}

			return "oldback/healthManage/visit/visitPlan";
		}
		request.setAttribute("errorList", errorList);
		return "oldback/healthManage/visit/addvisitPlan";
	}
}
