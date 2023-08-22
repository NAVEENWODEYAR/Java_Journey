// Given a list of integers, sort all the values present in it using Stream functions?
package com.core.j8;

import java.util.*;
import java.util.stream.Collectors;

public class SortingEx 
{
	static void sortList(List<Integer> list)
	{
		Collections.sort(list);
		System.out.println("Natural sorting order "+list);
		
		System.out.println("************************");

		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Reverse sorting order "+list);

	}
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1,34,6,69,78,87,9,54,34,87,56,39,89);
		Set<Integer> set = list.stream().collect(Collectors.toSet());
		System.out.println("Set store only unique values " +set);
		sortList(list);
	}

}
