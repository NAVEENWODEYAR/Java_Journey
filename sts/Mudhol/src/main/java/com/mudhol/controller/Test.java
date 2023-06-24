package com.mudhol.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class Test 
{
	@GetMapping("/t")
	public String test(Model md)
	{
		md.addAttribute("date", new Date().toLocaleString());
		System.out.println("Pure Desi..,");
		return "index";
	}
	
	@GetMapping("/home")
	public String getHome()
	{
		System.out.println("waiting for the home page..,");
		return "home";
	}
}
