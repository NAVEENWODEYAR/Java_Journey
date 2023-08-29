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

public class Pattern3 
{
	private static void pattern()
	{
		for(int i=9; i>=0; i--)
		{
			for(int j=9; j>=0; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Patterns using for loop");
		pattern();
	}

}
