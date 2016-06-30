package com.decks.coffeemanage.business;

import java.io.File;
import java.util.List;

import com.decks.coffeemanage.value.VarietyValue;

public interface IVarietyBusiness {
	public void add(VarietyValue vv) throws Exception;
	public void add(VarietyValue vv, File photo, String fileName, String contentType) throws Exception;
	public void delete(VarietyValue vv) throws Exception;
	public void update(VarietyValue vv) throws Exception;
	public void update(VarietyValue vv, File photo, String fileName, String contentType) throws Exception;
	public List<VarietyValue> getList() throws Exception;
	public VarietyValue getVariety(int id) throws Exception;
	public int getPageNum(int rows) throws Exception;
	public List<VarietyValue> getListWithPage(int rows, int pageNo) throws Exception;
}
