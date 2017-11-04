package com.older.manager.controller.oldback;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.older.manager.bean.Oldman;
import com.older.manager.service.oldback.IOldManCountService;
import com.older.manager.utils.EchartData;
import com.older.manager.utils.Series;

@Controller
@RequestMapping("data")
public class DataCountController {

	@Autowired
	private IOldManCountService oldManCountService;

	@RequestMapping("/oldDataCount")
	public String oldDataCount() {
		return "oldback/dataCount/oldDataCount";
	}

	/**
	 * 统计老人数据，饼状图
	 * 
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("/oldManPieData")
	@ResponseBody
	public EchartData oldManPieData() {
		List<String> legend = null;
		List<Map> serisData = null;
		Map<String, Object> map = oldManCountService.getAll();
		// 年龄阶段
		legend = (List<String>) map.get("legend");
		serisData = (List<Map>) map.get("serisData");
		List<Series> series = new ArrayList<Series>();// 纵坐标
		series.add(new Series("老人数据", "pie", serisData));
		EchartData data = new EchartData(legend, null, series);
		return data;
	}

	/**
	 * 统计老人数据，柱状图
	 * 
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("/oldManBarData")
	@ResponseBody
	public EchartData oldManBarData() {
		List<String> category = null;
		List<Map> serisData = null;
		Map<String, Object> map = oldManCountService.getAll();
		// 年龄阶段
		category = (List<String>) map.get("legend");
		serisData = (List<Map>) map.get("serisData");
		List<Long> serisDatas = new ArrayList<Long>();
		for (int i = 0; i < serisData.size(); i++) {
			Integer value = (Integer) serisData.get(i).get("value");
			serisDatas.add(value.longValue());
		}
		List<String> legend = new ArrayList<String>(
				Arrays.asList(new String[] { "老人数据" }));// 数据分组
		List<Series> series = new ArrayList<Series>();// 纵坐标
		series.add(new Series("老人数据", "bar", serisDatas));
		EchartData data = new EchartData(legend, category, series);
		return data;
	}

	/**
	 * 统计老人数据,按照地区,饼状图
	 * 
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("/oldManPieDataRegion")
	@ResponseBody
	public EchartData oldManPieDataRegion() {
		List<String> legend = null;
		List<Map> serisData = null;
		Map<String, Object> map = oldManCountService.getOldManAll();
		// 年龄阶段
		legend = (List<String>) map.get("legend");
		serisData = (List<Map>) map.get("serisData");
		List<Series> series = new ArrayList<Series>();// 纵坐标
		series.add(new Series("老人数据", "pie", serisData));
		EchartData data = new EchartData(legend, null, series);
		return data;
	}

	/**
	 * 统计老人数据,按照地区分布,柱状图
	 * 
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("/oldManBarDataRegion")
	@ResponseBody
	public EchartData oldManBarDataRegion() {
		List<String> category = null;
		List<Map> serisData = null;
		Map<String, Object> map = oldManCountService.getOldManAll();
		// 年龄阶段
		category = (List<String>) map.get("legend");
		serisData = (List<Map>) map.get("serisData");
		List<Long> serisDatas = new ArrayList<Long>();
		for (int i = 0; i < serisData.size(); i++) {
			Integer value = (Integer) serisData.get(i).get("value");
			serisDatas.add(value.longValue());
		}
		List<String> legend = new ArrayList<String>(
				Arrays.asList(new String[] { "老人数据" }));// 数据分组
		List<Series> series = new ArrayList<Series>();// 纵坐标
		series.add(new Series("老人数据", "bar", serisDatas));
		EchartData data = new EchartData(legend, category, series);
		return data;
	}
}
