package com.older.manager.controller.oldback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("drug")
public class HealthDrugController {

	/**
	 * addtakeDrugDetails.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/addtakeDrugDetails")
	public String addtakeDrugDetails() {
		return "oldback/healthManage/drug/addtakeDrugDetails";
	}

	/**
	 * altertakeDrug.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/altertakeDrug")
	public String altertakeDrug() {
		return "oldback/healthManage/drug/altertakeDrug";
	}

	/**
	 * selecttakeDrug.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/selecttakeDrug")
	public String selecttakeDrug() {
		return "oldback/healthManage/drug/selecttakeDrug";
	}

	/**
	 * takeDrugDetails.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/takeDrugDetails")
	public String takeDrugDetails() {
		return "oldback/healthManage/drug/takeDrugDetails";
	}
}
