package com.older.manager.controller.oldback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("visit")
public class HealthVisitController {

	/**
	 * addvisitPlan.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/addvisitPlan")
	public String addvisitPlan() {
		return "oldback/healthManage/visit/addvisitPlan";
	}

	/**
	 * altervisititPlan.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/altervisititPlan")
	public String altervisititPlan() {
		return "oldback/healthManage/visit/altervisititPlan";
	}

	/**
	 * selectvisitPlan.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/selectvisitPlan")
	public String selectvisitPlan() {
		return "oldback/healthManage/visit/selectvisitPlan";
	}

	/**
	 * addvisitPlan.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/visitPlan")
	public String visitPlan() {
		return "oldback/healthManage/visit/visitPlan";
	}
}
