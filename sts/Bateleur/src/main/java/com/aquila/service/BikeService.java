package com.aquila.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquila.dto.BikeDTO;
import com.aquila.exception.BikeNotFoundException;
import com.aquila.modal.Bike;
import com.aquila.repo.BikeRepo;

@Service
public class BikeService  
{
	// DI of the repo object.,
	@Autowired
	private BikeRepo bikeRepo;
		
		// CRUD operations.,
		// 1. Insert the data to the table.,
		public Bike insertBike(BikeDTO bikeDTO)
		{
			Bike bike = new Bike(bikeDTO);
			bikeRepo.save(bike);
			return bike;
		}
		
		// 2. Select the list of available bikes.,
		public List<Bike> getBikes()
		{
			return bikeRepo.findAll();
		}
		
		// 3. select by Id.,
		public Optional<Bike> getBikeById(Integer bikeId)
		{
			Optional<Bike> bike = bikeRepo.findById(bikeId);
				if(bike.isPresent())
					{
						return bike;
					}
				else
				{
					throw new BikeNotFoundException("No such bike with the given id "+bikeId);
				}
			}
		
		// 4. update the bike using particular id
		public Bike updateBike (BikeDTO bikeDTO, Integer bikeId)
		{
			Bike bike = bikeRepo.findById(bikeId).get();
					if(bikeRepo.findById(bikeId).isPresent())
					{
						bike.setBikeName(bikeDTO.getBikeName());
						bike.setBikeMake(bikeDTO.getBikeMake());
						bike.setBikeModel(bikeDTO.getBikeModel());
						bike.setBikePrice(bikeDTO.getBikePrice());
						
						return bikeRepo.save(bike);
					}
					else
					{
						throw new BikeNotFoundException("No bike found with the given id "+bikeId);
					}
		}
		
		// 5. delete the bike by id.,
		public String deleteBike(Integer bikeId)
		{
			Optional<Bike> bike = bikeRepo.findById(bikeId);
				if(bike.isPresent())
				{
					 bikeRepo.deleteById(bikeId);
					 return "";
				}
				else
				{
					throw new BikeNotFoundException("Sorry no bike with the id "+bikeId);
				}
		}
		
		
		// Custom queries.,
		// findByName i,e SELECT * FROM bike WHERE bikName = bikeName;
		public Bike getBikeByName(String name)
		{
				Bike bike = bikeRepo.findBybikeName(name);
				if(bikeRepo.findBybikeName(name) == null)
				{
					throw new BikeNotFoundException("No bike with the provide name is present in the database.");
				}
				else
				{
					return bike;
				}
		}
		
}	
