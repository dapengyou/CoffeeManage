package com.decks.coffeemanage.action;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.decks.coffeemanage.business.IVarietyBusiness;
import com.decks.coffeemanage.value.VarietyValue;

@Controller("varietyProcessAction")
@Scope("prototype")
public class VarietyProcessAction {

	private IVarietyBusiness ivb = null;
	private VarietyValue vv = null;
	private File photo = null;
	private String photoFileName = null;
	private String photoContentType = null;

	public File getPhoto() {
		return photo;
	}

	public void setPhoto(File photo) {
		this.photo = photo;
	}

	public String getPhotoFileName() {
		return photoFileName;
	}

	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}

	public String getPhotoContentType() {
		return photoContentType;
	}

	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}

	public VarietyValue getVv() {
		return vv;
	}

	public void setVv(VarietyValue vv) {
		this.vv = vv;
	}

	@Autowired
	public void setIvb(IVarietyBusiness ivb) {
		this.ivb = ivb;
	}

	public String add() throws Exception {
		if (photoFileName == null || photoFileName.equals("")) {
			ivb.add(vv);
		} else {
			ivb.add(vv, photo, photoFileName, photoContentType);
		}
		return "main";
	}

	public String delete() throws Exception {
		ivb.delete(vv);
		return "main";
	}

	public String update() throws Exception {
		if (photoFileName == null || photoFileName.equals("")) {
			ivb.update(vv);
		} else {
			ivb.update(vv, photo, photoFileName, photoContentType);
		}
		return "main";
	}
}
