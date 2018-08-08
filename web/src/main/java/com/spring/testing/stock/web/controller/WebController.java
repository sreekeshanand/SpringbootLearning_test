package com.spring.testing.stock.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.testing.stock.web.service.ServicePerson;

@RestController
public class WebController {
	@Autowired
	private ServicePerson SP;
	@Autowired
	private JdbcTemplate jdbc;

	@RequestMapping(value = "/getPersonData", method = RequestMethod.GET)
	public ServicePerson getData() {

		SP.setId(25);
		SP.setName("anand");
		SP.setQoute("test");
		SP.setPrice(100);
		return SP;

	}

	@RequestMapping(value = "/getData", method = RequestMethod.GET)
	public String getData1() {

		return "Hello SSL ";

	}

	@RequestMapping(value = "/getTableData", method = RequestMethod.GET)
	public void getTableData() {

		String sql ="insert into person_Data ( id  , name  , Age  ) where ( 1,'anand',999)";
		try {
			jdbc.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@RequestMapping(value = "/createTable", method = RequestMethod.PUT)
	public void getCreateTable() {
String sql ="Create table person_Data ( id serial , name varchar(255) , Age int (3) )";
		try {
			jdbc.execute(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// return "Hello SSL ";

	}

}
