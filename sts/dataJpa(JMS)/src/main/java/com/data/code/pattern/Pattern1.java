/* Program  to print the pattern
	* * * * * * * * * *
	* * * * * * * * * *
	* * * * * * * * * *
	* * * * * * * * * *
	* * * * * * * * * *
	* * * * * * * * * *
	* * * * * * * * * *
	* * * * * * * * * *
	* * * * * * * * * *
	* * * * * * * * * *
  
 */


package com.data.code.pattern;

public class Pattern1 
{
	private static void pattern()
	{
		for(int i=0; i<=10; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.println("*");
			}
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Patterns using for loop");
		pattern();
	}

}
