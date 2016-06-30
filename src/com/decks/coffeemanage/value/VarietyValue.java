package com.decks.coffeemanage.value;

import java.sql.Blob;

public class VarietyValue {
	
	private int varietyid = 0;
	private String varietyname = null;
	private String engname = null;
	private String element = null;
	private Blob photo = null;
	private String photoFileName = null;
	private String photoContentType = null;
	
	public int getVarietyid() {
		return varietyid;
	}
	public void setVarietyid(int varietyid) {
		this.varietyid = varietyid;
	}
	public String getVarietyname() {
		return varietyname;
	}
	public void setVarietyname(String varietyname) {
		this.varietyname = varietyname;
	}
	public String getEngname() {
		return engname;
	}
	public void setEngname(String engname) {
		this.engname = engname;
	}
	public String getElement() {
		return element;
	}
	public void setElement(String element) {
		this.element = element;
	}
	public Blob getPhoto() {
		return photo;
	}
	public void setPhoto(Blob photo) {
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
	
}
