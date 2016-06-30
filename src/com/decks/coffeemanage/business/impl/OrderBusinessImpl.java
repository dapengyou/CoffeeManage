package com.decks.coffeemanage.business.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.decks.coffeemanage.business.IOrderBusiness;
import com.decks.coffeemanage.value.BeanValue;
import com.decks.coffeemanage.value.HandleValue;
import com.decks.coffeemanage.value.OrderValue;

@Service("orderbusiness")
@Transactional
public class OrderBusinessImpl implements IOrderBusiness {
	
	private SessionFactory sf = null;
	
	@Autowired
	public OrderBusinessImpl(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void add(OrderValue ov, int beanid, int handleid) throws Exception {
		Session session = sf.getCurrentSession();
		
		BeanValue bv = session.get(BeanValue.class, beanid);
		ov.setBean(bv);
		HandleValue hv = session.get(HandleValue.class, handleid);
		ov.setHandle(hv);
		
		session.save(ov);
		
	}

	@Override
	public void delete(OrderValue ov) throws Exception {
		sf.getCurrentSession().delete(ov);
		
	}

	@Override
	public void update(OrderValue ov, int beanid, int handleid) throws Exception {
		Session session = sf.getCurrentSession();
		BeanValue bv = session.get(BeanValue.class, beanid);
		ov.setBean(bv);
		HandleValue hv = session.get(HandleValue.class, handleid);
		ov.setHandle(hv);
		
		session.update(ov);
		
	}

	@Override
	public List<OrderValue> getList() throws Exception {
		String hql = "select ov from OrderValue ov";
		Query query = sf.getCurrentSession().createQuery(hql);
		return query.list();
	}

	@Override
	public OrderValue getOrder(int id) throws Exception {
		Session session = sf.getCurrentSession();
		OrderValue ov = session.get(OrderValue.class, id);
		return ov;
	}

	@Override
	public int getPageNum(int rows) throws Exception {
		String hql = "select count(ov.orderid) from OrderValue ov";
		Session session = sf.getCurrentSession();
		Query query = session.createQuery(hql);
		int sum = ((Long)query.uniqueResult()).intValue();
		
		int pageNum = 0;
		if(sum % rows == 0) {
			pageNum = sum / rows;
		} else {
			pageNum = sum / rows + 1;
		}
		return pageNum;
	}

	@Override
	public List<OrderValue> getListWithPage(int rows, int pageNo) throws Exception {
		String hql = "select ov from OrderValue ov";
		Query query = sf.getCurrentSession().createQuery(hql);
		query.setFirstResult(rows * (pageNo - 1));
		query.setMaxResults(rows);
		
		return query.list();
	}

}
