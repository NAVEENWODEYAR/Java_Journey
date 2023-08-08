package com.swager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Swagger_Controller 
{
	// dummy API for testing
	//http://localhost:1234/swagerHomePage
	@GetMapping("/swagerHomePage")
	public String getSwagerHome()
	{
		return "Welcome to Swagger API.,";
	}
}
