package com.core.interviewquesions;

public class ConstructorChaining
{
	private String name;
	private int stId;
	
	public ConstructorChaining()
	{
		// calling the parameterized constructor,
		this("Boss",1);
	}
	
	public ConstructorChaining(String a,int b)
	{
		this.name = a;
		this.stId= b;
	}
	public static void main(String[] args) 
	{
		ConstructorChaining obj = new ConstructorChaining();
		ConstructorChaining obj1 = new ConstructorChaining("Bhas",2);
		
		System.out.println("Student name-> "+obj.name);
		System.out.println("Student id-> "+obj.stId);
		
		System.out.println("Student name-> "+obj1.name);
		System.out.println("Student id-> "+obj1.stId);

	}
}
