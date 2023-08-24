package com.data.coding.copy;

public class StringOutPt 
{
	public static void main(String[] args) 
	{
		// Guess the output,
		String s1 = "abc";
		String s2 = "abc";
		
		System.out.println(s1 == s2);
		System.out.println("s1 == s2 is:" +s1 == s2);
		System.out.println("s1 == s2 is:" + s1.equalsIgnoreCase(s2));
		
		//
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;

		System.out.println(s3.substring(start, end));
		
		//
		String str = null;
		String str1="abc";
		
		try
		{
			System.out.println(str1.equals("abc") | str.equals(null));	// exception str is null
		}
		catch( Exception e)
		{
			System.out.println(e.getLocalizedMessage());
			
			try
			{
				System.out.println(str.equals(null));				
			}
			catch(Exception e1)
			{
				System.out.println(e1.getCause());
				int x = 10 * 10 - 10;
		   		
		   		System.out.println(x);
			}
		}

	}

}
