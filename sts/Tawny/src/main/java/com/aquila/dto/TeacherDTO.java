package com.aquila.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDTO
{
	@NotEmpty(message = "Name can't be empty")
	String tName;
	
	@NotEmpty(message = "Please provide your address")
	String tAddress;
	
	@NotNull
	@Min(message = "Should be greater than the specified value",value = 46789)
	double tSalary;
	
//	@NotEmpty(message = "Enter proper mail id")
	@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z{2,3}]")
	String tmail;
	
	@NotEmpty(message = "Subject should be unique")
	String tSubject;
}
