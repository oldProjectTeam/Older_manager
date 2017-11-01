package com.older.manager.controller.oldback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("physical")
public class HealthPhysicalController {

	/**
	 * addPEInfo.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/addPEInfo")
	public String addPEInfo() {
		return "oldback/healthManage/physical/addPEInfo";
	}

	/**
	 * alterPEInfo.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/alterPEInfo")
	public String alterPEInfo() {
		return "oldback/healthManage/physical/alterPEInfo";
	}

	/**
	 * PEInfo.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/PEInfo")
	public String PEInfo() {
		return "oldback/healthManage/physical/PEInfo";
	}

	/**
	 * selectPEInfo.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/selectPEInfo")
	public String selectPEInfo() {
		return "oldback/healthManage/physical/selectPEInfo";
	}
}
