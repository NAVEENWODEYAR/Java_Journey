// Java program to check weather the given string is palindrome or not
package com.core.string;

public class Palindrome2
{
	public static boolean palindromeString(String str)
	{
		String reverse = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			reverse += str.charAt(i);
		}
		
		System.out.println("Original string "+str);
		System.out.println("Reversed string "+reverse);
		if(str.equalsIgnoreCase(reverse))
			return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
//		String st = args[0];
		System.out.println(palindromeString("madm"));
		
	}

}
