package com.bookstore.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Books")
public class BookStore 
{
	@Id
	private String id;
	
	@NonNull
	private double b_Price;
	
	@NonNull
	private String b_Author;
	
	@NonNull
	private String b_Name;

	
		// parameterized constructor.,,
		public BookStore(double b_Price, String b_Author, String b_Name) 
		{
			super();
			this.b_Price = b_Price;
			this.b_Author = b_Author;
			this.b_Name = b_Name;
		}
			// setters and getters.,
			public String getId()
			{
				return id;
			}
		

			public void setId(String id) 
			{
				this.id = id;
			}
		
			public double getB_Price() 
			{
				return b_Price;
			}
		
			public void setB_Price(double b_Price)
			{
				this.b_Price = b_Price;
			}
		
			public String getB_Author() 
			{
				return b_Author;
			}
		
			public void setB_Author(String b_Author)
			{
				this.b_Author = b_Author;
			}
		
			public String getB_Name()
			{
				return b_Name;
			}
		
			public void setB_Name(String b_Name)
			{
				this.b_Name = b_Name;
			}
			
}
