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
     * 支付
     * @return
     */
	@RequestMapping("/pay")
	public String pay() {
		return "oldfront/home/pay";
	}
    /**
     * 注册
     * @return
     */
	@RequestMapping("/register")
	public String register() {
		return "oldfront/home/register";
	}
    /**
     * 搜索
     * @return
     */
	@RequestMapping("/search")
	public String search() {
		return "oldfront/home/search";
	}
    /**
     * 购物车？？
     * @return
     */
	@RequestMapping("/shopcart")
	public String shopcart() {
		return "oldfront/home/shopcart";
	}
    /**
     * 分类？
     * @return
     */
	@RequestMapping("/sort")
	public String sort() {
		return "oldfront/home/sort";
	}
    /***
     * 支付成功
     * @return
     */
	@RequestMapping("/success")
	public String success() {
		return "oldfront/home/success";
	}
    /**
     * 介绍
     * @return
     */
	@RequestMapping("/introduction")
	public String introduction() {
		return "oldfront/home/introduction";
	}
     /***
      * 主页
      * @return
      */
	@RequestMapping("/oldfronthome")
	public String home() {
		return "oldfront/home/home";
	}
    /**
     * 地址
     * @return
     */
	@RequestMapping("/address")
	public String address() {
		return "oldfront/person/address";
	}
    /**
     * 账单明细
     * @return
     */
	@RequestMapping("/oldfrontbilllist")
	public String bill() {
		return "oldfront/person/bill";
	}
    /***
     * 账单明细
     * @return
     */
	@RequestMapping("/billlist")
	public String billlist() {
		return "oldfront/person/billlist";
	}
    /**
     * 安全里的
     * @return
     */
	@RequestMapping("/bindphone")
	public String bindphone() {
		return "oldfront/person/bindphone";
	}
    /**
     * 搜索里的啥
     */
	@RequestMapping("/blog")
	public String blog() {
		return "oldfront/person/blog";
	}
    /**
     * 红包
     * @return
     */
	@RequestMapping("/bonus")
	public String bonus() {
		return "oldfront/person/bonus";
	}
     /**
      * 售后
      * @return
      */
	@RequestMapping("/change")
	public String change() {
		return "oldfront/person/change";
	}
    /**
     * 收藏
     * @return
     */
	@RequestMapping("/collection")
	public String collection() {
		return "oldfront/person/collection";
	}
    /**
     * 评价
     * @return
     */
	@RequestMapping("/comment")
	public String comment() {
		return "oldfront/person/comment";
	}
    /**
     * 评价
     * @return
     */
	@RequestMapping("/commentlist")
	public String commentlist() {
		return "oldfront/person/commentlist";
	}
    /**
     * 优惠卷
     * @return
     */
	@RequestMapping("/coupon")
	public String coupon() {
		return "oldfront/person/coupon";
	}
    /**
     * 邮箱
     * @return
     */
	@RequestMapping("/email")
	public String email() {
		return "oldfront/person/email";
	} 
     /**
      * 足迹
      * @return
      */
	@RequestMapping("/foot")
	public String foot() {
		return "oldfront/person/foot";
	}
    /***
     * 实名认证
     * @return
     */
	@RequestMapping("/idcard")
	public String idcard() {
		return "oldfront/person/idcard";
	}
    /**
     * 个人中心
     * @return
     */
	@RequestMapping("/index")
	public String index() {
		return "oldfront/person/index";
	}
    /**
     * 个人信息
     * @return
     */
	@RequestMapping("/information")
	public String information() {
		return "oldfront/person/information";
	}
    /**
     * 消息 物流
     * @return
     */
	@RequestMapping("/logistics")
	public String logistics() {
		return "oldfront/person/logistics";
	}
    /**
     * 我的消息
     * @return
     */
	@RequestMapping("/news")
	public String news() {
		return "oldfront/person/news";
	}
    /**
     * 订单管理
     * @return
     */
	@RequestMapping("/order")
	public String order() {
		return "oldfront/person/order";
	}
    /**订单管理
     * 
     * @return
     */
	@RequestMapping("/orderinfo")
	public String orderinfo() {
		return "oldfront/person/orderinfo";
	}
    /**
     * 修改密码
     * @return
     */
	@RequestMapping("/password")
	public String password() {
		return "oldfront/person/password";
	}
    /**
     * 安全里的问题
     * @return
     */
	@RequestMapping("/question")
	public String question() {
		return "oldfront/person/question";
	}
    /**
     * 消息 钱的去向
     * @return
     */
	@RequestMapping("/record")
	public String record() {
		return "oldfront/person/record";
	}
    /**
     *  个人中心的申请退款
     * @return
     */
	@RequestMapping("/refund")
	public String refund() {
		return "oldfront/person/refund";
	}
    /**
     * 安全设置
     * @return
     */
	@RequestMapping("/safety")
	public String safety() {
		return "oldfront/person/safety";
	}
    /**
     * 支付密码
     * @return
     */
	@RequestMapping("/setpay")
	public String setpay() {
		return "oldfront/person/setpay";
	}
}
