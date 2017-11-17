package com.older.manager.shopfront.controller;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.Brand;
import com.older.manager.bean.BrandWithBLOBs;
import com.older.manager.bean.ProductKeyword;
import com.older.manager.bean.ProductType;
import com.older.manager.bean.Products;
import com.older.manager.bean.ShoppingCart;
import com.older.manager.service.shopfront.CollectionService;
import com.older.manager.utils.Msg;

@Controller
public class CollectionController {
	@Autowired
	private CollectionService collectionService;

	/**
	 * 查询商品
	 * */
	@RequestMapping("/select")
	@ResponseBody
	public Msg queryProducts(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		PageHelper.startPage(pn, 15);
		List<Products> products = collectionService.queryProducts();
		PageInfo pageInfo = new PageInfo(products);
		return Msg.success().add("pageInfo", pageInfo);
	}

	/**
	 * 模糊 查询商品
	 * 
	 * @throws UnsupportedEncodingException
	 * */
	@RequestMapping("/dimquery/{title}&{pn}")
	public String queryDim(@PathVariable("title") String title,
			@PathVariable("pn") Integer pn, Model model)
			throws UnsupportedEncodingException {

		Products productsInfo = new Products();
		title = new String(title.getBytes("ISO-8859-1"), "UTF-8");
		productsInfo.setImagetitle(title);
		BrandWithBLOBs brand = new BrandWithBLOBs();
		productsInfo.setBrand(brand);
		ProductType productType = new ProductType();
		productsInfo.setProductType(productType);
		ProductKeyword productsKeyWord = new ProductKeyword();
		productsInfo.setProductKeyword(productsKeyWord);

		PageHelper.startPage(pn, 15);
		List<Products> products = collectionService.dimQuery(productsInfo);
		PageInfo pageInfo = new PageInfo(products, 5);
		model.addAttribute("pageInfo", pageInfo);
		model.addAttribute("title", title);
		return "oldfront/home/search1";
	}

}
