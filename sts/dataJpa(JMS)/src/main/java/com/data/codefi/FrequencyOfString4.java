package com.data.codefi;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfString4 {
	
	public static void characterFrequency(String st)
	{
		Map<String, Integer> mp = new HashMap<>();
		String[] str = st.split("");
			
			for(int i=0; i<str.length-1; i++)
			{
				if(mp.containsKey(str[i]))
				{
					mp.put(str[i],mp.get(str[i]+1) );
				}
				else
				{
					mp.put(str[i], 1);
				}
			}
	}
	public static void main(String[] args) 
	{
		characterFrequency("Char acter");

	}

}
