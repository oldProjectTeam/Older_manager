package com.older.manager.exception;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 自定义异常处理器
 */
public class ShopExceptionResolver implements HandlerExceptionResolver {

	// 前端控制器DispatcherServlet在进行HandlerMapping、调用HandlerAdapter执行Handler过程中，如果遇到异常就会执行此方法
	// handler最终要执行的Handler，它的真实身份是HandlerMethod
	// Exception ex就是接收到异常信息
	@Override
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		// 输出异常
		ex.printStackTrace();

		// 统一异常处理代码
		// 针对系统自定义的CustomException异常，就可以直接从异常类中获取异常信息，将异常处理在错误页面展示
		// 异常信息
		String message = null;
		ShopException shopException = null;
		// 如果ex是系统 自定义的异常，直接取出异常信息
		if (ex instanceof ShopException) {
			shopException = (ShopException) ex;
		} else {
			// 针对非ShopException异常，对这类重新构造成一个ShopException，异常信息为“未知错误”
			shopException = new ShopException("未知错误");
		}

		// 错误 信息
		message = shopException.getMessage();

		request.setAttribute("message", message);
		try {
			request.getRequestDispatcher(
					"/WEB-INF/views/oldfront/home/login.jsp").forward(request,
					response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ModelAndView();
	}
}
