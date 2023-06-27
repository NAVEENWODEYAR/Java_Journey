package com.dataJpa.madal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class Car 
{	@Id
	private int carNo;
	private String carName;
	private String carCompany;
	private double price;
	
	// default constructor,
		public Car() 
		{
			super();
		} 
		
	// setters and getters,
		public int getCarNo() 
		{
			return carNo;
		}

		public void setCarNo(int carNo) 
		{
			this.carNo = carNo;
		}

		public String getCarName() 
		{
			return carName;
		}

		public void setCarName(String carName) 
		{
			this.carName = carName;
		}

		public String getCarCompany() 
		{
			return carCompany;
		}

		public void setCarCompany(String carCompany) 
		{
			this.carCompany = carCompany;
		}

		public double getPrice()
		{
			return price;
		}

		public void setPrice(double price)
		{
			this.price = price;
		}	
}
