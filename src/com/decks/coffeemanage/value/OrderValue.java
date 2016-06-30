package com.decks.coffeemanage.value;

import java.util.Date;

public class OrderValue {
	private int orderid = 0;
	private Date orderdate = null;
	private double quantity = 0.0;
	private BeanValue bean = null;
	private HandleValue handle = null;
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public BeanValue getBean() {
		return bean;
	}
	public void setBean(BeanValue bean) {
		this.bean = bean;
	}
	public HandleValue getHandle() {
		return handle;
	}
	public void setHandle(HandleValue handle) {
		this.handle = handle;
	}

}
