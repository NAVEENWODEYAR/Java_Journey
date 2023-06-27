package com.dataJpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dataJpa.madal.Car;
import com.dataJpa.service.CarService;

@RestController
public class CarController 
{
	@Autowired
	CarService carService;
	
	// generating the API
	@PostMapping("/insertCar")
	public Car insertRow(@RequestBody Car car)
	{
		Car car1 = carService.insertRow(car);
		return car1;
	}
	
	@GetMapping("/getCar")
	public List<Car> getRow()
	{
		return carService.getRow();
	}
}
