package com.cn.ms.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 继承HandlerInterceptor接口
 * 或者实现的抽象类HandlerInterceptorAdapter
 * @author yu
 * @date 2017-06-10
 */
public class MyInterceptors implements HandlerInterceptor {

	/**
	 * 在dispatcherServlet视图渲染之后，进行资源的处理工作。
	 */
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("后2");
	}

	/**
	 * 在controller之后但是在dispatcherServlet视图渲染之前
	 */
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {

		String url = arg0.getRequestURI();
		HttpSession session = arg0.getSession();

		if (null != url) {
			/**判断患者有没有登录**/
			if (url.startsWith("/ms/home/login1")) {
				String patient = (String) session.getAttribute("id");

				if (null != patient) {
					arg3.setViewName("choose");
				}
			/**判断医生有没有登录**/
			} else if(url.startsWith("/ms/home/login2")) {
				String doctor = (String) session.getAttribute("id2");

				if (null != doctor) {
					arg3.setViewName("choose2");
					System.out.println();
				}
			}
		}
	}

	/**
	 * 拦截前的预处理操作
	 * 返回值若为flase则直接结束，执行下一个
	 */
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("前2");
		return true;
	}

}
