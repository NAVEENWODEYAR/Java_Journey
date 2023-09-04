// Java program to check weather the given string is palindrome or not
package com.core.string;

public class Palindrome
{
	public static boolean palindromeString(String str)
	{
		String st = str.toLowerCase();
		StringBuilder reverse = new StringBuilder();
						reverse.append(st);
						reverse.reverse();
						
					if(st.contentEquals(reverse))
//					if(reverse.toString().equalsIgnoreCase(str))
						return true;
					else
						return false;
	}
	public static void main(String[] args) 
	{
		String st = args[0];
		System.out.println(palindromeString(st));
		
		// different ways to create string objects
		String st2 = new String("String");
		String st1 = "NewString";
	}

}
