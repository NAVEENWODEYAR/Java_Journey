package com.data.coding;

public class VowelInStr {

	public static boolean reverseString(String str)
	{
		return str.toLowerCase().matches(".*[aeiou]*.");
	}
	public static void main(String[] args)
	{
		String str = args[0];
		System.out.println(reverseString(str));
		
	}

}
