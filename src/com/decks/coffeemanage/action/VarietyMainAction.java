package com.decks.coffeemanage.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.decks.coffeemanage.business.IVarietyBusiness;
import com.decks.coffeemanage.value.VarietyValue;

@Controller("varietyMainAction")
@Scope("prototype")
public class VarietyMainAction {
	
	private IVarietyBusiness ivb = null;
	private VarietyValue vv = null;
	private List<VarietyValue> varietyList = null;
	private int id = 0;
	private int rows = 1;
	private int pageIndex = 1;
	private int pageNum = 0;
	
	@Autowired
	public void setIvb(IVarietyBusiness ivb) {
		this.ivb = ivb;
	}	
	
	public List<VarietyValue> getVarietyList() {
		return varietyList;
	}

	public void setVarietyList(List<VarietyValue> varietyList) {
		this.varietyList = varietyList;
	}

	public VarietyValue getVv() {
		return vv;
	}

	public void setVv(VarietyValue vv) {
		this.vv = vv;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public String tomain() throws Exception {
		pageNum = ivb.getPageNum(rows);
		if(pageIndex < 1) {
			pageIndex = 1;
		} else if (pageIndex > pageNum) {
			pageIndex--;
		}
		varietyList = ivb.getListWithPage(rows, pageIndex);
		return "tomain";
	}

	public String toadd() throws Exception {
		return "toadd";
	}
	
	public String todelete() throws Exception {
		return "todelete";
	}
	
	public String toupdate() throws Exception {
		vv = ivb.getVariety(id);
		return "toupdate";
	}
	
}
