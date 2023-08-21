// How to find duplicate elements in a given integers list in java using Stream functions?

package com.core.map;

import java.util.*;

public class DuplicatesInList 
{
	static public void duplicateNumbers(List<Integer> list)
	{
		Set<Integer> set = new HashSet<>();
					list.stream()
						.filter(n->!set.add(n))
						.forEach(System.out::println);
	}
	public static void main(String[] args) 
	{
		List<Integer> llist = List.of(1,2,3,4,5,6,7,8,9,2,4,6,8,10);
		System.out.println("Duplicates in the list ");
		duplicateNumbers(llist);
	}

}
