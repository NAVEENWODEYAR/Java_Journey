package com.dataJpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dataJpa.madal.Car;

@Repository
public interface CarRepo extends JpaRepository<Car,Integer>
{
	// interface using the JpaRepository
}
