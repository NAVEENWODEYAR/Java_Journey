package com.data.coding;

public class StringReverse {

	public static void reverseString(String str)
	{
		String[] st = new String[str.length()];
		char ch[] = str.toCharArray();
			for(int i=str.length()-1; i>=0; i-- )
			{
				System.out.print(ch[i]);
			}
	}
	public static void main(String[] args)
	{
		// reverse the given string using loop
		reverseString("VasU");
	}

}
