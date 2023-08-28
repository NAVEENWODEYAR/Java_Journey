package com.data.coding;

public class Palindrome {

	public static void palindrome(String st)
	{
		
		StringBuilder reverse = new StringBuilder(st.toLowerCase());
//					reverse.append(st);
					reverse.reverse();
					System.out.println(reverse);
					
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
		System.out.println("String "+str);
		palindrome("malayalam");
	}

}
