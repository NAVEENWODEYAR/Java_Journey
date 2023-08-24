package com.data.colln.copy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee 
{
	private int eId;
	private int eAge;
	private String eName;
	private String eGender;
	private String eDepartment;
	private int yearOfJoining;
	private double eSalary;
}
