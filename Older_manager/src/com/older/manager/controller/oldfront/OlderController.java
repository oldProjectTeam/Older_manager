package com.older.manager.controller.oldfront;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Assess;
import com.older.manager.service.oldfront.IAssessService;

@Controller
@RequestMapping("older")
public class OlderController {

	@Autowired
	private IAssessService assessService;

	@RequestMapping("/about")
	public String about() {
		return "oldfront/older/about";
	}

	@RequestMapping("/video_list")
	public String video_list() {
		return "oldfront/older/video_list";
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

	@RequestMapping("/pinggu/{pn}&{oldManId}")
	public String use_health_view(@PathVariable("pn") Integer pn,
			@PathVariable("oldManId") Integer oldManId, Model model) {
		PageHelper.startPage(pn, 10);
		List<Assess> list = assessService.queryAssessByOldManId(oldManId);
		PageInfo<Assess> pageInfo = new PageInfo<Assess>(list, 6);
		model.addAttribute("pageInfo", pageInfo);
		return "oldfront/older/person/pinggu";
	}

	@RequestMapping("/recomActivity")
	public String recomActivity() {
		return "oldfront/older/person/recomActivity";
	}

	@RequestMapping("/shoushu")
	public String sms_view() {
		return "oldfront/older/person/shoushu";
	}

	@RequestMapping("/shuye")
	public String shuye() {
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
	
	@RequestMapping("/sms")
	public String sms() {
		return "oldfront/older/person/sms";
	}
	

	@RequestMapping("/notice")
	public String notice() {
		return "oldfront/older/person/notice";
	}
	
	@RequestMapping("/notice_detail/{id}")
	public String notice_dettail(@PathVariable("id")String id,Model model) {
		model.addAttribute("noticeId",id);
		return "oldfront/older/person/notice_detail";
	}
	@RequestMapping("/sms_detail/{id}")
	public String sms_detail(@PathVariable("id")String id,Model model) {
		model.addAttribute("smsId",id);
		return "oldfront/older/person/sms_detail";
	}
}
