package com.core.revised;

import java.util.Arrays;

public class DuplicatesInArray
{
	static void removeDuplicates(int[]a)
	{
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length-1; j++)
			{
				if(a[i] ==a[j])
					System.out.println("Duplicate Element "+a[i]);
			}
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Java program to find duplicate elements,");
		removeDuplicates(new int[] {1,2,3,3,4,4,5,6,6,7,7,8});
		System.out.println("Original Array "+Arrays.toString(new int[] {1,2,3,3,4,4,5,6,6,7,7,8}));
	}

}
