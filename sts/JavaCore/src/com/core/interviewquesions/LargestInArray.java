package com.core.interviewquesions;

public class LargestInArray
{
	private static void largetElement(int [] arr)
	{
		int largest = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > largest )
				largest = arr[i];
		}
		System.out.println("Largest element in the array,"+largest);
	}
	public static void main(String[] args) 
	{
		largetElement(new int[]{2,1,8,5,4,3,98,7,8,9,89});
	}
	static
	{
		System.out.println("Largest element in the array");
	}
}
