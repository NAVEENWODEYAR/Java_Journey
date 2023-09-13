package com.aquila.modal;

import java.util.UUID;

import org.hibernate.annotations.Type;

import com.aquila.dto.TeacherDTO;

import jakarta.persistence.*;
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
	private int tId;
	
//	private UUID id = UUID.randomUUID();
	
	private String tName;
	private String tAddress;
	private double tSalary;
	private String tmail;
	private String tSubject;
	
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
