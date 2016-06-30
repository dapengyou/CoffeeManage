package com.decks.coffeemanage.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.decks.coffeemanage.business.IHandleBusiness;
import com.decks.coffeemanage.value.HandleValue;
import com.opensymphony.xwork2.ActionSupport;

@Controller("handleMainAction")
@Scope("prototype")
public class HandleMainAction extends ActionSupport {
	
	private int id = 0;
	private IHandleBusiness ihb = null;
	private List<HandleValue> handleList = null;
	private HandleValue hv = null;
	
	public HandleValue getHv() {
		return hv;
	}

	public void setHv(HandleValue hv) {
		this.hv = hv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<HandleValue> getHandleList() {
		return handleList;
	}

	public void setHandleList(List<HandleValue> handleList) {
		this.handleList = handleList;
	}

	@Autowired
	public void setIhb(IHandleBusiness ihb) {
		this.ihb = ihb;
	}
	
	public String tomain() throws Exception {
		handleList = ihb.getList();
		return "tomain";
	}

	public String toadd() throws Exception {
		return "toadd";
	}
	
	public String todelete() throws Exception {
		return "todelete";
	}
	
	public String toupdate() throws Exception {
		hv = ihb.getHandle(id);
		return "toupdate";
	}
}
