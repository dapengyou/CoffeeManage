package com.decks.coffeemanage.business.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.decks.coffeemanage.business.IUserBusiness;
import com.decks.coffeemanage.value.UserValue;

@Service("userbusiness")
@Transactional
public class UserBusinessImpl implements IUserBusiness {
	
	private SessionFactory sf = null;
	
	@Autowired
	public UserBusinessImpl(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public UserValue getUserByName(String name) throws Exception {
		String hql = "from UserValue uv where uv.name= :name";
		
		Session session = sf.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setString("name", name);
		List<UserValue> list = query.list();
		UserValue uv = null;
		for(int i=0; i<list.size(); i++) {
			uv = list.get(i);
		}
		return uv;
	}

	@Override
	public void add(UserValue uv) throws Exception {
		sf.getCurrentSession().save(uv);
	}

}
