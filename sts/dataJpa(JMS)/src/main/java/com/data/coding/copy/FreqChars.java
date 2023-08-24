// Program to find the frequency of the characters in the given string.,
package com.data.coding.copy;

import java.util.HashMap;
import java.util.Map;

public class FreqChars 
{
	public static void freqChars(String st)
	{
		String str = st.toLowerCase();
		
		Map<Character, Integer> mp = new HashMap<>();
		
			for(char c: str.toCharArray())
			{
				if(mp.containsKey(c))
				{
					mp.put(c, mp.get(c)+1);
				}
				else
					mp.put(c, 1);
			}
			System.out.println(mp);
	}
	public static void main(String[] args) 
	{
		String st = args[0];
		freqChars(st);
	}

}
