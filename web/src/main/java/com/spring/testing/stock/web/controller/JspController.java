package com.spring.testing.stock.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {


	@RequestMapping(value = "/home")
	public String Home() {
		System.out.println("LIST of JSP ");
		return "home";

	}
	
	@RequestMapping(value = "/login")
	public String login(HttpServletRequest req) {
		
		HttpSession session= req.getSession();
		String name =req.getParameter("username");
		System.out.println("requested name is  "+ name);
		
		session.setAttribute("username", name);
		return "home";

	}

	

}
