package com.older.manager.service.impl.oldback.shop;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.older.manager.bean.MarkPoint;
import com.older.manager.bean.OrderInfo;
import com.older.manager.bean.Orders;
import com.older.manager.bean.OrdersExample;
import com.older.manager.bean.OrdersExample.Criteria;
import com.older.manager.mapper.OrdersMapper;
import com.older.manager.service.oldback.shop.IShopIndexService;

@Service
public class ShopIndexServiceImpl implements IShopIndexService {

	@Autowired
	private OrdersMapper ordersMapper;

	/**
	 * 统计订单信息
	 */
	@Override
	public Map<String, Object> getOrderAll() {
		Map<String, Object> map = new HashMap<String, Object>();

		List<String> legend = new ArrayList<String>();
		legend.add("所有订单");
		legend.add("待付款");
		legend.add("已付款");
		legend.add("待发货");
		map.put("legend", legend);

		List<String> category = new ArrayList<String>();
		category.add("1月");
		category.add("2月");
		category.add("3月");
		category.add("4月");
		category.add("5月");
		category.add("6月");
		category.add("7月");
		category.add("8月");
		category.add("9月");
		category.add("10月");
		category.add("11月");
		category.add("12月");
		map.put("category", category);

		List<OrderInfo> serisData = new ArrayList<OrderInfo>();
		for (int i = 0; i < legend.size(); i++) {
			OrderInfo orderInfo = new OrderInfo();
			orderInfo.setName(legend.get(i));
			orderInfo.setType("bar");
			List<BigInteger> datas = new ArrayList<BigInteger>();
			for (int j = 0; j < category.size(); j++) {
				BigInteger data = this.getOrderNum(legend.get(i),
						category.get(j));
				datas.add(data);
			}
			orderInfo.setData(datas);

			List<MarkPoint> markPoints = new ArrayList<MarkPoint>();
			BigInteger maxValue = datas.get(0);
			int maxIndex = 0;
			BigInteger minValue = datas.get(0);
			int minIndex = 0;

			for (int j = 0; j < datas.size(); j++) {
				if (maxValue.intValue() < datas.get(j).intValue()) {
					maxValue = datas.get(j);
					maxIndex = i;
				}
				if (minValue.intValue() > datas.get(j).intValue()) {
					minValue = datas.get(j);
					minIndex = i;
				}
			}

			MarkPoint markHighPoint = new MarkPoint();
			markHighPoint.setName("年最高");
			markHighPoint.setSymbolSize(18);
			markHighPoint.setValue(maxValue.intValue());
			markHighPoint.setxAxis(maxIndex);
			markHighPoint.setyAxis(maxValue.intValue());
			markPoints.add(markHighPoint);

			MarkPoint marklowerPoint = new MarkPoint();
			marklowerPoint.setName("年最低");
			marklowerPoint.setyAxis(3);
			marklowerPoint.setValue(minValue.intValue());
			marklowerPoint.setxAxis(minIndex);
			markPoints.add(marklowerPoint);

			orderInfo.setMarkPoint(markPoints);
			serisData.add(orderInfo);
		}
		for (int i = 0; i < serisData.size(); i++) {
			System.out
					.println("------------------------------------------------");
			System.out.println(serisData.get(i).toString());
		}
		map.put("serisData", serisData);
		return map;
	}

	/**
	 * 通过状态和月份查询订单
	 * 
	 * @param name
	 * @param month
	 * @return
	 */
	@SuppressWarnings("deprecation")
	private BigInteger getOrderNum(String state, String month) {
		OrdersExample example = new OrdersExample();
		Criteria criteria = example.createCriteria();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
		String date = simpleDateFormat.format(new Date());
		String s[] = date.split("-");
		month = month.substring(0, month.indexOf("月"));
		if (Integer.parseInt(month) < 10) {
			month = "0" + month;
		}
		date = s[0] + "-" + month;
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd");
		try {
			criteria.andCreattimeBetween(simple.parse(date + "-" + "01"),
					simple.parse(date + "-" + "30"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		List<Orders> orders = null;
		if (!state.equals("所有订单")) {
			criteria.andStateEqualTo(state);
			orders = ordersMapper.selectByExample(example);
		} else {
			orders = ordersMapper.selectByExample(null);
		}
		BigInteger sum = BigInteger.valueOf(0);
		if (orders != null) {
			for (Orders orders2 : orders) {
				sum = sum
						.add(BigInteger.valueOf(orders2.getCost().longValue()));
			}
			return sum;
		}
		return BigInteger.valueOf(0);
	}
}
