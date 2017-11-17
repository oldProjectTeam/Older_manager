package com.older.manager.shopfront.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.ProductsViews;
import com.older.manager.service.oldback.shop.ProductsViewsService;
import com.older.manager.service.shopfront.IProductsViewsService;
import com.older.manager.utils.Msg;

@Controller
public class ProductsViewsController {
	@Autowired
	private IProductsViewsService productsViewsService;
	
	@RequestMapping("/queryProductsViewsInfo")
	@ResponseBody
	public Msg queryProductsViewsInfo(@RequestParam(value="pn",defaultValue="1")String pn){
		int p=Integer.parseInt(pn);
		PageHelper.startPage(p,15);
		List<ProductsViews> productsViews=productsViewsService.queryProductsViews();
		PageInfo pageInfo=new PageInfo(productsViews,5);
		return Msg.success().add("pageInfo", pageInfo);
	}
	
	//删除
	@RequestMapping("/deleteProductsViews/{productsview_id}")
	@ResponseBody
	public Msg deleteProductsViews(@PathVariable("productsViewid")Integer productsViewid){
		if(productsViewid!=null){
			productsViewsService.deleteProductsViews(productsViewid);
			return Msg.success();
		}
		return Msg.fail();
	}
}
