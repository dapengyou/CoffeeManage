package com.decks.coffeemanage.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.decks.coffeemanage.business.IUserBusiness;
import com.decks.coffeemanage.value.UserValue;
import com.opensymphony.xwork2.ActionSupport;

@Controller("registerAction")
@Scope("prototype")
public class RegisterAction extends ActionSupport {
	
	private IUserBusiness iub = null;
	private UserValue uv = null;
	private String name = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
		if (String.valueOf(uv.getPwd()).length() < 8 || String.valueOf(uv.getPwd()).length() > 12 ){
			addFieldError("uv.pwd", "pwd必须为3-12位");
		}
	}

	public String register() throws Exception {
		iub.add(uv);
		return "success";
	}
}
