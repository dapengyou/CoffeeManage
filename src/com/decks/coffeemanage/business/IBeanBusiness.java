package com.decks.coffeemanage.business;

import java.util.List;

import com.decks.coffeemanage.value.BeanValue;
import com.decks.coffeemanage.value.HandleValue;

public interface IBeanBusiness {
	public void add(BeanValue bv, int[] handles) throws Exception;
	public void delete(BeanValue bv) throws Exception;
	public void update(BeanValue bv, int[] handles) throws Exception;
	public List<BeanValue> getList() throws Exception;
	public BeanValue getBean(int id) throws Exception;
	public List<HandleValue> getHandlesWithBeanId(int beanId) throws Exception;
}
