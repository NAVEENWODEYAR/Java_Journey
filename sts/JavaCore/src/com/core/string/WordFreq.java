//Write a Java Program to count the number of words in a string using HashMap.
package com.core.string;

import java.util.*;
import java.util.Map;

public class WordFreq 
{
	public static void wordFrequency(String str)
	{
		String st[] = str.split(" ");
		
		Map<String, Integer> mp = new TreeMap<>();
		
			for(int i=0; i<=st.length-1; i++)
			{
				if(mp.containsKey(st[i]))
				{
					mp.put(st[i], mp.get(st[i])+1);					
				}
				else
					mp.put(st[i], 1);
			}
			System.out.println(mp);
	}
	public static void main(String[] args) 
	{
		wordFrequency("Java Program Hello World, Hello Java Family");
	}

}
