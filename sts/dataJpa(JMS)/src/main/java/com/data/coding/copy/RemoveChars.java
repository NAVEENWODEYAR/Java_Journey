package com.data.coding.copy;

import java.util.HashMap;
import java.util.Map;

public class RemoveChars
{
	public static void freqOfChars(String st)
	{
		String str = st.toLowerCase();
		char chars[] = str.toCharArray();
		
		Map<Character, Integer> mp = new HashMap<>();
			
			for(char c: chars)
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
		// How do you get distinct characters and their count in a string in Java
		freqOfChars("Boss");
	}

}
