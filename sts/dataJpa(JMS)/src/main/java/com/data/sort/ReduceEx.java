package com.data.sort;

import java.util.*;

public class ReduceEx 
{

	public static void main(String[] args) 
	{
		
		// reduce() -Reducing operations are the operations which combine all the elements of a stream repeatedly to produce a single value.
		int sum = Arrays.stream(new int[] {1,2,3,4,5}).reduce(0, (a,b)-> a+b);
		System.out.println(sum);
		
		// reduce the list.,
		List<Integer> lt = Arrays.asList(2,4,6,8,10);
						lt.stream().reduce((a,b)->a+b).stream().forEach(System.out::println);
				
	
	}
}
 