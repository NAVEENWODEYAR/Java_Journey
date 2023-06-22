package com.mudhol.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test 
{
	@GetMapping("t")
	public String test()
	{
		System.out.println("Pure Desi..,");
		return "Tall fellow..,";
	}
}
