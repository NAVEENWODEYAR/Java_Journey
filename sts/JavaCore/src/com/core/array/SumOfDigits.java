// Program to print the sum of digits 

package com.core.array;

public class SumOfDigits
{
	public static void sumOfDigits(int n)
	{	
		int sum = 0;
		for(sum=0; n!=0; n=n/10)
		{
			sum = sum+n%10;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		sumOfDigits(54321);
	}

}


