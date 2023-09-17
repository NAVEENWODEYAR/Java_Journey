//Write a Java Program to count the number of words in a string using HashMap.
package com.core.string;

import java.util.HashMap;
import java.util.Map;

public class WordFreq2 
{
	public static void wordFrequency(String str)
	{
		String st[] = str.split(" ");
		Map<String, Integer> hashMap = new HashMap<>();
			
			for(int i=0; i<= st.length-1; i++)
			{
				if(hashMap.containsKey(st[i]))
				{
					hashMap.put(st[i], hashMap.get(st[i]+1));
				}
				else
				{
					hashMap.put(st[i], 1);
				}
			}
			
			System.out.println(hashMap);
	}
	public static void main(String[] args) 
	{
		wordFrequency("Java Program Hello World Hello Java Family Java loves you");
	}

}
