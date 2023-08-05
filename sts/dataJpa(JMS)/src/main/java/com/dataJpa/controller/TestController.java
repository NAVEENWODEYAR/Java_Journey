package com.dataJpa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController
{

	@GetMapping
	public String dockMethod()
	{
		return "Created using the Docker.,";
	}
}
