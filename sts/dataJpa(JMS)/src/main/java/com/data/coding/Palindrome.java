package com.data.coding;

public class Palindrome {

	public static void palindrome(String st)
	{
		StringBuilder reverse = new StringBuilder();
					reverse.append(st);
					reverse.reverse();
					
			if(st.contentEquals(reverse))
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Not an palindrome");
			}
		
	}
	public static void main(String[] args)
	{
		String str = args[0];
		palindrome(str);
	}

}
