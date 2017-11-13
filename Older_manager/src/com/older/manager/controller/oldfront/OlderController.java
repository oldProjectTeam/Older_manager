package com.older.manager.controller.oldfront;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("older")
public class OlderController {

	@RequestMapping("/about")
	public String about(){
		return "oldfront/older/about";
	}
	
	@RequestMapping("/activity")
	public String activity(){
		return "oldfront/older/activity";
	}
	
	@RequestMapping("/blank")
	public String blank(){
		return "oldfront/older/blank";
	}
	
	@RequestMapping("/contact")
	public String contact(){
		return "oldfront/older/contact";
	}
	
	@RequestMapping("/download")
	public String download(){
		return "oldfront/older/download";
	}
	
	@RequestMapping("/features")
	public String features(){
		return "oldfront/older/features";
	}
	
	@RequestMapping("/index")
	public String index(){
		return "oldfront/older/index";
	}
	
	@RequestMapping("/video")
	public String video(){
		return "oldfront/older/video";
	}
	
	
	@RequestMapping("/oldabout")
	public String shopping(){
		return "oldfront/old/about";
	}
}
