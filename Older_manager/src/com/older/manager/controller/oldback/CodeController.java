package com.older.manager.controller.oldback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeController {

	@RequestMapping("/validatecode")
	public String code() {
		return "oldback/code/validatecode";
	}
}
