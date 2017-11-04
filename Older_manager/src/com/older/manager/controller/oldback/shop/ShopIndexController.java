package com.older.manager.controller.oldback.shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.older.manager.bean.OrderInfo;
import com.older.manager.service.oldback.shop.IShopIndexService;
import com.older.manager.utils.EchartData;
import com.older.manager.utils.Series;

@Controller
@RequestMapping("shop")
public class ShopIndexController {

	@Autowired
	private IShopIndexService shopIndexService;

	/**
	 * 统计订单信息
	 * 
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("/orderInfo")
	@ResponseBody
	public EchartData oldManBarDataRegion() {
		List<String> category = null;
		List<OrderInfo> serisData = null;
		List<String> legend = null;
		Map<String, Object> map = shopIndexService.getOrderAll();

		category = (List<String>) map.get("category");
		legend = (List<String>) map.get("legend");
		serisData = (List<OrderInfo>) map.get("serisData");

		List<Series> series = new ArrayList<Series>();// 纵坐标
		series.add(new Series("订单信息", "bar", serisData));
		EchartData data = new EchartData(legend, category, series);
		data.setSerie(serisData);
		return data;
	}
}
