package com.dabur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Controller
public class Test1 
{
//	@RequestMapping("/test")
//	public String tellAge()
//	{
//		System.out.println("Tell your age..,");
//		return "28 years old...,";
//	}
	
	@GetMapping("/index")
	public ModelAndView getIndex()
	{
		System.out.println("Please help me..,");
		return new ModelAndView("index");
	}
}
