package com.cn.ms.interceptors;

import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

/**
 * 实现WebRequestInterceptor,spring提供的，都传入了一个WebRequest对象
 * @author yu
 * @date 2017-06-10
 */
public class IndexInterceptors implements WebRequestInterceptor {

	public void preHandle(WebRequest request) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("前");
	}

	public void postHandle(WebRequest request, ModelMap model)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("中");
	}

	public void afterCompletion(WebRequest request, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("后");
	}

}
