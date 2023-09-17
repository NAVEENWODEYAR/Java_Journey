//Write a Java Program to iterate HashMap using While and advance for loop.
package com.core.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashMap 
{
	static
	{
		HashMap<String, Boolean> hm = new HashMap<>();
								hm.put("One", true);
								hm.put("Two", false);
								hm.put("", true);
								hm.put("Null", false);
								hm.put("Zero", false);
								hm.put("Two", true);
								
		// Iterating using for-loop, Map.entrySet()
								for(Map.Entry<String, Boolean> entry: hm.entrySet())
								{
									System.out.println(entry.getKey()+":"+entry.getValue());
								}
//								System.out.println(hm);
//								System.out.println(hm.entrySet());
								
		// using keySet() for iteration over keys	
								System.out.println("****KeySet()*****");
								for(String st: hm.keySet())
								{
									System.out.println("Key:"+st);
								}
								
		// using keySet() for iteration over keys	
								System.out.println("****Values()*****");
								for(Boolean bl: hm.values())
								{
									System.out.println("Value:"+bl);
								}
									
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("*******************");
		System.out.println("HashMap iteration ways,");
	}
}
