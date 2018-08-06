package com.spring.testing.stock.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.testing.stock.web.service.ServicePerson;


@RestController
public class WebController {
	@Autowired
	private ServicePerson SP;
	@RequestMapping(value="/getPersonData",method=RequestMethod.GET)
	public ServicePerson getData()
	{
		
		SP.setId(25);
		SP.setName("anand");
		SP.setQoute("test");
		SP.setPrice(100);
		return SP;
		
	}
	
	

}
