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
//@AllArgsConstructor
//@NoArgsConstructor
public class BookStore 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer b_Id;
	private double b_Price;
	private String b_Author;
	private String b_Name;
	
	public BookStore()
	{
		
	}
	
	// parameterized constructor
		public BookStore(double b_Price, String b_Author, String b_Name) 
		{
			super();
			this.b_Price = b_Price;
			this.b_Author = b_Author;
			this.b_Name = b_Name;
		}
	
	// toString()
		@Override
		public String toString() 
		{
			return "BookStore [b_Id=" + b_Id + ", b_Price=" + b_Price + ", b_Author=" + b_Author + ", b_Name=" + b_Name
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}

		public Integer getB_Id() {
			return b_Id;
		}

		public void setB_Id(Integer b_Id) {
			this.b_Id = b_Id;
		}

		public double getB_Price() {
			return b_Price;
		}

		public void setB_Price(double b_Price) {
			this.b_Price = b_Price;
		}

		public String getB_Author() {
			return b_Author;
		}

		public void setB_Author(String b_Author) {
			this.b_Author = b_Author;
		}

		public String getB_Name() {
			return b_Name;
		}

		public void setB_Name(String b_Name) {
			this.b_Name = b_Name;
		}

	
	
}
