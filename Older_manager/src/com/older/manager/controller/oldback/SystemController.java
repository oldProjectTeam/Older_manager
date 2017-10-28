package com.older.manager.controller.oldback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SystemController {

	/**
	 * operation_log.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/operation_log")
	public String operation_log() {
		return "oldback/systemManage/operation_log";
	}

	/**
	 * systemManageindex.jsp
	 * 
	 * @return
	 */
	@RequestMapping("/systemManageindex")
	public String systemManageindex() {
		return "oldback/systemManage/systemManageindex";
	}
}
