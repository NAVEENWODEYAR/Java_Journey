package com.aquila.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDTO
{
	String tName;
	String tAddress;
	double tSalary;
	String tmail;
	String tSubject;
}
