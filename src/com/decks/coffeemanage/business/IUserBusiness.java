package com.decks.coffeemanage.business;

import com.decks.coffeemanage.value.UserValue;

public interface IUserBusiness {
	
	public UserValue getUserByName(String name) throws Exception;
	public void add(UserValue uv) throws Exception;
}
