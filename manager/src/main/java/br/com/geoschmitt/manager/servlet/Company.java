package br.com.geoschmitt.manager.servlet;

import java.util.Date;

public class Company {
	
	private int id;
	private String name;
	private Date date = new Date();
	
	public int getId() {
		return id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
