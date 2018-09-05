package com.spring.testing.stock.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JspController {

	@RequestMapping(value = "/home")
	public ModelAndView Home(@RequestParam("username") String name) {

		ModelAndView mv = new ModelAndView();

		mv.addObject("name", name);
		mv.setViewName("home");
		return mv;

	}

	@RequestMapping(value = "/login")
	public String login(@RequestParam("username") String name, HttpSession session) {

		System.out.println("requested name is  " + name);

		session.setAttribute("username", name);
		return "home";

	}

}
