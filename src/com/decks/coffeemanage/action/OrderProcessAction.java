package com.decks.coffeemanage.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.decks.coffeemanage.business.IOrderBusiness;
import com.decks.coffeemanage.value.OrderValue;

@Controller("orderProcessAction")
@Scope("prototype")
public class OrderProcessAction {
	
	private IOrderBusiness iob = null;
	private OrderValue ov = null;
	private int beanid = 0;
	private int handleid = 0;
	
	public int getBeanid() {
		return beanid;
	}

	public void setBeanid(int beanid) {
		this.beanid = beanid;
	}

	public int getHandleid() {
		return handleid;
	}

	public void setHandleid(int handleid) {
		this.handleid = handleid;
	}

	public OrderValue getOv() {
		return ov;
	}

	public void setOv(OrderValue ov) {
		this.ov = ov;
	}
	
	@Autowired
	public void setIob(IOrderBusiness iob) {
		this.iob = iob;
	}

	public String add() throws Exception {
		iob.add(ov, beanid, handleid);
		return "main";
	}
	
	public String delete() throws Exception {
		iob.delete(ov);
		return "main";
	}
	
	public String update() throws Exception {
		System.out.println("orderid" + ov.getOrderid());
		System.out.println("beanid:" + beanid);
		System.out.println("handleid:" + handleid);
		iob.update(ov, beanid, handleid);
		return "main";
	}
}
