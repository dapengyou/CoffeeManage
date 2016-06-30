package com.decks.coffeemanage.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.decks.coffeemanage.business.IHandleBusiness;
import com.decks.coffeemanage.value.HandleValue;

@Controller("handleProcessAction")
@Scope("prototype")
public class HandleProcessAction {
	
	private IHandleBusiness ihb = null;
	private HandleValue hv = null;

	public HandleValue getHv() {
		return hv;
	}

	public void setHv(HandleValue hv) {
		this.hv = hv;
	}

	@Autowired
	public void setIhb(IHandleBusiness ihb) {
		this.ihb = ihb;
	}

	public String add() throws Exception {
		ihb.add(hv);
		return "main";
	}
	
	public String delete() throws Exception {
		ihb.delete(hv);
		return "main";
	}
	
	public String update() throws Exception {
		ihb.update(hv);
		return "main";
	}

}
