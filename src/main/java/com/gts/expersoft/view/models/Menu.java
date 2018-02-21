package com.gts.expersoft.view.models;

import java.util.List;

public class Menu {
	
	private String name;
	private boolean parent;
	private int level;
	private List<Menu> submenus;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Menu> getSubmenus() {
		return submenus;
	}
	public void setSubmenus(List<Menu> submenus) {
		this.submenus = submenus;
	}
	public boolean isParent() {
		return parent;
	}
	public void setParent(boolean parent) {
		this.parent = parent;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
}
