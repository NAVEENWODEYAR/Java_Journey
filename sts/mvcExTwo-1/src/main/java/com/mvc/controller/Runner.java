package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Runner 
{
	@GetMapping("/i")
	public ModelAndView getIndex()
	{
		System.out.println("inside the index page..,");
		return new ModelAndView("index");
	}
	
	@GetMapping("/a")
	public ModelAndView getAbout()
	{
		System.out.println("inside the about page..,");
		return new ModelAndView("about");
	}
}
