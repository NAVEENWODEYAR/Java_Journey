package com.data.coding.copy;

public class StringReverse2 {

	public static void reverseString(String str)
	{
		String rev = "";
			for(int i=str.length()-1; i>=0; i--)
			{
				rev+= str.charAt(i);
			}
			System.out.println(rev);
	}
	public static void main(String[] args)
	{
		// reverse the given string using string functions and loop
		reverseString("JavA");
	}

}
