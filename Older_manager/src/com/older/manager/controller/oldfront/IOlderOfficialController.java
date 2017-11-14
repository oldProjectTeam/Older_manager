package com.older.manager.controller.oldfront;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.older.manager.service.oldfront.IOlderOfficialService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("official")
public class IOlderOfficialController {

	@Autowired
	private IOlderOfficialService officialService;

	@RequestMapping("/info")
	@ResponseBody
	public Msg info() {
		Map<String, Object> map = officialService.info();
		if (map != null) {
			return Msg.success().add("map", map);
		}
		return Msg.fail();
	}
}
