//Write a Java Program to iterate HashMap using While and advance for loop.
package com.core.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap2 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> mp = new HashMap<>();
							mp.put(1, "One");
							mp.put(4, "Four");
							mp.put(2, "Two");
							mp.put(3, "Three");
			System.out.println(mp.entrySet());
			
			// iterate using the forEach loop
			System.out.println("***For Loop********");
			for(Map.Entry<Integer, String> m : mp.entrySet())
			{
				System.out.println(m.getKey()+" ----"+m.getKey());
			}
			
			// using iterator,
			System.out.println("*****Iterator*******");
			Iterator it = mp.entrySet().iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
	}

}
