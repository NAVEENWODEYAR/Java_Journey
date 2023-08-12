package com.aquila.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aquila.dto.BikeDTO;
import com.aquila.dto.ResponseDTO;
import com.aquila.modal.Bike;
import com.aquila.service.BikeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/bike") //(http://localhost:8475/bike/)
public class BikeController
{
	// DI of the service object.,
	@Autowired
	private BikeService bikeService;
	
		// REST API generation
		// 1. post for sending the data.,
		@PostMapping("/insertBike")
		public ResponseEntity<ResponseDTO> insertBike(@Valid @RequestBody BikeDTO bikeDTO)
		{
			Bike bike = bikeService.insertBike(bikeDTO);
			ResponseDTO responseDTO = new ResponseDTO("Bike details inserted successfully.",bike);
			return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.ACCEPTED);
		}
		
		// 2. get for receiving the data.,
		@GetMapping("/getBike/{bikeId}")
		public ResponseEntity<ResponseDTO> getBikeById(@PathVariable Integer bikeId)
		{
			Optional<Bike> bike = bikeService.getBikeById(bikeId);
			ResponseDTO responseDTO = new ResponseDTO("Bike with the given is found",bike);
			return new ResponseEntity(responseDTO, HttpStatus.FOUND);
		}
		
		// 3. get all the records from the table.,
		@GetMapping("/getBikes")
		public ResponseEntity<ResponseDTO> getBikes()
		{
			List<Bike> bike = bikeService.getBikes();
			ResponseDTO responseDTO = new ResponseDTO("Details found",bike);
			return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.FOUND);
		}
		
		// 4. post for updating the data.,
		@PutMapping("/updateBike/{bikeId}")
		public ResponseEntity<ResponseDTO> updateBike(@RequestBody BikeDTO bikeDTO, @PathVariable Integer bikeId)
		{
			Bike bike = bikeService.updateBike(bikeDTO, bikeId);
			ResponseDTO responseDTO = new ResponseDTO("Bike details updated successfully",bike);
			return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.ACCEPTED);
		}
		
		// 5. delete for deleting the data from the table by id
		@DeleteMapping("/deleteBike/{bikeId}")
		public ResponseEntity<ResponseDTO> deleteById(@PathVariable Integer bikeId)
		{
			bikeService.deleteBike(bikeId);
			ResponseDTO responseDTO = new ResponseDTO("Bike details deleted from the database,","Bike id"+bikeId);
			return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.GONE);
		}
		
		// 6. custom queries, find the bike by name,
		@GetMapping("/getByName/{bikeName}")
		public ResponseEntity<ResponseDTO> getBikeByName(@PathVariable String bikeName)
		{
			Bike bike = bikeService.getBikeByName(bikeName);
			ResponseDTO responseDTO = new ResponseDTO("Bike with the name found,",bike);
			return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.FOUND);
		}
		
		// 7. select by condition
		@GetMapping("/getBikesPriceGreaterThan")
		public ResponseEntity<ResponseDTO> getBikesPriceGreaterThan()
		{
			List<Bike> bike = bikeService.getPriceGreaterThan();
			ResponseDTO responseDTO = new ResponseDTO("Available bikes are listed here,",bike);
			return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.FOUND);
		}
}
