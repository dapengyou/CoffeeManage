package com.decks.coffeemanage.business.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.decks.coffeemanage.business.IHandleBusiness;
import com.decks.coffeemanage.value.HandleValue;

@Service("handlebusiness")
@Transactional
public class HandleBusinessImpl implements IHandleBusiness {
	
	private SessionFactory sf = null;
	
	@Autowired
	public HandleBusinessImpl(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void add(HandleValue hv) throws Exception {
		sf.getCurrentSession().save(hv);
		
	}

	@Override
	public void delete(HandleValue hv) throws Exception {
		sf.getCurrentSession().delete(hv);
		
	}

	@Override
	public void update(HandleValue hv) throws Exception {
		sf.getCurrentSession().update(hv);
		
	}

	@Override
	public List<HandleValue> getList() throws Exception {
		String hql = "from HandleValue";
		Query query = sf.getCurrentSession().createQuery(hql);
		return query.list();
	}

	@Override
	public HandleValue getHandle(int id) throws Exception {
		HandleValue hv = sf.getCurrentSession().get(HandleValue.class, id);
		return hv;
	}

}
