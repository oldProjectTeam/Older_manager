package com.older.manager.controller.oldfront;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("shop")
public class ShopController {
	/**
	 * 登录
	 */
	@RequestMapping("/login")
	public String login() {
		return "oldfront/home/login";
	}

	/**
	 * 注册
	 * 
	 * @return
	 */
	@RequestMapping("/register")
	public String register() {
		return "oldfront/home/register";
	}

	/**
	 * 搜索
	 * 
	 * @return
	 */
	@RequestMapping("/search")
	public String search() {
		return "oldfront/home/search";
	}

	/**
	 * 分类
	 * 
	 * @return
	 */
	@RequestMapping("/sort")
	public String sort() {
		return "oldfront/home/sort";
	}

	/**
	 * 介绍
	 * 
	 * @return
	 */
	@RequestMapping("/introduction")
	public String introduction() {
		return "oldfront/home/introduction";
	}

	/***
	 * 主页
	 * 
	 * @return
	 */
	@RequestMapping("/oldfronthome")
	public String home() {
		return "oldfront/home/home";
	}

	/**
	 * 评价
	 * 
	 * @return
	 */
	@RequestMapping("/comment")
	public String comment() {
		return "oldfront/person/comment";
	}

	/**
	 * 收藏
	 * 
	 * @return
	 */
	@RequestMapping("/collection")
	public String collection() {
		return "oldfront/person/collection";
	}

	/**
	 * 足迹
	 * 
	 * @return
	 */
	@RequestMapping("/foot")
	public String foot() {
		return "oldfront/person/foot";
	}

	/**
	 * 评价
	 * 
	 * @return
	 */
	@RequestMapping("/commentlist")
	public String commentlist() {
		return "oldfront/person/commentlist";
	}
}
