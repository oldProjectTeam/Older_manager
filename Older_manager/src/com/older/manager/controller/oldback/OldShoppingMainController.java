package com.older.manager.controller.oldback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OldShoppingMainController {
	/**
	 * 电商后台主界面
	 * 
	 * @return
	 */
	@RequestMapping("/shopping_main")
	public String oldShoppingMain() {
		return "oldback/oldbackshopping/shopping_main";
	}

	/**
	 * 电商后台首页
	 * 
	 * @return
	 */
	@RequestMapping("/shopping_index")
	public String oldShoppingIndex() {
		return "oldback/oldbackshopping/shopping_index";
	}

	/**
	 * 电商后台产品
	 * 
	 * @return
	 */
	@RequestMapping("/Products_List")
	public String oldProduct() {
		return "oldback/oldbackshopping/Products_List";
	}

	/**
	 * 电商后台添加产品
	 * 
	 * @return
	 */
	@RequestMapping("/add_product")
	public String oldAddProduct() {
		return "oldback/oldbackshopping/add_product";
	}

	/**
	 * 电商后台home页
	 * 
	 * @return
	 */
	@RequestMapping("/home")
	public String home() {
		return "oldback/oldbackshopping/home";
	}

	/**
	 * 电商后台添加商品
	 * 
	 * @return
	 */
	@RequestMapping("/picture-add")
	public String pictureAdd() {
		return "oldback/oldbackshopping/picture-add";
	}

	/**
	 * 电商后台品牌管理
	 * 
	 * @return
	 */
	@RequestMapping("/Brand_Manage")
	public String brandManager() {
		return "oldback/oldbackshopping/Brand_Manage";
	}

	/**
	 * 电商后台添加品牌
	 * 
	 * @return
	 */
	@RequestMapping("/Add_Brand")
	public String addBrand() {
		return "oldback/oldbackshopping/Add_Brand";
	}

	/**
	 * 电商后台分类管理
	 * 
	 * @return
	 */
	@RequestMapping("/Category_Manage")
	public String categoreManage() {
		return "oldback/oldbackshopping/Category_Manage";
	}

	/**
	 * 电商后台添加产品分类
	 * 
	 * @return
	 */
	@RequestMapping("/product-category-add")
	public String productCategoryAdd() {
		return "oldback/oldbackshopping/product-category-add";
	}

	/**
	 * 电商后台广告管理
	 * 
	 * @return
	 */
	@RequestMapping("/advertising")
	public String advertising() {
		return "oldback/oldbackshopping/advertising";
	}

	/**
	 * 电商后台分类管理
	 * 
	 * @return
	 */
	@RequestMapping("/Sort_ads")
	public String Sort_ads() {
		return "oldback/oldbackshopping/Sort_ads";
	}

	/**
	 * 电商后台分类管理
	 * 
	 * @return
	 */
	@RequestMapping("/Ads_list")
	public String Ads_list() {
		return "oldback/oldbackshopping/Ads_list";
	}

	/**
	 * 电商后台交易信息
	 * 
	 * @return
	 */
	@RequestMapping("/transaction")
	public String transaction() {
		return "oldback/oldbackshopping/transaction";
	}

	/**
	 * 电商后台订单管理
	 * 
	 * @return
	 */
	@RequestMapping("/Orderform")
	public String Orderform() {
		return "oldback/oldbackshopping/Orderform";
	}

	/**
	 * 电商后台订单明细
	 * 
	 * @return
	 */
	@RequestMapping("/order_detailed")
	public String order_detailed() {
		return "oldback/oldbackshopping/order_detailed";
	}

	/**
	 * 电商后台会员列表
	 * 
	 * @return
	 */
	@RequestMapping("/user_list")
	public String user_list() {
		return "oldback/oldbackshopping/user_list";
	}

	/**
	 * 电商后台等级管理
	 * 
	 * @return
	 */
	@RequestMapping("/member-Grading")
	public String memberGrading() {
		return "oldback/oldbackshopping/member-Grading";
	}

	/**
	 * 电商后台会员记录管理
	 * 
	 * @return
	 */
	@RequestMapping("/integration")
	public String integration() {
		return "oldback/oldbackshopping/integration";
	}

	/**
	 * 电商后台系统设置
	 * 
	 * @return
	 */
	@RequestMapping("/Systems")
	public String Systems() {
		return "oldback/oldbackshopping/Systems";
	}

	/**
	 * 电商后台权限管理
	 * 
	 * @return
	 */
	@RequestMapping("/admin_Competence")
	public String admin_Competence() {
		return "oldback/oldbackshopping/admin_Competence";
	}

	/**
	 * 电商后台管理员列表
	 * 
	 * @return
	 */
	@RequestMapping("/administrator")
	public String administrator() {
		return "oldback/oldbackshopping/administrator";
	}

	/**
	 * 电商后台个人信息
	 * 
	 * @return
	 */
	@RequestMapping("/admin_info")
	public String admin_info() {
		return "oldback/oldbackshopping/admin_info";
	}
}
