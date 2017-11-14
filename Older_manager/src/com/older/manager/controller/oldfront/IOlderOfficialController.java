package com.older.manager.controller.oldfront;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Activity;
import com.older.manager.bean.Courses;
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
		PageHelper.startPage(1, 10);
		Map<String, Object> map = officialService.info();
		@SuppressWarnings("unchecked")
		PageInfo<Activity> activityPageInfo = new PageInfo<Activity>(
				(List<Activity>) map.get("activities"));
		if (map.size() > 0) {
			return Msg.success().add("activityPageInfo", activityPageInfo);
		}
		return Msg.fail();
	}
}
