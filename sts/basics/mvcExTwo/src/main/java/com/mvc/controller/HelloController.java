package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@GetMapping("/index")
	public ModelAndView getIndexPage()
	{
		return new ModelAndView("index");
	}
	
	@GetMapping("/home")
	public ModelAndView getHome()
	{
		return new ModelAndView("home");
	}

}
