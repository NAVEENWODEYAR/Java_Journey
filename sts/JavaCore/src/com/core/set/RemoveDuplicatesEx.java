// Java 8 program to remove the duplicate elements from the list?

package com.core.set;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesEx 
{
	static public void removeDuplicates(List<Integer> list)
	{
		list.stream()
			.collect(Collectors.toSet())
				.forEach(System.out::println);
	}
	public static void main(String[] args) 
	{
		System.out.println("Set stores only unique values, ");
		List<Integer> list = List.of(1,2,4,5,7,4,33,4,67,45,33);
		System.out.println("Original list "+list+"--"+list.stream().count());
		System.out.println("*************");
		removeDuplicates(list);
	}

}
