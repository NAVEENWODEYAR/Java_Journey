package com.test;

import java.util.*;

public class Test
{
	public static void charFrequency(String st)
	{
		String str[] = st.toLowerCase().split("");
		Map<String, Integer> mp = new HashMap<>();
		
//		for(int i=0; i<str.length-1; i++)
			for(char c: st.toCharArray())
		{
			if(mp.containsKey(str[c]))
				mp.put(str[c], mp.get(str[c])+1);
			else
				mp.put(str[c], 1);
		}
		System.out.println(mp);
	}
	public static void main(String[] args) 
	{
		String st = "Java Programming";
		charFrequency(st);
		charFrequency("");
		
	}
}
