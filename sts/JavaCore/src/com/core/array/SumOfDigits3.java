// Program to find the sum of digits of an number			
//for(sum=0; n!=0;n=n/10),

package com.core.array;

public class SumOfDigits3
{
	static public void sumOfDigits(int n)
	{
		int sum = 0;
			for(sum=0; n!=0;n=n/10)
			{
				sum = sum+n%10;
			}
			System.out.println(sum);
	}
	public static void main(String[] numbers) 
	{
		int n = Integer.parseInt(numbers[0]);
		System.out.println("*******");
		sumOfDigits(n);
	}

}
