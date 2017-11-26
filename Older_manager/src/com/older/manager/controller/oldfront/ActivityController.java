package com.older.manager.controller.oldfront;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Activity;
import com.older.manager.bean.Takeactivity;
import com.older.manager.service.oldfront.IActivityService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("activity")
public class ActivityController {

	@Autowired
	private IActivityService activityService;

	@RequestMapping("/joinActivityWithOldMan")
	@ResponseBody
	public Msg joinActivityWithOldMan(
			@RequestParam("activityId") Integer activityId,
			@RequestParam("oldManId") Integer oldManId) {
		boolean flag = activityService.joinActivityWithOldMan(activityId,
				oldManId);
		if (flag) {
			return Msg.success();
		} else {
			return Msg.fail();
		}
	}

	/**
	 * @Title: findTakeActivityBySearch
	 * @Description: 根据时间来搜索参加活动详细信息
	 * @param @param pn
	 * @param @param oldManId
	 * @param @param startTime
	 * @param @param endTime
	 * @param @return
	 * @return Msg
	 * @throws
	 * @author ym
	 * @date 2017年11月26日 上午11:33:58
	 */
	@RequestMapping("/findTakeActivityBySearch")
	@ResponseBody
	public Msg findTakeActivityBySearch(@RequestParam("pn") Integer pn,
			@RequestParam("oldManId") Integer oldManId,
			@RequestParam("startTime") String startTime,
			@RequestParam("endTime") String endTime) {
		PageHelper.startPage(pn, 12);
		Takeactivity takeactivity = new Takeactivity();
		Activity activity = new Activity();
		if (oldManId != null && oldManId != 0) {
			takeactivity.setOldmanId(oldManId);
		}
		;
		if (startTime != null && !startTime.equals("")) {
			activity.setActivity2(startTime);
		}
		;
		if (endTime != null && !endTime.equals("")) {
			activity.setActivity3(endTime);
		}
		;
		takeactivity.setActivity(activity);
		List<Takeactivity> list = activityService
				.findAllTakeactivitiesBySearch(takeactivity);
		PageInfo<Takeactivity> pageInfo = new PageInfo<Takeactivity>(list, 6);
		if (list != null && list.size() > 0) {
			return Msg.success().add("pageInfo", pageInfo);
		} else {
			return Msg.fail().add("msg", "查询不到数据");
		}
	}
}
