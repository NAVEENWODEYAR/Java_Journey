// Convert a set into TreeSet
package com.core.set;

import java.util.*;
import java.util.stream.Collectors;

public class SetToTreesetEx 
{

	public static void main(String[] args)
	{
		List<Integer> list = List.of(1,3,4,5,787,9,1,2,3,4,5,6,4,3,2,1);
					System.out.println("Original list provided "+list);
					System.out.println(list.subList(2, 8));
					System.out.println("*************");
					
		Set<Integer> set = list.stream().collect(Collectors.toSet());
					System.out.println("Set obtained from the list "+set);
					System.out.println("***************");
		Set<Integer> treeSet = new TreeSet<>(set);
					System.out.println("TreeSet obtained from the set "+treeSet);
	
	}

}
