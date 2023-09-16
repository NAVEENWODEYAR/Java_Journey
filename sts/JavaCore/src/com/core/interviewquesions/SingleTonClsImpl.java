package com.core.interviewquesions;

public class SingleTonClsImpl 
{
	private static SingleTonClsImpl obj=null;
	
	private SingleTonClsImpl()
	{
		
	}
	
	public static SingleTonClsImpl getInstance()
	{
		if(obj == null)
		{
			obj = new SingleTonClsImpl();
		}
		return obj;
	}	
	public static void main(String[] args) 
	{
		SingleTonClsImpl obj = SingleTonClsImpl.getInstance();
		SingleTonClsImpl obj1 = SingleTonClsImpl.getInstance();
							
		System.out.println(obj.hashCode() == obj1.hashCode());
	}
}
