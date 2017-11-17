package com.older.manager.controller.oldback;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.older.manager.bean.ActiveUser;
import com.older.manager.exception.UserException;
import com.older.manager.service.oldback.SysService;
import com.older.manager.utils.Msg;

@Controller
public class OldBackLoginController {
	@Autowired
	private SysService sysService;

	// 用户登陆提交方法
	/**
	 * 
	 * @param session
	 * @param randomcode
	 *            输入的验证码
	 * @param usercode
	 *            用户账号
	 * @param password
	 *            用户密码
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/SysUserLogin")
	public String login(HttpSession session, String randomcode,
			String usercode, String password, Integer loginType,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String message = "";
		// 校验验证码，防止恶性攻击
		// 从session获取正确验证码
		String validateCode = (String) session.getAttribute("validateCode");

		// 输入的验证和session中的验证进行对比
		if (validateCode != null) {
			if (!validateCode.equals(randomcode)) {
				// 抛出异常
				message = "验证码输入错误";
			}
		}
		if (usercode.equals("") || password.equals("")) {
			message = "请输入信息";
		}
		// 调用service校验用户账号和密码的正确性
		if (usercode != null) {
			ActiveUser activeUser = sysService.authenticat(usercode, password,
					loginType);
			if (activeUser != null) {
				// 如果service校验通过，将用户身份记录到session
				session.setAttribute("activeUser", activeUser);
				if (loginType == 1) {
					// 登录到老人后台管理系统
					return "redirect:backOldMain";
				} else if (loginType == 0) {
					// 登录到电商后台管理系统
					return "redirect:backShopMain";
				}
			}
		}
		response.sendRedirect(request.getContextPath() + "/login.jsp");
		return null;
	}

	@RequestMapping("/backOldMain")
	public String backOldMian() {
		return "oldback/oldbackMain/main";
	}

	@RequestMapping("/backShopMain")
	public String backShopMian() {
		return "oldback/oldbackshopping/shopping_main";
	}

	// 用户退出
	@RequestMapping("/backlogout")
	public String logout(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// session失效
		request.getSession().removeAttribute("activeUser");
		response.sendRedirect(request.getContextPath() + "/login.jsp");
		return null;

	}

	@RequestMapping("/codeRefresh")
	public String codeRefresh(HttpServletRequest request,
			HttpServletResponse response) {
		try {
			response.sendRedirect(request.getContextPath() + "/login.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
