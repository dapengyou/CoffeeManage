package com.decks.coffeemanage.action;

import java.io.InputStream;
import java.sql.Blob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.decks.coffeemanage.business.IVarietyBusiness;
import com.decks.coffeemanage.value.VarietyValue;

@Controller("varietyPhotoShowAction")
@Scope("prototype")
public class VarietyPhotoShowAction {

	private IVarietyBusiness ivb = null;
	private VarietyValue vv = null;
	private int id = 0;
	private String fileName = null;
	private String contentType = null;

	@Autowired
	public void setIvb(IVarietyBusiness ivb) {
		this.ivb = ivb;
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

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public InputStream getInputStream() throws Exception {
		vv = ivb.getVariety(id);
		Blob photo = vv.getPhoto();
		fileName = vv.getPhotoFileName();
		contentType = vv.getPhotoContentType();

		return photo.getBinaryStream();
	}

	public String show() throws Exception {
		return "show";
	}
}
