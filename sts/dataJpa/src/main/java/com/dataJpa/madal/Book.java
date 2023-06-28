package com.dataJpa.madal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Book 
{

	// table columns
	@Id
	private int bId;
	private String bName;
	private int bPrice;
	private String bAuthor;
	
	// constructors
		public  Book()
		{
			// default constructor.,
		}
	// parameterized constructor
		public Book(int bId, String bName, int bPrice, String bAuthor)
		{
			super();
			this.bId = bId;
			this.bName = bName;
			this.bPrice = bPrice;
			this.bAuthor = bAuthor;
		}
	
	// setters & getters
		public int getbId()
		{
			return bId;
		}
		public void setbId(int bId)
		{
			this.bId = bId;
		}
		public String getbName()
		{
			return bName;
		}
		public void setbName(String bName) 
		{
			this.bName = bName;
		}
		public int getbPrice()
		{
			return bPrice;
		}
		public void setbPrice(int bPrice)
		{
			this.bPrice = bPrice;
		}
		public String getbAuthor() 
		{
			return bAuthor;
		}
		public void setbAuthor(String bAuthor) 
		{
			this.bAuthor = bAuthor;
		}
	
}
