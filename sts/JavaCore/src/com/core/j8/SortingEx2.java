// Given a list of integers, sort all the values present in it using Stream functions?
package com.core.j8;

import java.util.*;
import java.util.stream.Collectors;

public class SortingEx2 
{
	static void sortList(List<Integer> list)
	{
		list.stream()
			.collect(Collectors.toUnmodifiableSet())
			.forEach(System.out::println);
	}
	public static void main(String[] args)
	{
		System.out.println("List provided,");
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15,1,0,1,2,3,4);

        myList.stream()
              .sorted(Collections.reverseOrder())
              .forEach(System.out::println);
        
        System.out.println("Set obtained,");
        sortList(myList);
	}

}
