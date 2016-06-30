package com.decks.coffeemanage.action;

import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

@Controller("homeMainAction")
@Scope("prototype")
public class HomeMainAction {
	public String toregister() throws Exception {
		return "toregister";
	}
	
	public String logout() throws Exception {
		Map session = ActionContext.getContext().getSession();
		session.remove("username");
		return "logout";
	}
}
