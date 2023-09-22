package com.test;

import java.util.*;

public class Test
{
	public static void charFrequency(String st)
	{
		String str[] = st.split("");
		Map<String, Integer> mp = new HashMap<>();
		
		for(int i=0; i<str.length-1; i++)
		{
			if(mp.containsKey(str[i]))
				mp.put(str[i], mp.get(str[i])+1);
			else
				mp.put(str[i], 1);
		}
		System.out.println(mp);
	}
	public static void main(String[] args) 
	{
		String st = "Naveen Kumar K";
		charFrequency(st);
	}

}
