package com.core.interviewquesions;


public class SortArray 
{
	private static void sortArray(int []a)
	{
		int length = a.length;
		for(int i=0; i< length/2; i++)
		{
			// Storing the first half elements temporarily
			int temp = a[i];
			
			 // Assigning the first half to the last half
			a[i] = a[length-i-1];
			
			//Assigning the last half to the first half
			a[length-i-1] = temp;
		}
	}
	public static void main(String[] args) 
	{
		sortArray( new int[]{1,9,4,1,3,2,6,7,5,4});
	}
	static
	{
		System.out.println("Sorting an array");
	}

}
