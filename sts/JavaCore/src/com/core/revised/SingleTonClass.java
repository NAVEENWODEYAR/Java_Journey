package com.core.revised;

public class SingleTonClass
{
	private static SingleTonClass obj;
	
	private SingleTonClass()
	{
		
	}
	
	public static SingleTonClass getObject()
	{
		if(obj== null)
		{
			obj = new SingleTonClass();
		}
		return obj;
	}
}
