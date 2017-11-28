package com.older.manager.shopfront.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.older.manager.bean.ProductComment;
import com.older.manager.service.shopfront.IProductCommentService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("comment")
public class ProductsCommentController {
	@Autowired
	private IProductCommentService productCommentService;

	@RequestMapping("/queryProductsCommentByUserId")
	@ResponseBody
	public Msg queryProductsComment(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			Integer userId) {
		PageHelper.startPage(pn, 15);
		List<ProductComment> productComments = productCommentService
				.queryProductCommentByUserId(userId);
		PageInfo<ProductComment> pageInfo = new PageInfo<ProductComment>(
				productComments, 6);
		return Msg.success().add("pageInfo", pageInfo);
	}
}
