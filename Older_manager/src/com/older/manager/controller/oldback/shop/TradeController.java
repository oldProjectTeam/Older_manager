package com.older.manager.controller.oldback.shop;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Activity;
import com.older.manager.bean.OrderRatio;
import com.older.manager.bean.Orders;
import com.older.manager.bean.ProductType;
import com.older.manager.service.oldback.shop.ITradeService;
import com.older.manager.utils.Msg;
import com.older.manager.utils.TableData;

@Controller
@RequestMapping("order")
public class TradeController {
	@Autowired
	private ITradeService tradeService;

	@RequestMapping("/orderform")
	public String order() {
		return "oldback/oldbackshopping/Orderform";
	}

	/**
	 * 电商后台订单管理
	 * 
	 * @return
	 */
	@RequestMapping("/orderRatio")
	@ResponseBody
	public Msg Orderform() {
		List<OrderRatio> list = new ArrayList<OrderRatio>();
		// 查询出所有的产品类型出来
		List<ProductType> productTypes = tradeService
				.queryAllTypeOfProductType();
		// 查询出全部的订单出来
		List<Orders> orders = tradeService.queryAllOrders();
		// List<Products> products=tradeService.queryAllProducts();
		// 查询出产品类型对应的订单数量
		for (ProductType productType : productTypes) {
			OrderRatio orderRatio = new OrderRatio();
			orderRatio.setOrderOfType(productType.getName());
			// 查询出产品的id
			List<Integer> productIds = tradeService
					.queryAllProductIdsOfProductTypeId(productType.getId());
			// 查询出订单明细id
			List<Integer> orderDetailsId = tradeService
					.queryOrdersIdOfProductIds(productIds);
			orderRatio.setOrderOfTypeNum(orderDetailsId.size());
			double ratio = ((double) orderDetailsId.size() / orders.size()) * 100;
			DecimalFormat df = new DecimalFormat("######0.0000");
			orderRatio.setOrderRatio(df.format(ratio));
			list.add(orderRatio);
		}
		if (list.size() > 0) {
			return Msg.success().add("list", list);
		}
		return Msg.fail();
	}

	@RequestMapping("/queryAllOrderWithJson")
	@ResponseBody
	public Msg queryAllOrderWithJson(@RequestParam("pn") Integer pn) {
		PageHelper.startPage(pn, 10);
		List<Orders> orders = tradeService.queryAllOrderWithJson();
		PageInfo<Orders> pageInfo = new PageInfo<Orders>(orders);
		return Msg.success().add("pageInfo", pageInfo);
	}

	@RequestMapping("/search")
	@ResponseBody
	public Msg search(@RequestParam("pn") Integer pn,
			@RequestParam("id") String id, @RequestParam("time") String time) {
		try {
			id = new String(id.getBytes("ISO-8859-1"), "utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		PageHelper.startPage(pn, 10);
		List<Orders> orders = tradeService.search(id, time);
		PageInfo<Orders> pageInfo = new PageInfo<Orders>(orders);
		if (orders.size()>0) {
			return Msg.success().add("pageInfo", pageInfo);
		}else {
			return Msg.fail();
		}
	}
}
