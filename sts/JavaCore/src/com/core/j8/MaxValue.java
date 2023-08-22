// Given a list of integers, find the maximum value element present in it using Stream functions?

package com.core.j8;

import java.util.Comparator;
import java.util.List;

public class MaxValue 
{
	public static void maxIntValue(List<Integer> list)
	{
		Integer max = list.parallelStream()
			.max(Comparator.comparing(Integer::intValue))
			.get();
		
		System.out.println("Maximum int value in the list " +max);
	}
	public static void main(String[] args)
	{
		List<Integer> list = List.of(12,3,45,5,67,7,88,9);
						Integer min = list.stream().min((Integer::compare)).get();
						System.out.println("Lowest int value in the list "+min);
		maxIntValue(list);
	}

}
