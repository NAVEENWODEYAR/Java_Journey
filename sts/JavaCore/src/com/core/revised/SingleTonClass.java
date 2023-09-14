package com.core.revised;

import java.io.Serializable;

public class SingleTonClass
{
	private static SingleTonClass obj=null;
	
	private SingleTonClass()
	{
		
	}
	
	public static SingleTonClass getObject()
	{
		if(obj == null)
		{
			obj = new SingleTonClass();
		}
		return obj;
	}
	
	public static void main(String[] args) 
	{
		SingleTonClass s1 = SingleTonClass.getObject();
		SingleTonClass s2 = SingleTonClass.getObject();
		SingleTonClass s3 = new SingleTonClass();
		
		// check weather it is interface or not
		System.out.println(s3.getClass().getInterfaces());
		if(Serializable.class.isInterface())
			System.out.println(true);
		
		System.out.println(s1.hashCode()+"--"+s1.equals(s2)+"--"+s2.hashCode());
		System.out.println(s2.hashCode()+"--"+s2.equals(s3)+"--"+s3.hashCode());
	}
}
