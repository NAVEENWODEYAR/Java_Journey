package com.data.coding;

public class Palindrome {

	public static void palindrome(String st)
	{
		
		StringBuilder reverse = new StringBuilder(st.toLowerCase());
					reverse.reverse();
					
			if(st.contentEquals(reverse))
			{
				System.out.println(st+ "-is an Palindrome");
			}
			else
			{
				System.out.println(st+ " -Not an palindrome");
			}
		
	}
	public static void main(String[] args)
	{
		String str = args[0];
		palindrome("malayalam");
		palindrome(str);
		  
	}

}
