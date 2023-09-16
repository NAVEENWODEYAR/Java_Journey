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
		palindromeTest("deified");
		palindromeTest("level");
		palindromeTest("rotor");
		palindromeTest("civic");
		palindromeTest("malayalam");
	}
	
	static
	{
		String st = "racecar";
		String rev = "";
			
			for(int i=st.length()-1; i>=0; i--)
			{
				rev += st.charAt(i);
			}
			System.out.println("\n Static Block");
			System.out.println("Given string("+st+") is an palindrome "+st.equals(rev));
			System.out.println("***********");
	}

}
