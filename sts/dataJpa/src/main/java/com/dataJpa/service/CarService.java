package com.dataJpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dataJpa.madal.Car;
import com.dataJpa.repo.CarRepo;

@Service
public class CarService 
{
	@Autowired
	CarRepo carRepo;
	
	// 1. insert the data.,
	public Car insertRow(Car car)
	{
		return carRepo.save(car);
	}
	
	// 2. select query
	public List<Car> getRow()
	{
		return carRepo.findAll();
	}
}
