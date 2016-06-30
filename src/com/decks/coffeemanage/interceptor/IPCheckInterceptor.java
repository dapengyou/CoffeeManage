package com.decks.coffeemanage.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class IPCheckInterceptor implements Interceptor {

	@Override
	public void destroy() {
		System.out.println("IP检查拦截器销毁。。。");
	}

	@Override
	public void init() {
		System.out.println("IP检查拦截器初始化。。。");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("IP检查拦截器拦截方法。。。");
		String remoteAddr = ServletActionContext.getRequest().getRemoteAddr();
		System.out.println("当前访问IP: " + remoteAddr);
		
		// 验证remoteAddr
		return ai.invoke();
		
	}

}
