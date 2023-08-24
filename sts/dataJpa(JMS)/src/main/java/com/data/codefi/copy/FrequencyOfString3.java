package com.data.codefi.copy;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfString3 {
	
	public static void characterFrequency(String st)
	{
		Map<Character, Integer> mp = new HashMap<>();
		char chars[] = st.toCharArray();
		
		for(char c: chars)
		{
			if(!String.valueOf(c).isBlank())
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
		}
		System.out.println(st+"--"+mp);
		
	}
	public static void main(String[] args) 
	{
		characterFrequency("Char acter");

	}

}
