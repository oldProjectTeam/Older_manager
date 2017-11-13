package com.older.manager.controller.oldfront;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("shop")
public class ShopController {

	@RequestMapping("/login")
	public String login() {
		return "oldfront/home/login";
	}

	@RequestMapping("/pay")
	public String pay() {
		return "oldfront/home/pay";
	}

	@RequestMapping("/register")
	public String register() {
		return "oldfront/home/register";
	}

	@RequestMapping("/search")
	public String search() {
		return "oldfront/home/search";
	}

	@RequestMapping("/shopcart")
	public String shopcart() {
		return "oldfront/home/shopcart";
	}

	@RequestMapping("/sort")
	public String sort() {
		return "oldfront/home/sort";
	}

	@RequestMapping("/success")
	public String success() {
		return "oldfront/home/success";
	}

	@RequestMapping("/introduction")
	public String introduction() {
		return "oldfront/home/introduction";
	}

	@RequestMapping("/oldfronthome")
	public String home() {
		return "oldfront/home/home";
	}

	@RequestMapping("/address")
	public String address() {
		return "oldfront/person/address";
	}

	@RequestMapping("/oldfrontbilllist")
	public String bill() {
		return "oldfront/person/bill";
	}

	@RequestMapping("/billlist")
	public String billlist() {
		return "oldfront/person/billlist";
	}

	@RequestMapping("/bindphone")
	public String bindphone() {
		return "oldfront/person/bindphone";
	}

	@RequestMapping("/blog")
	public String blog() {
		return "oldfront/person/blog";
	}

	@RequestMapping("/bonus")
	public String bonus() {
		return "oldfront/person/bonus";
	}

	@RequestMapping("/change")
	public String change() {
		return "oldfront/person/change";
	}

	@RequestMapping("/collection")
	public String collection() {
		return "oldfront/person/collection";
	}

	@RequestMapping("/comment")
	public String comment() {
		return "oldfront/person/comment";
	}

	@RequestMapping("/commentlist")
	public String commentlist() {
		return "oldfront/person/commentlist";
	}

	@RequestMapping("/coupon")
	public String coupon() {
		return "oldfront/person/coupon";
	}

	@RequestMapping("/email")
	public String email() {
		return "oldfront/person/email";
	}

	@RequestMapping("/foot")
	public String foot() {
		return "oldfront/person/foot";
	}

	@RequestMapping("/idcard")
	public String idcard() {
		return "oldfront/person/idcard";
	}

	@RequestMapping("/index")
	public String index() {
		return "oldfront/person/index";
	}

	@RequestMapping("/information")
	public String information() {
		return "oldfront/person/information";
	}

	@RequestMapping("/logistics")
	public String logistics() {
		return "oldfront/person/logistics";
	}

	@RequestMapping("/news")
	public String news() {
		return "oldfront/person/news";
	}

	@RequestMapping("/order")
	public String order() {
		return "oldfront/person/order";
	}

	@RequestMapping("/orderinfo")
	public String orderinfo() {
		return "oldfront/person/orderinfo";
	}

	@RequestMapping("/password")
	public String password() {
		return "oldfront/person/password";
	}

	@RequestMapping("/question")
	public String question() {
		return "oldfront/person/question";
	}

	@RequestMapping("/record")
	public String record() {
		return "oldfront/person/record";
	}

	@RequestMapping("/refund")
	public String refund() {
		return "oldfront/person/record";
	}

	@RequestMapping("/safety")
	public String safety() {
		return "oldfront/person/safety";
	}

	@RequestMapping("/setpay")
	public String setpay() {
		return "oldfront/person/setpay";
	}
}
