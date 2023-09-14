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
		Set<Integer> set = new HashSet<>(5);
		ArrayList<Integer> arrList = new ArrayList<>(5);
		
		for(int n: a)
		{
			if(!set.add(n))
				arrList.add(n);
		}
		System.out.println(set);
		System.out.println(arrList);
	}
	public static void main(String[] args) 
	{
		System.out.println("Java program to remove duplicate elements,");
		int[] a = {1,2,3,3,4,4,5,6,6,7,7,8};
		removeDuplicates(a);
		
	}
}
