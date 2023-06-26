package com.modal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopRunner
{
	@GetMapping("/form")
	public String form()
	{
		System.out.println("Inside the table..,");
		return "form.jsp";
	}
}
