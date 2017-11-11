package com.older.manager.controller.oldback.shop;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

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

	/**
	 * 电商后台订单管理
	 * 
	 * @return
	 */
	@RequestMapping("/Orderform")
	public String Orderform(@RequestParam("pn") Integer pn,Model model) {
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
		PageHelper.startPage(pn, 10);
		List<Orders> orderlList = tradeService.queryAllOrderWithJson();
		PageInfo<Orders> pageInfo = new PageInfo<Orders>(orderlList);
		model.addAttribute("list", list);
		model.addAttribute("pageInfo", pageInfo);
		return "oldback/oldbackshopping/Orderform";
	}

	@RequestMapping("/queryAllOrderWithJson")
	@ResponseBody
	public Msg queryAllOrderWithJson(@RequestParam("pn") Integer pn) {
		PageHelper.startPage(pn, 10);
		List<Orders> orders = tradeService.queryAllOrderWithJson();
		PageInfo<Orders> pageInfo = new PageInfo<Orders>(orders);
		return Msg.success().add("pageInfo", pageInfo);
	}
}
