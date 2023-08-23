//How do you get the sum of all elements in an integer array in Java?
package com.data.coding;

public class SumOfDigits
{
	public static void sumOfDigits(int arr[])
	{	
		int sum = 0;
		for(int i: arr)
		{
			sum+=i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		sumOfDigits(new int[] {1,4,6,7,9});
	}
}
