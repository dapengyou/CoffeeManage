package com.decks.coffeemanage.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.decks.coffeemanage.business.IUserBusiness;
import com.decks.coffeemanage.value.UserValue;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Controller("loginAction")
@Scope("prototype")
public class LoginAction extends ActionSupport {

	private IUserBusiness iub = null;
	private UserValue uv = null;

	@Autowired
	public void setIub(IUserBusiness iub) {
		this.iub = iub;
	}

	public UserValue getUv() {
		return uv;
	}

	public void setUv(UserValue uv) {
		this.uv = uv;
	}

	@Override
	public void validate() {
		if (uv.getName() == null || uv.getName().trim().equals("")) {
			addFieldError("uv.name", "用户名不能为空");
		}
		if (uv.getPwd() == null || uv.getPwd().trim().equals("")) {
			addFieldError("uv.pwd", "密码不能为空");
		}
	}

	public String login() throws Exception {
		UserValue nuv = iub.getUserByName(uv.getName());
		if (nuv == null) {
			return "fail";
		} else {
			if (nuv.getPwd().equals(uv.getPwd())) {
				uv = nuv;
				HttpServletRequest request = ServletActionContext.getRequest();
				Map map = ActionContext.getContext().getSession();
				map.put("username", uv.getName());
				
//				Map session = ActionContext.getContext().getSession();
//				session.put("logged", "true");
				return "success";
			} else {
				return "fail";
			}
		}
	}
	
}
