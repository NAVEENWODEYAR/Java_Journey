package com.core.interviewquesions;

import java.lang.reflect.Constructor;

public class SingleTonClsImpl 
{
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException 
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
		
		// reflection to break the singleton class design pattern,
		Class<?> reflection = Class.forName("com.core.interviewquesions");
		Constructor<SingleTonCls> constructor = (Constructor<SingleTonCls>) reflection.getDeclaredConstructor(null);
									constructor.setAccessible(true);
									SingleTonCls obj4 = obj.getInstance();
									System.out.println("*****Reflection******");
									System.out.println("Hashcode of the reflected object,"+obj4.hashCode());
	
	}
}
