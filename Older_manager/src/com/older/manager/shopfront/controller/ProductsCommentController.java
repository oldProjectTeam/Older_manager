package com.older.manager.shopfront.controller;

import java.util.List;
import java.util.Map;

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
@RequestMapping("/comment")
/**
 * 增加了方法
 * @author 疯癫
 *
 */
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
	
	
	
	/**
	 * 查评价条数
	 * @param pid
	 * @return
	 */
	@RequestMapping("/selectcomment")
	@ResponseBody
	public Msg selectCountComment(@RequestParam Integer pid){
		Map  map=productCommentService.countComment(pid);
		return Msg.success().add("map", map);
	}
	 /**
	  * 根据产品id来查所有的评论
	  * @param pn
	  * @param pid
	  * @return
	  */
	@RequestMapping("/selectallcomment")
	@ResponseBody
	public Msg selectAllCommentByPid(@RequestParam Integer pn,@RequestParam Integer pid){
		PageHelper.startPage(pn,2);
		List<ProductComment> all=productCommentService.selectAllProductComment(pid);
		PageInfo pageInfo=new PageInfo(all,2);
		
		return Msg.success().add("pageInfo", pageInfo);
		
	}
}
