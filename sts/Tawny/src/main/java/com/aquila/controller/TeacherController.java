package com.aquila.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/t")
public class TeacherController 
{
	
	@GetMapping("/getMsg")
	public String getMsg()
	{
		return "Sky is not the limit!";
	}
}
