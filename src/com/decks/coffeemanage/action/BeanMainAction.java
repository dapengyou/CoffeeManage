package com.decks.coffeemanage.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.decks.coffeemanage.business.IBeanBusiness;
import com.decks.coffeemanage.business.IHandleBusiness;
import com.decks.coffeemanage.value.BeanValue;
import com.decks.coffeemanage.value.HandleValue;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

@Controller("beanMainAction")
@Scope("prototype")
public class BeanMainAction extends ActionSupport implements Preparable {
	
	private IHandleBusiness ihb = null;
	private IBeanBusiness ibb = null;
	private List<BeanValue> beanList = null;
	private List<HandleValue> handleList = null;
	private BeanValue bv = null;
	private int id = 0;
	
	public BeanValue getBv() {
		return bv;
	}

	public void setBv(BeanValue bv) {
		this.bv = bv;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Autowired
	public void setIbb(IBeanBusiness ibb) {
		this.ibb = ibb;
	}
	
	@Autowired
	public void setIhb(IHandleBusiness ihb) {
		this.ihb = ihb;
	}

	public String tomain() throws Exception {
		beanList = ibb.getList();
		return "tomain";
	}
	
	public String toadd() throws Exception {
		return "toadd";
	}
	
	public String todelete() throws Exception {
		return "todelete";
	}
	
	public String toupdate() throws Exception {
		bv = ibb.getBean(id);
		handleList = ihb.getList();
		return "toupdate";
	}

	@Override
	public void prepare() throws Exception {
		handleList = ihb.getList();
	}
}
