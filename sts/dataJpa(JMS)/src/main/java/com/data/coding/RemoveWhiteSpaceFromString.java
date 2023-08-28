package com.data.coding;

import java.util.Arrays;

public class RemoveWhiteSpaceFromString {

	public static String removeWhiteSpace(String str)
	{
		StringBuilder sb = new StringBuilder();
			
		for(char c: str.toCharArray())
		{
			if(!Character.isWhitespace(c))
				sb.append(c);		
		}
		return sb.toString();
		
			
	}
	public static void main(String[] args) 
	{
		System.out.println(removeWhiteSpace("Java Programming"));
		String st = "     Ja va    adfsa\t";
		System.out.println(st.strip());   // strip() removes all the whitespace before and after the string
	
		int[] arr = {1,3,5,6,7,9,2};
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
	}

}
