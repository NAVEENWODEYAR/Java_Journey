package com.dataJpa.madal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Book 
{

	// table columns
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bId;
	private String bName;
	private int bPrice;
	private String bAuthor;
	private String aMail;
	
	// constructors
		public  Book()
		{
			// default constructor.,
		}
	// parameterized constructor
		public Book(String bName, int bPrice, String bAuthor, String aMail)
		{
			super();
			this.bName = bName;
			this.bPrice = bPrice;
			this.bAuthor = bAuthor;
			this.aMail = aMail;	
		}
	
		public String getaMail() 
		{
			return aMail;
		}
		public void setaMail(String aMail) 
		{
			this.aMail = aMail;
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
