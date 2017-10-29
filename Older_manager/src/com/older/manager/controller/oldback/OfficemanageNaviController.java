package com.older.manager.controller.oldback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/officemanage")
public class OfficemanageNaviController {

	@RequestMapping("/officemanageIndex")
	public String officemanageIndex(){
		return "/oldback/officemanage/page";
	}
}
