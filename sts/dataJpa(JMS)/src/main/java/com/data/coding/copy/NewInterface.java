package com.data.coding.copy;

interface Test
{
	// abstract method
	void add();
	
	// default method,
	default public void test()
	{
		System.out.println("Default method in the interface");
	}
	
	static void tell()
	{
		System.out.println("Static mehtod in the interface.,");
	}
}
public class NewInterface implements Test
{
	public void add()
	{
		System.out.println("Abstract method of the interfaces");
	}
	public static void main(String[] args) 
	{
		new NewInterface().add();
		Test.tell();
		new NewInterface().test();
	}

	

}
