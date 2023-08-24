package com.data.j8coding.fi.copy;

import java.util.HashMap;
import java.util.Map;

public class StringFrequency2 {

	public static void wordFrequency(String st)
	{
		String str = st.toLowerCase();
		Map<Character, Integer> mp = new HashMap<>();
		char chars[] = str.toCharArray();
			
			for(char c:chars)
			{
				if(mp.containsKey(c))
				{
					mp.put(c,mp.get(c)+1);
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
		wordFrequency("MalayalAM");
	}

}
