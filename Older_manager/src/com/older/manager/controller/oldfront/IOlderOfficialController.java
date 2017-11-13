package com.older.manager.controller.oldfront;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.older.manager.service.oldfront.IOlderOfficialService;

@Controller
@RequestMapping("/official")
public class IOlderOfficialController {

	@Autowired
	private IOlderOfficialService officialService;
}
