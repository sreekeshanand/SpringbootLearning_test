package com.spring.testing.stock.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.testing.stock.web.dao.User;
import com.spring.testing.stock.web.reprository.LoginRepo;

@Controller
public class JspController {
	@Autowired
	LoginRepo repo;

	@RequestMapping(value = "/home")
	public ModelAndView Home(@RequestParam("username") String name) {

		ModelAndView mv = new ModelAndView();

		mv.addObject("name", name);
		mv.setViewName("home");
		return mv;

	}
	
	@RequestMapping(value = "/home/user")
	public ModelAndView Home(User user) {

		ModelAndView mv = new ModelAndView();

		mv.addObject("obqj", user);
		mv.setViewName("home");
		return mv;

	}

	@RequestMapping(value = "/login")
	public String login(@RequestParam("username") String name, HttpSession session) {

		System.out.println("requested name is  " + name);

		session.setAttribute("username", name);
		return "home";

	}@RequestMapping(value = "/Userlogin")
	public String login() {

		
		return "login";

	}
	@RequestMapping(value = "/addUser")
	public String AddUser(User user) {
System.out.println(user.toString());
		repo.save(user);
		return "login";

	}
}
