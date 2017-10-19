package com.older.manager.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.older.manager.bean.Oldmanaccount;
import com.older.manager.service.IUserService;
import com.older.manager.utils.Msg;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	@Qualifier("userServiceImpl")
	private IUserService userService;

	@RequestMapping("/loginForOldMan")
	@ResponseBody
	public Msg loginForOldMan(@Valid Oldmanaccount oldmanaccount) {
		Oldmanaccount loginForOldman = userService
				.loginForOldman(oldmanaccount);
		if (loginForOldman != null) {
			return Msg.success().add("loginForOldman", loginForOldman)
					.add("msg", "登录成功");
		}
		return Msg.fail().add("msg", "登录失败");
	}
}
