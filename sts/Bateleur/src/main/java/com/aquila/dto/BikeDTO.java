package com.aquila.dto;

import java.time.Year;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor@NoArgsConstructor
public class BikeDTO 
{
	@NotEmpty(message = "Please provide your bike name")
	private String bikeName;
	
	@NotEmpty(message = "Idiot type your company name")
	private String bikeMake;
	
	@NotNull
	private double bikePrice;
	
	@Past(message = "Should be past year")
	@JsonProperty
	private Year bikeModel;
}
