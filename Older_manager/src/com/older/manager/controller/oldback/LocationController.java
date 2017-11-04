package com.older.manager.controller.oldback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("location")
public class LocationController {

	@RequestMapping("/navagtion")
	public String navagtion() {
		return "oldback/location/navagtion";
	}
}
