package com.pet.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PitBull 
{
	@RequestMapping("/p")
	public String displayAge()
	{
		System.out.println("Displays age..,");
		return "28";
	}
	@RequestMapping("/p1")
	public ModelAndView getIndex()
	{
		System.out.println("index page is waiting.,");
		return new ModelAndView ("index");
	}
}
