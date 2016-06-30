package com.decks.coffeemanage.action;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.decks.coffeemanage.business.IBeanBusiness;
import com.decks.coffeemanage.value.BeanValue;
import com.opensymphony.xwork2.ActionSupport;

@Controller("beanProcessAction")
@Scope("prototype")
public class BeanProcessAction extends ActionSupport {
	
	private IBeanBusiness ibb = null;
	private BeanValue bv = null;
	private int[] handles = null;
	
	public int[] getHandles() {
		return handles;
	}

	public void setHandles(int[] handles) {
		this.handles = handles;
	}

	@Autowired
	public void setIbb(IBeanBusiness ibb) {
		this.ibb = ibb;
	}
	
	public BeanValue getBv() {
		return bv;
	}

	public void setBv(BeanValue bv) {
		this.bv = bv;
	}

	public String add() throws Exception {
		ibb.add(bv, handles);
		return "main";
	}
	
	public String delete() throws Exception {
		ibb.delete(bv);
		return "main";
	}
	
	public String update() throws Exception {
		ibb.update(bv, handles);
		return "main";
	}

}
