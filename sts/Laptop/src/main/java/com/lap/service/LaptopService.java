package com.lap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lap.modal.Laptop;
import com.lap.repo.LaptopRepo;

@Service
public class LaptopService
{
	// DI,
	@Autowired
	private LaptopRepo lapRepo;
	
		// CRUD operations.,
		// insert the Laptop details into the table.,
		public Laptop insertLaptop(Laptop lapTop)
		{
			return lapRepo.save(lapTop);
		}

}
