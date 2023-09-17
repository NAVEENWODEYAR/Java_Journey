//Write a Java Program to iterate HashMap using While and advance for loop.
package com.core.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
								
		// iterating using for-loop
								for(int i=0; i<hm.size()-1; i++)
								{
									System.out.println(hm.entrySet());
								}
								System.out.println(hm);
								System.out.println(hm.entrySet());
	}
	public static void main(String[] args) 
	{
		System.out.println("HashMap iteration ways,");
	}
}
