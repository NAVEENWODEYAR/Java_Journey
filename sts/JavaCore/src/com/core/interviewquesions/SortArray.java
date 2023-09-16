package com.core.interviewquesions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArray 
{
	static void sortArray(int[] arr)
	{
		int[] array = Arrays.stream(arr).distinct().sorted().toArray();
		String arryList = Arrays.toString(arr);
		System.out.println(arryList);

		for(int n: array)
		{
			System.out.println(n);
		}
	}
	public static void main(String[] args) 
	{
		sortArray(new int[]{1,9,4,1,3,2,6,7,5,4});
		
		 Integer  a[] = {1,9,4,1,3,2,6,7,5,4};
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
	}
	static
	{
		System.out.println("Sorting an array using the collections");
	}

}
