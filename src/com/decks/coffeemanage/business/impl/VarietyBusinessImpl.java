package com.decks.coffeemanage.business.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.util.List;

import org.hibernate.LobHelper;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.decks.coffeemanage.business.IVarietyBusiness;
import com.decks.coffeemanage.value.VarietyValue;

@Service("varietybusiness")
@Transactional
public class VarietyBusinessImpl implements IVarietyBusiness {
	
	private SessionFactory sf = null;
	
	@Autowired
	public VarietyBusinessImpl(SessionFactory sf) {
		this.sf = sf;
	}

	@Override
	public void add(VarietyValue vv) throws Exception {
		sf.getCurrentSession().save(vv);
		
	}

	@Override
	public void delete(VarietyValue vv) throws Exception {
		sf.getCurrentSession().delete(vv);
		
	}

	@Override
	public void update(VarietyValue vv) throws Exception {
		sf.getCurrentSession().update(vv);
		
	}

	@Override
	public List<VarietyValue> getList() throws Exception {
		String hql = "from VarietyValue";
		Query query = sf.getCurrentSession().createQuery(hql);
		return query.list();
	}

	@Override
	public void add(VarietyValue vv, File photo, String fileName, String contentType) throws Exception {
		vv.setPhotoFileName(fileName);
		vv.setPhotoContentType(contentType);
		
		LobHelper lh = sf.getCurrentSession().getLobHelper();
		InputStream in = new FileInputStream(photo);
		Blob bphoto = lh.createBlob(in, in.available());
		vv.setPhoto(bphoto);
		
		sf.getCurrentSession().save(vv);
		
	}

	@Override
	public VarietyValue getVariety(int id) throws Exception {
		VarietyValue vv = sf.getCurrentSession().get(VarietyValue.class, id);
		return vv;
	}

	@Override
	public void update(VarietyValue vv, File photo, String fileName, String contentType) throws Exception {
		vv.setPhotoFileName(fileName);
		vv.setPhotoContentType(contentType);
		
		LobHelper lh = sf.getCurrentSession().getLobHelper();
		InputStream in = new FileInputStream(photo);
		Blob bphoto = lh.createBlob(in, in.available());
		vv.setPhoto(bphoto);
		
		sf.getCurrentSession().update(vv);
	}

	@Override
	public int getPageNum(int rows) throws Exception {
		String hql = "select count(vv.varietyid) from VarietyValue vv";
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
	public List<VarietyValue> getListWithPage(int rows, int pageNo) throws Exception {
		String hql = "select vv from VarietyValue vv";
		Query query = sf.getCurrentSession().createQuery(hql);
		query.setFirstResult(rows * (pageNo - 1));
		query.setMaxResults(rows);
		
		return query.list();
	}

}
