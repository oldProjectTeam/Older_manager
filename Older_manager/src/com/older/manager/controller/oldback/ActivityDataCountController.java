package com.older.manager.controller.oldback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.older.manager.service.oldback.IActivityCountService;
import com.older.manager.utils.EchartData;
import com.older.manager.utils.Series;

@Controller
@RequestMapping("activity")
public class ActivityDataCountController {

	@Autowired
	private IActivityCountService activityCountService;
	
	@RequestMapping("/activityDataCount")
	public String activityData(){
		return "oldback/dataCount/activityDataCount";
	}
	
	/**
	 * 统计老人数据，柱状图
	 * 
	 * @return
	 */
	@RequestMapping("/activityBarData")
	@ResponseBody
	public EchartData oldManBarData() {
		List<String> category = null;
		List<Map> serisData = null;
		Map<String, Object> map = activityCountService.getAll();
		// 年龄阶段
		category = (List<String>) map.get("legend");
		serisData = (List<Map>) map.get("serisData");
		List<Long> serisDatas = new ArrayList<Long>();
		for (int i = 0; i < serisData.size(); i++) {
			Integer value = (Integer) serisData.get(i).get("value");
			serisDatas.add(value.longValue());
		}
		List<String> legend = new ArrayList<String>(
				Arrays.asList(new String[] { "活动数据" }));// 数据分组
		List<Series> series = new ArrayList<Series>();// 纵坐标
		series.add(new Series("活动数据", "bar", serisDatas));
		EchartData data = new EchartData(legend, category, series);
		return data;
	}
}
