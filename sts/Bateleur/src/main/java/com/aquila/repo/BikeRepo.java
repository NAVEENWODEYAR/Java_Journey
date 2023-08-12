package com.aquila.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aquila.modal.Bike;

public interface BikeRepo extends JpaRepository<Bike, Integer> 
{
	// @Query to create the custom queries.,
	@Query(value = "SELECT * FROM bike WHERE bikeName =: name ")
	Bike findBybikeName(String name);
	
	
}
