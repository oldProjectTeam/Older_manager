package com.older.manager.shopfront.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.older.manager.bean.Products;
import com.older.manager.bean.Users;
import com.older.manager.service.shopfront.IProductsService;

@Controller
@RequestMapping("product")
public class ProductController {

	@Autowired
	IProductsService productsService;

	/**
	 * @return 通过ID查询产品全部信息
	 */
	@RequestMapping("/getProduct/{id}")
	public String getProductsWithJson(@PathVariable("id") Integer id,
			Model model, HttpSession session) {
		Products product = productsService.findById(id);
		Users users = (Users) session.getAttribute("users");
		if (users != null) {
			productsService.addFoot(users.getId(), id);
		}
		model.addAttribute("product", product);
		return "oldfront/home/introduction";
	}
}
