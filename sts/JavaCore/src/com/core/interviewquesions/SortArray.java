package com.core.interviewquesions;

import java.util.Arrays;

public class SortArray 
{
	static void sortArray(int[] arr)
	{
		int[] array = Arrays.stream(arr).sorted().toArray();
		for(int n: array)
		{
			System.out.println(n);
		}
	}
	public static void main(String[] args) 
	{
		sortArray(new int[]{1,9,3,2,6,7,5,4});
	}
	static
	{
		System.out.println("Sorting an array using the collections");
	}

}
