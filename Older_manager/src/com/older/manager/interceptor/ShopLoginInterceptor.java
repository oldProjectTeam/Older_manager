package com.older.manager.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.older.manager.bean.ActiveUser;
import com.older.manager.bean.Users;
import com.older.manager.utils.ResourcesUtil;

/**
 * 用户身份认证拦截器
 */
public class ShopLoginInterceptor implements HandlerInterceptor {

	// 在执行handler之前来执行的
	// 用于用户认证校验、用户权限校验
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		boolean flag = true;
		// 得到请求的url
		String url = request.getRequestURI();

		// 判断是否是公开 地址
		// 实际开发中需要公开 地址配置在配置文件中
		// 从配置中取逆名访问url

		List<String> open_urls = ResourcesUtil.gekeyList("anonymousURL");
		// 遍历公开 地址，如果是公开 地址则放行
		for (String open_url : open_urls) {
			if (url.indexOf(open_url) >= 0) {
				// 如果是公开 地址则放行
				return true;
			}
		}
		// 判断用户身份在session中是否存在
		HttpSession session = request.getSession();
		Users users = (Users) session.getAttribute("users");
		// 如果用户身份在session中存在放行
		if (users != null) {
			return true;
		}
		/*
		 * if (null == request.getSession(false)) { if (true ==
		 * request.getSession(true).isNew()) { } else {
		 * request.setAttribute("message", "登录失效,请你重新登录");
		 * response.sendRedirect(request.getContextPath() + "/login.jsp");
		 * return false; } }
		 */
		// 执行到这里拦截，跳转到登陆页面，用户进行身份认证
		// 如果返回false表示拦截不继续执行handler，如果返回true表示放行
		request.setAttribute("message", "请你先登录");
		request.getRequestDispatcher("/WEB-INF/views/oldfront/home/login.jsp")
				.forward(request, response);
		return false;
	}

	// 在执行handler返回modelAndView之前来执行
	// 如果需要向页面提供一些公用 的数据或配置一些视图信息，使用此方法实现 从modelAndView入手
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	// 执行handler之后执行此方法
	// 作系统
	// 统一异常处理，进行方法执行性能监控，在preHandle中设置一个时间点，在afterCompletion设置一个时间，两个时间点的差就是执行时长
	// 实现 系统 统一日志记录
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
