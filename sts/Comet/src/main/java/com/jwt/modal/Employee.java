package com.jwt.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int empId;
	private String empName;
	private String empMail;
	private double empSal;

}
