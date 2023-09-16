package com.core.interviewquesions;

public class SingleTonClsImpl implements Cloneable
{
	public static void main(String[] args) 
	{
		SingleTonCls obj = SingleTonCls.getInstance();
		SingleTonCls obj1 = SingleTonCls.getInstance();
							
		System.out.println(obj.hashCode() == obj1.hashCode());
		
		// Cloning to break the singleton class pattern,
		try 
		{
			SingleTonCls obj2 = (SingleTonCls) obj.clone();
			System.out.println(obj.hashCode()+"<-->"+obj2.hashCode());
		} 
		catch (CloneNotSupportedException e) 
		{
			e.printStackTrace();
		}
	}
}
