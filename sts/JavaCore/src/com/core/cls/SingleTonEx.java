package com.core.cls;

public class SingleTonEx
{
	
	public static void main(String[] args)
	{
		SingleTonCls obj = SingleTonCls.getInstance();
		SingleTonCls obj1 = SingleTonCls.getInstance();
					System.out.println(obj==obj1);
		
	}
	// instance block
	{
		System.out.println("SingleTon Class,");
		System.out.println("Singleton class will have only one instance through out your application");
	}
}
