package com.decks.coffeemanage.business;

import java.util.List;

import com.decks.coffeemanage.value.OrderValue;

public interface IOrderBusiness {
	public void add(OrderValue ov, int beanid, int handleid) throws Exception;
	public void delete(OrderValue ov) throws Exception;
	public void update(OrderValue ov, int beanid, int handleid) throws Exception;
	public List<OrderValue> getList() throws Exception;
	public OrderValue getOrder(int id) throws Exception;
	public int getPageNum(int rows) throws Exception;
	public List<OrderValue> getListWithPage(int rows, int pageNo) throws Exception;
}
