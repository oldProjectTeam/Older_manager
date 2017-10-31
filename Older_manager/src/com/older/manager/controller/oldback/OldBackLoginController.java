package com.older.manager.controller.oldback;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	@RequestMapping("/login")
	public String login(HttpSession session, String randomcode,
			String usercode, String password) throws Exception {

		// 校验验证码，防止恶性攻击
		// 从session获取正确验证码
		String validateCode = (String) session.getAttribute("validateCode");

		// 输入的验证和session中的验证进行对比
		if (!randomcode.equals(validateCode)) {
			// 抛出异常
			throw new UserException("验证码输入错误");
		}
		// 调用service校验用户账号和密码的正确性
		ActiveUser activeUser = sysService.authenticat(usercode, password);

		// 如果service校验通过，将用户身份记录到session
		session.setAttribute("activeUser", activeUser);
		// 重定向到商品查询页面
		return "oldback/oldbackMain/main";
	}

	// 用户退出
	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception {
		// session失效
		session.removeAttribute("activeUser");
		session.invalidate();
		// 重定向到商品查询页面
		return "oldback/oldbackMain/login";

	}

	@RequestMapping("/getUserInfo")
	@ResponseBody
	public Msg getUserInfo(Integer id) throws Exception {
		return Msg.success().add("activeUser", sysService.getUserInfo(id));
	}

}