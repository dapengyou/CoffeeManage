package com.decks.coffeemanage.business;

import java.util.List;

import com.decks.coffeemanage.value.HandleValue;

public interface IHandleBusiness {
	public void add(HandleValue hv) throws Exception;
	public void delete(HandleValue hv) throws Exception;
	public void update(HandleValue hv) throws Exception;
	public List<HandleValue> getList() throws Exception;
	public HandleValue getHandle(int id) throws Exception; 
}
