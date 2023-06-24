package com.annotation.model;

@FirstAnnot
public class FirstAnnotClsEx 
{
	//constructor
	public FirstAnnotClsEx(int age, String name)
	{
		this.age = age;
		this.petName = name;
	}
	// instance variables..,
	int age;
	String petName;
	
	// method
	@Dog
	public void disp()
	{
		System.out.println(this.age);
		System.out.println(this.petName);

	}
}
