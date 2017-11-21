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
	
	@RequestMapping("/personInfo")
	public String personInfo() {
		return "oldfront/older/person/personInfo";
	}
	
	@RequestMapping("/changePassword")
	public String changePassword() {
		return "oldfront/older/person/changePassword";
	}
	
	@RequestMapping("/oldmanModify")
	public String oldmanModify() {
		return "oldfront/older/person/oldmanModify";
	}
	@RequestMapping("/oldManHealthInfo")
	public String oldManHealthInfo() {
		return "oldfront/older/person/oldManHealthInfo";
	}
	
	@RequestMapping("/healthReport")
	public String healthReport() {
		return "oldfront/older/person/healthReport";
	}
	
	@RequestMapping("/peinfoView")
	public String peinfoView() {
		return "oldfront/older/person/peinfoView";
	}
	
	@RequestMapping("/visiting_record")
	public String visiting_record() {
		return "oldfront/older/person/visiting_record";
	}
	
	@RequestMapping("/visiting_view")
	public String visiting_view() {
		return "oldfront/older/person/visiting_view";
	}
	
	@RequestMapping("/takeDrug")
	public String takeDrug() {
		return "oldfront/older/person/takeDrug";
	}
	
	@RequestMapping("/takeDrugView")
	public String takeDrugView() {
		return "oldfront/older/person/takeDrugView";
	}
	
	@RequestMapping("/useHealth")
	public String useHealth() {
		return "oldfront/older/person/useHealth";
	}
	@RequestMapping("/use_health_view")
	public String use_health_view() {
		return "oldfront/older/person/use_health_view";
	}
	
	@RequestMapping("/sms")
	public String sms() {
		return "oldfront/older/person/sms";
	}
	@RequestMapping("/sms_view")
	public String sms_view() {
		return "oldfront/older/person/sms_view";
	}
	@RequestMapping("/notice")
	public String notice() {
		return "oldfront/older/person/notice";
	}
	
	@RequestMapping("/notice_view")
	public String notice_view() {
		return "oldfront/older/person/notice_view";
	}
	
	/**
	 * 老人个人中心活动管理
	 * @return
	 */
	@RequestMapping("/activitymanager")
	public String activitymanager() {
		return "oldfront/older/person/activity";
	}
	
	@RequestMapping("/activity_view")
	public String activity_view() {
		return "oldfront/older/person/activity_view";
	}
	
	@RequestMapping("/activity_recom")
	public String activity_recom() {
		return "oldfront/older/person/activity_recom";
	}
	@RequestMapping("/myCourse")
	public String myCourse() {
		return "oldfront/older/person/myCourse";
	}
	@RequestMapping("/myVideo")
	public String myVideo() {
		return "oldfront/older/person/myVideo";
	}
}
