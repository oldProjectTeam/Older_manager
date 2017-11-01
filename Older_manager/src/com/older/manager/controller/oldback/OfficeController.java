package com.older.manager.controller.oldback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OfficeController {

	/**
	 * activityinformation.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/activityinformation")
	public String activityinformation() {
		return "oldback/officemanage/activityinformation";
	}

	/**
	 * activitymanager.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/activitymanager")
	public String activitymanager() {
		return "oldback/officemanage/activitymanager";
	}

	/**
	 * addressbookmanager.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/addressbookmanager")
	public String addressbookmanager() {
		return "oldback/officemanage/addressbookmanager";
	}

	/**
	 * clanaddressmanager.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/clanaddressmanager")
	public String clanaddressmanager() {
		return "oldback/officemanage/clanaddressmanager";
	}

	/**
	 * informnotice.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/informnotice")
	public String informnotice() {
		return "oldback/officemanage/noticeManager";
	}

	/**
	 * noteinformation.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/noteinformation")
	public String noteinformation() {
		return "oldback/officemanage/noteinformation";
	}

	/**
	 * noticeinformation.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/noticeinformation")
	public String noticeinformation() {
		return "oldback/officemanage/noticeinformation";
	}

	/**
	 * page.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/page")
	public String page() {
		return "oldback/officemanage/page";
	}

	/**
	 * sendactivity.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/sendactivity")
	public String sendactivity() {
		return "oldback/officemanage/sendactivity";
	}

	/**
	 * sendnotice.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/sendnotice")
	public String sendnotice() {
		return "oldback/officemanage/sendnotice";
	}

	/**
	 * sendrecord.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/sendrecord")
	public String sendrecord() {
		return "oldback/officemanage/sendrecord";
	}

	/**
	 * sendsms.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/sendsms")
	public String sendsms() {
		return "oldback/officemanage/sendsms";
	}
}
