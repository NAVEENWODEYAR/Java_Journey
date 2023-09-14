package com.core.revised;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesInArray
{
	static void removeDuplicates(int[]a)
	{
		List<Integer> arrList = new ArrayList<>();
		Set<Integer> hashSet = new HashSet<>();
		for(int n:a)
		{
			if(!hashSet.add(n))
			arrList.add(n);
		}
		System.out.println(hashSet);
		System.out.println(arrList);
	}
	public static void main(String[] args) 
	{
		System.out.println("Java program to remove duplicate elements,");
		int[] a = {1,2,3,3,4,4,5,6,6,7,7,8};
		removeDuplicates(a);
		
	}
}
