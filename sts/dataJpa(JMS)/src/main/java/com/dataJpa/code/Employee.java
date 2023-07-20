package com.dataJpa.code;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee 
{
	private int eId;
	private String eName;
	private String eMail;
	private double eSal;
	private String eDept;
	private String eGender;
	private int yearOfJoining;
}
