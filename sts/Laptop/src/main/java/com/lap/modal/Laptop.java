package com.lap.modal;

import java.time.Year;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Laptop 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int lapId;
	private String lapCompany;
	private String lapName;
	private Year lapModel;
	
}
