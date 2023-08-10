package com.lap.service;

import java.util.List;

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
		// 1.insert the Laptop details into the table.,
		public Laptop insertLaptop(Laptop lapTop)
		{
			return lapRepo.save(lapTop);
		}
		
		// 1.a insert the List to the table,
		public List<Laptop> insertLaps(List<Laptop> lap)
		{
			List<Laptop> laps = lapRepo.saveAll(lap);
			return laps;
		}
		
		// 2. select the data.,
		public List<Laptop> getLaps()
		{
			return lapRepo.findAll();
		}
		
		// 2.a select the record.,
		public Laptop getLap(int lapId)
		{
			return lapRepo.findById(lapId).get();
		}
		
		// 3. update the data.,
		public Laptop updateLap(Laptop lap, int lapId)
		{
			Laptop lp = lapRepo.findById(lapId).get();
					lp.setLapName(lap.getLapName());
					lp.setLapCompany(lap.getLapCompany());
					lp.setLapModel(lap.getLapModel());
					
					return lapRepo.save(lp);
		}
		
		// 4. delete the record.,
		public String deleteLap(int lapId)
		{
			lapRepo.deleteById(lapId);
			return "";
		}

}
