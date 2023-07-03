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
@Table(name = "My_Books")
@AllArgsConstructor
@NoArgsConstructor
public class BookStore 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer b_Id;
	private double b_Price;
	private String b_Author;
	private String b_Name;
	
	// default constructor.,
	public BookStore()
	{
		super();
	}
	// parameterized constructor
		public BookStore(double b_Price, String b_Author, String b_Name) 
		{
			super();
			this.b_Price = b_Price;
			this.b_Author = b_Author;
			this.b_Name = b_Name;
		}
}
