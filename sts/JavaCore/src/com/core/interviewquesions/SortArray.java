package com.core.interviewquesions;

import java.util.Arrays;

public class SortArray 
{
	private static void sortArray(int []a)
	{
		Arrays.sort(a);
		int lh = a.length;
		for(int i=0; i< lh/2; i++)
		{
			// Storing the first half elements temporarily
			int temp = a[i];
			
			 // Assigning the first half to the last half
			a[i] = a[lh-i-1];
			
			//Assigning the last half to the first half
			a[lh-i-1] = temp;
		}
		System.out.println(Arrays.toString(a));
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
