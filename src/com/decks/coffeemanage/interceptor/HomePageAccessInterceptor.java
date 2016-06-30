package com.decks.coffeemanage.interceptor;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class HomePageAccessInterceptor implements Interceptor {

	@Override
	public void destroy() {
	}

	@Override
	public void init() {
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		String name = ai.getInvocationContext().getName();
		if (name.equals("login")) {
			// 如果用户想登录，则使之通过
			return ai.invoke();
		} else {
			// 取得Session。
			ActionContext ac = ai.getInvocationContext();
			Map session = (Map) ac.getSession();

			if (session == null) {
				// 如果Session为空，则让用户登陆。
				return "tologin";
			} else {
				String username = (String) session.get("username");
				if (username == null) {
					// Session不为空，但Session中没有用户信息，
					// 则让用户登陆
					return "tologin";
				} else {
					// 用户已经登陆，放行~
					return ai.invoke();
				}
			}
		}
	}

}
