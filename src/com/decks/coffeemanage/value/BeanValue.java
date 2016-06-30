package com.decks.coffeemanage.value;

import java.util.Date;
import java.util.Set;

public class BeanValue {
	private int beanid = 0;
	private String beanname = null;
	private String producthome = null;
	private Date productiondate = null;
	private double greenprice = 0.0;
	private double cookedprice = 0.0;
	private Set<OrderValue> orders = null;
	private Set<HandleValue> handles = null;
	
	public int getBeanid() {
		return beanid;
	}
	public void setBeanid(int beanid) {
		this.beanid = beanid;
	}
	public String getBeanname() {
		return beanname;
	}
	public void setBeanname(String beanname) {
		this.beanname = beanname;
	}
	public String getProducthome() {
		return producthome;
	}
	public void setProducthome(String producthome) {
		this.producthome = producthome;
	}
	public Date getProductiondate() {
		return productiondate;
	}
	public void setProductiondate(Date productiondate) {
		this.productiondate = productiondate;
	}
	public double getGreenprice() {
		return greenprice;
	}
	public void setGreenprice(double greenprice) {
		this.greenprice = greenprice;
	}
	public double getCookedprice() {
		return cookedprice;
	}
	public void setCookedprice(double cookedprice) {
		this.cookedprice = cookedprice;
	}
	public Set<OrderValue> getOrders() {
		return orders;
	}
	public void setOrders(Set<OrderValue> orders) {
		this.orders = orders;
	}
	public Set<HandleValue> getHandles() {
		return handles;
	}
	public void setHandles(Set<HandleValue> handles) {
		this.handles = handles;
	}
	
}
