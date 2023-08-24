package com.data.coding.copy;

public class StringReverse4 {

	public static void reverseString(String str)
	{
		StringBuilder sb = new StringBuilder();
						sb.append(str);
						sb.reverse();
				System.out.println("Original String, "+str);
				System.out.println("Reversed String, "+sb);
	}
	public static void main(String[] args)
	{
		// reverse the given string using stringBuilder
		String str = args[0];
		reverseString(str);
	}

}
