package com.spring.testing.stock.web.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private  int id ;
	private  String name  ;
	
	//private  String language;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
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

//	public String getLanguage() {
//		return language;
//	}
//
//	public void setLanguage(String language) {
//		this.language = language;
//	}
	
	
	
	
}
