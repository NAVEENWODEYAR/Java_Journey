package com.core.interviewquesions;

public class PalindromeEx
{
	static void palindromeTest(String st)
	{
		String str = st.toLowerCase();
		StringBuilder rev = new StringBuilder(str.toLowerCase());
						rev.reverse();
				
						if(str.contentEquals(rev))
							System.out.println("Given string is palindrome,");
	}
	public static void main(String[] args) 
	{
		palindromeTest("RaceCar");
	}

}
