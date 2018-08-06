package com.spring.testing.stock.web.service;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Service;

@Service
@XmlRootElement
public class ServicePerson {

	
	private int id;
	private String name;
	private String qoute;
	private int price;
	
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
	public String getQoute() {
		return qoute;
	}
	public void setQoute(String qoute) {
		this.qoute = qoute;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
