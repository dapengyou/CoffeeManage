package com.decks.coffeemanage.value;

import java.util.Set;

public class HandleValue {
	private int handleid = 0;
	private String handlestyle = null;
	private String bakingdegree = null;
	private Set<BeanValue> beans = null;
	
	public int getHandleid() {
		return handleid;
	}
	public void setHandleid(int handleid) {
		this.handleid = handleid;
	}
	public String getHandlestyle() {
		return handlestyle;
	}
	public void setHandlestyle(String handlestyle) {
		this.handlestyle = handlestyle;
	}
	public String getBakingdegree() {
		return bakingdegree;
	}
	public void setBakingdegree(String bakingdegree) {
		this.bakingdegree = bakingdegree;
	}
	public Set<BeanValue> getBeans() {
		return beans;
	}
	public void setBeans(Set<BeanValue> beans) {
		this.beans = beans;
	}
	
}
