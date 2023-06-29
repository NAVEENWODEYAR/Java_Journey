package com.bookstore.modal;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
//@Table(name = "My_Books")
@AllArgsConstructor
@NoArgsConstructor
public class BookStore 
{
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer b_Id;
	private double b_Price;
	private String b_Author;
	private String b_Name;
	
	// toString()
	@Override
	public String toString() {
		return "BookStore [b_Id=" + b_Id + ", b_Price=" + b_Price + ", b_Author=" + b_Author + ", b_Name=" + b_Name
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
