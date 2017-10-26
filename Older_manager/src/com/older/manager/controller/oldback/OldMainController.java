package com.older.manager.controller.oldback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OldMainController {

	@RequestMapping("/oldBackMain")
	public String oldBackMain(){
		return "oldback/oldbackMain/main";
	}
	@RequestMapping("/left")
	public String oldBackLeft(){
		return "oldback/oldbackMain/left";
	}
	@RequestMapping("/top")
	public String oldBackTop(){
		return "oldback/oldbackMain/top";
	}
	@RequestMapping("/oldManInfoView")
	public String oldBackDefault(){
		return "oldback/oldManInfoMange/oldManInfoView";
	}
}
