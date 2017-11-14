package com.older.manager.controller.oldfront;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.older.manager.bean.Users;
import com.older.manager.service.shopfront.IShopRegisterService;
import com.older.manager.utils.Msg;

@Controller
public class ShopRegisterController {

	@Autowired
	private IShopRegisterService shopRegisterService;

	/**
	 * 使用邮箱注册
	 * 
	 * @return
	 */
	@RequestMapping("/registerOfEmail")
	@ResponseBody
	public Msg registerOfEmail(Users users) {
		Map<String, Object> map = shopRegisterService.registerOfEmail(users);
		boolean flag = (Boolean) map.get("flag");
		if (flag) {
			return Msg.success();
		}
		String error = (String) map.get("error");
		return Msg.fail().add("error", error);
	}

	/**
	 * 使用手机号注册
	 * 
	 * @return
	 */
	@RequestMapping("/registerOfPhone")
	@ResponseBody
	public Msg registerOfPhone(Users users, Model model) {
		Map<String, Object> map = shopRegisterService.registerOfPhone(users);
		boolean flag = (Boolean) map.get("flag");
		if (flag) {
			return Msg.success();
		}
		String error = (String) map.get("error");
		return Msg.fail().add("error", error);
	}

	@RequestMapping("/getCode")
	@ResponseBody
	public Msg getCode(@RequestParam("phone") String phone) {
		Map<String, Object> map = shopRegisterService.getCode(phone);
		int result = (Integer) map.get("result");
		String error = (String) map.get("errorMsg");
		String msg = (String) map.get("msg");
		if (!msg.equals("")) {
			msg = msg.substring(msg.indexOf(":") + 1, msg.length());
		}
		if (result > 0) {
			return Msg.success().add("msg", msg);
		} else {
			return Msg.fail().add("error", error);
		}
	}
}
