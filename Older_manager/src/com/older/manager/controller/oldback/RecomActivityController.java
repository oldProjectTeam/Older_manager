package com.older.manager.controller.oldback;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recom")
public class RecomActivityController {
	
//*****************跳转专区*****************
	/**
	 * 跳到推荐活动
	 * @return
	 */
	@RequestMapping("/skiprecomactivity")
	public   String skipRecomActivity(){
		return "oldback/oldCustomerActivity/CustomerRecommendationActivities";
	}
	/**
	 * 跳到提醒记录
	 * @return
	 */
	@RequestMapping("/skipremind")
	public   String skipRemind(){
		return "oldback/oldCustomerActivity/CustomerRemind";
	}
	/**
	 * 跳到沟通老人
	 * @return
	 */
	@RequestMapping("/skipconmmunctionolder")
	public   String skipConmmunctionOlder(){
		return "oldback/oldCustomerActivity/CustomerCommunicate";
	}
	/**
	 * 跳到购买商品
	 * @return
	 */
	@RequestMapping("/skipbuycommodity")
	public   String skipBuyCommodity(){
		return "oldback/oldCustomerActivity/CustomerCommodity";
	}
	/**
	 * 跳到推荐商品
	 * @return
	 */
	@RequestMapping("/skiprecomcommodity")
	public   String skipRecomCommodity(){
		return "oldback/oldCustomerActivity/CustomerRecommendC";
	}
	
	/**
	 * 跳到购买能力
	 * @return
	 */
	@RequestMapping("/skipbuyability")
	public   String skipBuyAbility(){
		return "oldback/oldCustomerActivity/CustomerRecommendationActivities";
	}
//*****************跳转专区*****************
	
	
	
	
	
	
}
