package com.older.manager.controller.oldfront;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("older")
public class OlderController {

	@RequestMapping("/about")
	public String about() {
		return "oldfront/older/about";
	}

	@RequestMapping("/activity")
	public String activity() {
		return "oldfront/older/activity";
	}

	@RequestMapping("/blank")
	public String blank() {
		return "oldfront/older/blank";
	}

	@RequestMapping("/contact")
	public String contact() {
		return "oldfront/older/contact";
	}

	@RequestMapping("/download")
	public String download() {
		return "oldfront/older/download";
	}

	@RequestMapping("/features")
	public String features() {
		return "oldfront/older/features";
	}

	@RequestMapping("/index")
	public String index() {
		return "oldfront/older/index";
	}

	@RequestMapping("/video")
	public String video() {
		return "oldfront/older/video";
	}

	@RequestMapping("/register")
	public String register() {
		return "oldfront/older/person/register";
	}

	@RequestMapping("/login")
	public String login() {
		return "oldfront/older/person/login";
	}
	
	@RequestMapping("/allcourse")
	public String personInfo() {
		return "oldfront/older/person/allcourse";
	}
	
	@RequestMapping("/course_detail")
	public String changePassword() {
		return "oldfront/older/person/course_detail";
	}
	
	@RequestMapping("/health")
	public String oldmanModify() {
		return "oldfront/older/person/health";
	}
	@RequestMapping("/jibing")
	public String oldManHealthInfo() {
		return "oldfront/older/person/jibing";
	}
	
	@RequestMapping("/jiuzhen")
	public String healthReport() {
		return "oldfront/older/person/jiuzhen";
	}
	
	@RequestMapping("/lvli")
	public String peinfoView() {
		return "oldfront/older/person/lvli";
	}
	
	@RequestMapping("/myactivity")
	public String visiting_record() {
		return "oldfront/older/person/myactivity";
	}
	
	@RequestMapping("/mycourse")
	public String visiting_view() {
		return "oldfront/older/person/mycourse";
	}
	
	@RequestMapping("/older")
	public String takeDrug() {
		return "oldfront/older/person/older";
	}
	
	@RequestMapping("/person_info")
	public String takeDrugView() {
		return "oldfront/older/person/person_info";
	}
	
	@RequestMapping("/person")
	public String useHealth() {
		return "oldfront/older/person/person";
	}
	@RequestMapping("/pinggu")
	public String use_health_view() {
		return "oldfront/older/person/pinggu";
	}
	
	@RequestMapping("/recomActivity")
	public String sms() {
		return "oldfront/older/person/recomActivity";
	}
	@RequestMapping("/shoushu")
	public String sms_view() {
		return "oldfront/older/person/shoushu";
	}
	@RequestMapping("/shuye")
	public String notice() {
		return "oldfront/older/person/shuye";
	}
	
	@RequestMapping("/takeDrug")
	public String notice_view() {
		return "oldfront/older/person/takeDrug";
	}
	
	 
	@RequestMapping("/tijian")
	public String activitymanager() {
		return "oldfront/older/person/tijian";
	}
	
	@RequestMapping("/tiwen")
	public String activity_view() {
		return "oldfront/older/person/tiwen";
	}
	
	@RequestMapping("/tizhong")
	public String activity_recom() {
		return "oldfront/older/person/tizhong";
	}
	@RequestMapping("/user_manager")
	public String myCourse() {
		return "oldfront/older/person/user_manager";
	}
	@RequestMapping("/waishang")
	public String myVideo() {
		return "oldfront/older/person/waishang";
	}
	@RequestMapping("/xueya")
	public String xueya() {
		return "oldfront/older/person/xueya";
	}
	@RequestMapping("/yichuan")
	public String yichuan() {
		return "oldfront/older/person/yichuan";
	}
}
