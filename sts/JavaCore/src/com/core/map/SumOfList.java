//Write a Java 8 program to get the sum of all numbers present in a list.

package com.core.map;

import java.util.ArrayList;
import java.util.List;

public class SumOfList
{
	public static void sumOfList(List<Integer> list)
	{
		int sum = list.parallelStream()
			.mapToInt(Integer::intValue)
			.sum();
			
		System.out.println("Sum of the list "+sum);
	}
	public static void main(String[] args) 
	{
		List<Integer> list = List.of(1,2,3,4,67,9,98);
		sumOfList(list);
	}

}
