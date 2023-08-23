// Program to print the sum of digits 

package com.core.array;

public class SumOfDigits
{
	public static void sumOfDigits(int n)
	{	
		int sum = 0;
		String intNumbers = Integer.toString(n);
		
			for(int i=0; i< intNumbers.length(); i++)
			{
				int j = Character.getNumericValue(intNumbers.charAt(i));
				sum += j;
			}
		System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		sumOfDigits(5432);
	}

}


