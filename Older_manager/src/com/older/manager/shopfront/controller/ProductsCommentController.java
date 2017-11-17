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
public class ProductsCommentController {
	@Autowired
	private IProductCommentService productCommentService;
	
	@RequestMapping("/queryProductsComment")
	@ResponseBody
	public Msg queryProductsComment(@RequestParam(value="pn",defaultValue="1")String pn){
		int p=Integer.parseInt(pn);
		PageHelper.startPage(p,15);
		List<ProductComment> productComments=productCommentService.queryProductComments();
		PageInfo pageInfo=new PageInfo(productComments,5);
		return Msg.success().add("pageInfo", pageInfo);
	}
}
