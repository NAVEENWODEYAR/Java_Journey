package com.data.codefi;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfString {
	
	public static void wordFrequency(String st1)
	{	
		String st = st1.toLowerCase();
		Map<Character, Integer> mp = new HashMap<>();
		char chars[] = st.toCharArray();
			
			for(char c : chars)
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
			System.out.println(st+"--"+mp);
	}
	public static void main(String[] args) 
	{
		wordFrequency("Java");
		wordFrequency("String string");

	}

}
