package com.data.coding;

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
	
	}

}
