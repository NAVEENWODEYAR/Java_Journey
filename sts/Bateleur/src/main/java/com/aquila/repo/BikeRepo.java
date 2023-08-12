package com.aquila.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aquila.modal.Bike;

public interface BikeRepo extends JpaRepository<Bike, Integer> 
{

}
