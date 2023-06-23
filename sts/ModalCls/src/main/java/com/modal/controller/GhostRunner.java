package com.modal.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GhostRunner 
{
	@GetMapping("/index")
	public ModelAndView test()
	{
		System.out.println("inside the controller..,");
		return new ModelAndView("index");
	}
	
	@GetMapping("/home")
	public String getHome(Model md)
	{
		md.addAttribute("date", new Date());
		System.out.println("inside the home page..,");
		return "home";
	}
	
	@GetMapping("/reg")
	public String getRegistration()
	{
		System.out.println("Inside the registration page..,");
		return "registration";
	}
}
