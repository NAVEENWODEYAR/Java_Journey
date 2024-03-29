package com.aquila.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.aquila.modal.Bike;

public interface BikeRepo extends JpaRepository<Bike, Integer> 
{
	// @Query to create the custom queries.,
	@Query(value = "SELECT * FROM bike WHERE bike.bike_name =:name ",nativeQuery = true)
	Bike findBybikeName(String name);
	
	@Query(value = "SELECT * FROM bike WHERE bike.bike_price >=100000",nativeQuery = true)
	List<Bike> findBypriceGreaterThan();
	
	
}
