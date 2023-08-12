package com.aquila.modal;

import java.time.Year;

import com.aquila.dto.BikeDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Bike
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bikeId;
	
	private String bikeName;
	private String bikeMake;
	private double bikePrice;
	private Year bikeModel;
	
		// DTO class object for initializing the object value.,
		public Bike(BikeDTO bikeDTO)
		{
			this.bikeName = bikeDTO.getBikeMake();
			this.bikeMake = bikeDTO.getBikeMake();
			this.bikePrice = bikeDTO.getBikePrice();
			this.bikeModel = bikeDTO.getBikeModel();
		}

}
