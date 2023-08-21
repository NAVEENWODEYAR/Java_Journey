package com.aquila.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher 
{
	@Id
	int tId;
	String tName;
	String tAddress;
	double tSalary;
	String tmail;
	String tSubject;
}
