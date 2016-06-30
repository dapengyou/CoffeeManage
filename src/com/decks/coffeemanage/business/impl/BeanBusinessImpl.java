package com.decks.coffeemanage.business.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.decks.coffeemanage.business.IBeanBusiness;
import com.decks.coffeemanage.value.BeanValue;
import com.decks.coffeemanage.value.HandleValue;

@Service("beanbusiness")
@Transactional
public class BeanBusinessImpl implements IBeanBusiness {
	
	private SessionFactory sf = null;
	
	@Autowired
	public BeanBusinessImpl(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void add(BeanValue bv, int[] handles) throws Exception {
		Session session = sf.getCurrentSession();
		session.save(bv);
		
		for(int hid : handles) {
			HandleValue hv = session.get(HandleValue.class, hid);
			
			hv.getBeans().add(bv);
		}
		
	}

	@Override
	public void delete(BeanValue bv) throws Exception {
		Session session = sf.getCurrentSession();
		session.delete(bv);
		
	}

	@Override
	public void update(BeanValue bv, int[] handles) throws Exception {
		Session session = sf.getCurrentSession();
		session.update(bv);
		
		for(int hid : handles) {
			HandleValue hv = session.get(HandleValue.class, hid);
			
			hv.getBeans().add(bv);
		}
		
	}

	@Override
	public List<BeanValue> getList() throws Exception {
		String hql = "from BeanValue ";
		Session session = sf.getCurrentSession();
		Query query = session.createQuery(hql);
		
		return query.list();
	}

	@Override
	public BeanValue getBean(int id) throws Exception {
		Session session =  sf.getCurrentSession();
		BeanValue bv = session.get(BeanValue.class, id);
		return bv;
	}

	@Override
	public List<HandleValue> getHandlesWithBeanId(int beanId) throws Exception {
		String hql = "select hv from BeanValue bv join bv.handles hv where bv.beanid = :id";
		Session session = sf.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setInteger("id", beanId);
		
		return query.list();
	}

}
