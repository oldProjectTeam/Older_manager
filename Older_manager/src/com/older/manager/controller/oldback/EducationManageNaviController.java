package com.older.manager.controller.oldback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

 

@Controller
@RequestMapping("/education")
public class EducationManageNaviController {

	/**
	 * 左侧导航栏教育管理功能预览页面
	 * @return
	 */
	@RequestMapping("/educationIndex")
	public ModelAndView leftIndex(){
		ModelAndView modelAndView=new ModelAndView("oldback/educationManage/educationIndex");
		return modelAndView;
	}
	 
}
