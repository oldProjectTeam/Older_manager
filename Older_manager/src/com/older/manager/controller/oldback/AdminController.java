package com.older.manager.controller.oldback;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.older.manager.bean.User;
import com.older.manager.service.oldback.ISystemUserService;

@Controller
@RequestMapping("system")
public class AdminController {
	@Autowired
	private ISystemUserService systemUserService;

	@RequestMapping("/login")
	public String login(@Valid User user, @RequestParam("code") String code,
			HttpServletRequest request) {
		String sessionCode = (String) request.getSession().getAttribute(
				"validateCode");
		if (!sessionCode.equals(code)) {
			request.setAttribute("msg", "验证码不正确");
			return "oldback/oldbackMain/login";
		}
		User currentUser = systemUserService.loginForSystemUser(user);
		if (currentUser != null) {
			request.getSession().setAttribute("currentUser", currentUser);
			return "oldback/oldbackMain/main";
		} else {
			request.setAttribute("msg", "登录失败啦");
		}
		return "oldback/oldbackMain/login";
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("currentUser");
		return "oldback/oldbackMain/login";
	}

	@RequestMapping("/index")
	public String index() {
		return "oldback/oldbackMain/login";
	}
}
