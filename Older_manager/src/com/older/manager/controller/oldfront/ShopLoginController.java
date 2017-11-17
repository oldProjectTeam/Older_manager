/**
 * 
 */
package com.older.manager.controller.oldfront;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.older.manager.bean.Users;
import com.older.manager.service.oldback.shop.UsersService;
import com.older.manager.service.shopfront.ShopLoginService;
import com.older.manager.utils.MD5;

/**
 * @author ym
 * @date 2017年11月16日 下午1:46:27
 */
@Controller
@RequestMapping("/Shop")
public class ShopLoginController {

	@Autowired
	UsersService usersService;

	@Autowired
	ShopLoginService shopLoginService;

	/**
	 * @Title: login
	 * @Description: 电商登录
	 * @param: @param session
	 * @param: @param randomcode
	 * @param: @param useraccount
	 * @param: @param password
	 * @param: @param request
	 * @param: @param response
	 * @param: @return
	 * @param: @throws Exception
	 * @return: String
	 * @throws
	 * @author: ym
	 * @date: 2017年11月16日 下午2:22:10
	 */
	@RequestMapping("/UserLogin")
	public String login(HttpSession session, String randomcode,
			String useraccount, String password, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
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
		if (useraccount.equals("") || password.equals("")) {
			message = "请输入信息";
		}
		// 调用service校验用户账号和密码的正确性
		if (useraccount != null) {
			Users users = shopLoginService.authenticat(useraccount, password);
			if (users != null) {
				// 如果service校验通过，将用户身份记录到session
				String password_dbString = users.getPassword();
				String password_input_md5 = new MD5().getMD5ofStr(password);
				if (!password_input_md5.equals(password_dbString)) {
					message = "用户名或密码错误";
				} else {
					System.out.println("..........商户登录成功！");
					session.setAttribute("users", users);
					return "redirect:/shop/oldfronthome";
				}
			} else {
				message = "用户账号不存在";
			}
		}
		request.setAttribute("message", message);
		return "oldfront/home/login";
	}

	@RequestMapping("/shopMain")
	public String shopMain() {
		return "redirect:/shop/oldfronthome";
	}

	/**
	 * @Title: logout
	 * @Description: 电商用户退出
	 * @param: @param request
	 * @param: @param response
	 * @param: @return
	 * @param: @throws Exception
	 * @return: String
	 * @throws
	 * @author: ym
	 * @date: 2017年11月16日 下午2:22:34
	 */
	@RequestMapping("/Userlogout")
	public String logout(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// session失效
		request.getSession().removeAttribute("users");
		return "redirect:/shop/login";
	}

	/**
	 * @Title: codeRefresh
	 * @Description: 电商登录界面验证码刷新
	 * @param: @param request
	 * @param: @param response
	 * @param: @return
	 * @return: String
	 * @throws
	 * @author: ym
	 * @date: 2017年11月16日 下午2:22:56
	 */
	@RequestMapping("/codeRefresh")
	public String codeRefresh() {
		return "redirect:/shop/login";
	}
}
