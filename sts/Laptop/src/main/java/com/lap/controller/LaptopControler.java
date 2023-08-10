package com.lap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lap.modal.Laptop;
import com.lap.service.LaptopService;

@RestController
@RequestMapping("/lap")
public class LaptopControler
{
	// DI,
	@Autowired
	private LaptopService lapService;
	
		// REST API's.,
		// 1. PostMapping for sending the data into the table.,(http://localhost:8765/lap/insertLaptop)
		@PostMapping("/insertLaptop")
		public Laptop insertLap(@RequestBody Laptop lp)
		{
			return lapService.insertLaptop(lp);
		}
	
}
