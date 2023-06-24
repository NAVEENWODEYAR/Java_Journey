package com.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MadRunner
{
	@GetMapping("/ind")
	public ModelAndView getIndex()
	{
		System.out.println("inside the index page..,");
		return new ModelAndView("index");
	}

}
