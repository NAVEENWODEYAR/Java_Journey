package com.modal.modal;

public class Panda 
{
	private int id;
	private String name;
	
	// setters & getters.,
		public int getId()
		{
			return id;
		}
		public void setId(int id) 
		{
			this.id = id;
		}
		public String getName() 
		{
			return name;
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		// tostring()..,
		@Override
		public String toString() {
			return "Panda [id=" + id + ", name=" + name + "]";
		}
		
		
		
	
}
