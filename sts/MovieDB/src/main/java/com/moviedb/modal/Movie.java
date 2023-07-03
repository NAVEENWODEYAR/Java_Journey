package com.moviedb.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Movie 
{
	@Id
	private String mid;
	private int m_ID;
	private String m_Name;
	private String m_Type;
	private double m_Budjet;
	
	public Movie( int m_ID, String m_Name, String m_Type, double m_Budjet) 
	{
		super();
//		this.mid = mid;
		this.m_ID = m_ID;
		this.m_Name = m_Name;
		this.m_Type = m_Type;
		this.m_Budjet = m_Budjet;
	}

	public Movie() 
	{
		super();
	}
	
	
	
	

}
