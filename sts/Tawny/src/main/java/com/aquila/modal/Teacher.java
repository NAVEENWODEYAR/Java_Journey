package com.aquila.modal;

import com.aquila.dto.TeacherDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.TABLE)
	int tId;
	String tName;
	String tAddress;
	double tSalary;
	String tmail;
	String tSubject;
	
		// to initialize the values using the DTO class object.,
		public Teacher(TeacherDTO teacherDTO)
		{
			this.tName = teacherDTO.getTmail();
			this.tAddress = teacherDTO.getTAddress();
			this.tSalary = teacherDTO.getTSalary();
			this.tmail = teacherDTO.getTmail();
			this.tSubject = teacherDTO.getTSubject();
			
		}
}
