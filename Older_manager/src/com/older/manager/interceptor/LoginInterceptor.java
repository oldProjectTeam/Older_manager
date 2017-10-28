package com.older.manager.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.older.manager.bean.User;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {

	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object object) throws Exception {
		String url = request.getRequestURI();
		if (url.indexOf("system/login") > 0) {
			return true;
		}
		User user = (User) request.getSession().getAttribute("currentUser");
		if (user != null) {
			return true;
		}
		// request.setAttribute("msg", "请你先登录");
		request.getRequestDispatcher(
				"/WEB-INF/views/oldback/oldbackMain/login.jsp").forward(
				request, response);
		return false;
	}
}
