package com.core.cls;

import java.util.*;

public class ColoneOfSingleTon 
{

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		SingleTonCls obj = SingleTonCls.getInstance();
					System.out.println("Original object hashcode "+obj.hashCode());
					
		// Cloning 
		SingleTonCls clonedInstance = (SingleTonCls) obj.clone();	
		System.out.println("Cloned object hashcode "+clonedInstance.hashCode());
		System.out.println(obj==clonedInstance);
		
		
		Map<String, Integer> mp = new HashMap();
							mp.put("One", 1);
							
							mp.entrySet().forEach(System.out::println);
		
	}

}
