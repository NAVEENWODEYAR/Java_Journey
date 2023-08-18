package com.data.codefi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfString4 {
	
	public static void characterFrequency(String st1)
	{
		String st = st1.toLowerCase();
		Map<String, Integer> mp = new HashMap<>();
		String[] str = st.split("");
			System.out.println(Arrays.toString(str));
		
			for(int i=0; i<str.length-1; i++)
			{
				if(mp.containsKey(str[i]))
				{
					mp.put(str[i], mp.get(str[i]+1));
				}
				else
				{
					mp.put(str[i], 1);
				}
			}
			System.out.println(mp);
	}
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) 
	{
		characterFrequency("Programming");
		
	}

}
