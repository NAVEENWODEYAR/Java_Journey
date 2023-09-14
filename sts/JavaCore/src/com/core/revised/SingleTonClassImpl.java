package com.core.revised;

public class SingleTonClassImpl
{
	
	public static void main(String[] args) 
	{
		SingleTonClass obj = SingleTonClass.getObject();
		SingleTonClass obj1 = SingleTonClass.getObject();
		
		System.out.println(obj==obj1);
	}
}
