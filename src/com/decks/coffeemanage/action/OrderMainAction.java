package com.decks.coffeemanage.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.decks.coffeemanage.business.IBeanBusiness;
import com.decks.coffeemanage.business.IHandleBusiness;
import com.decks.coffeemanage.business.IOrderBusiness;
import com.decks.coffeemanage.value.BeanValue;
import com.decks.coffeemanage.value.HandleValue;
import com.decks.coffeemanage.value.OrderValue;

@Controller("orderMainAction")
@Scope("prototype")
public class OrderMainAction {
	
	private IHandleBusiness ihb = null;
	private IBeanBusiness ibb = null;
	private IOrderBusiness iob = null;
	private List<BeanValue> beanList = null;
	private List<HandleValue> handleList = null;
	private List<OrderValue> orderList = null;
	private int id = 0;
	private OrderValue ov = null;
	private int rows = 2;
	private int pageIndex = 1;
	private int pageNum = 0;
	private int beanid = 0;
	
	@Autowired
	public void setIob(IOrderBusiness iob) {
		this.iob = iob;
	}
	
	@Autowired
	public void setIhb(IHandleBusiness ihb) {
		this.ihb = ihb;
	}
	
	@Autowired
	public void setIbb(IBeanBusiness ibb) {
		this.ibb = ibb;
	}

	public int getBeanid() {
		return beanid;
	}

	public void setBeanid(int beanid) {
		this.beanid = beanid;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public OrderValue getOv() {
		return ov;
	}

	public void setOv(OrderValue ov) {
		this.ov = ov;
	}

	public List<BeanValue> getBeanList() {
		return beanList;
	}

	public void setBeanList(List<BeanValue> beanList) {
		this.beanList = beanList;
	}

	public List<HandleValue> getHandleList() {
		return handleList;
	}

	public void setHandleList(List<HandleValue> handleList) {
		this.handleList = handleList;
	}

	public List<OrderValue> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<OrderValue> orderList) {
		this.orderList = orderList;
	}

	public String tomain() throws Exception {
		pageNum = iob.getPageNum(rows);
		if(pageIndex < 1) {
			pageIndex = 1;
		} else if (pageIndex > pageNum) {
			pageIndex--;
		}
		orderList = iob.getListWithPage(rows, pageIndex);
		return "tomain";
	}
	
	public String toadd() throws Exception {
		beanList = ibb.getList();
		if(beanid != 0) {
			handleList = ibb.getHandlesWithBeanId(beanid);
		} else {
			handleList = ihb.getList();
		}
		return "toadd";
	}
	
	public String todelete() throws Exception {
		return "todelete";
	}
	
	public String toupdate() throws Exception {
		ov = iob.getOrder(id);
		beanList = ibb.getList();
		if(beanid != 0) {
			handleList = ibb.getHandlesWithBeanId(beanid);
		} else {
			handleList = ihb.getList();
		}
		return "toupdate";
	}
}
