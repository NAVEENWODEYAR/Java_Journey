package com.core.revised;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
		int[] a = {1,2,3,3,4,4,5,6,6,7,7,8};
		removeDuplicates(a);
		System.out.println("Original Array "+Arrays.toString(new int[] {1,2,3,3,4,4,5,6,6,7,7,8}));
		
		
		// using hashset
		System.out.println("*******HashSet********");
		Set<Integer> hashSet = new HashSet<>();
			for(int number:a)
			{
				if(!hashSet.add(number))
					System.out.println("Duplicate Element "+number);
					
			}
			System.out.println(hashSet);
			
			// using Arrays.sort()
			System.out.println("***********Arrays.sort()************");
			Arrays.sort(a);
			for(int i=0; i<a.length-1;i++)
			{
				if(a[i] == a[i+1])
					System.out.println("Duplicate elements,"+a[i]);
			}
	}

}
