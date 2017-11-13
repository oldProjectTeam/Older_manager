package com.older.manager.controller.oldback.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/about")
	public String about(){
		return "oldfront/home/about";
	}
	
	@RequestMapping("/aboutus")
	public String abouttus(){
		return "oldfront/home/aboutus";
	}
	@RequestMapping("/shopping")
	public String shopping(){
		return "oldfront/home/shopping";
	}
}
