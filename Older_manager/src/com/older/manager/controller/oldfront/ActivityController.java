package com.older.manager.controller.oldfront;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.older.manager.service.oldfront.IActivityService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("activity")
public class ActivityController {

	@Autowired
	private IActivityService activityService;
	
	@RequestMapping("/joinActivityWithOldMan")
	@ResponseBody
	public Msg joinActivityWithOldMan(@RequestParam("activityId")Integer activityId,@RequestParam("oldManId")Integer oldManId){
		boolean flag=activityService.joinActivityWithOldMan(activityId,oldManId);
		if (flag) {
			return Msg.success();
		}else {
			return Msg.fail();
		}
	}
}
