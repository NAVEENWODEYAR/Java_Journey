// Program to find the character frequency in the string
package com.core.map;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency 
{
	public static void charFrequency(String str)
	{
		Map<Character, Integer> mp = new HashMap<>();
		
			for(char c: str.toCharArray())
			{
				if(mp.containsKey(c))
				{
					mp.put(c, mp.get(c)+1);
				}
				else 
				{
					mp.put(c, 1);
				}
			}
			System.out.println(mp);
	}
	
	public static void main(String[] args)
	{
		charFrequency("String");
	}

}
