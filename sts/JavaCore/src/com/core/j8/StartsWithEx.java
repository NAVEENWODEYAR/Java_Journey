//Given a list of integers, find out all the numbers starting with 1 using Stream functions?

package com.core.j8;

import java.util.*;

public class StartsWithEx 
{
	public static void startsWith1(List<Integer> list)
	{
			.map(n -> n+"")
			.filter(n -> n.toString().startsWith("1"))
			.forEach(System.out::println);
	}

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,2,45,12,24,15,16,27,19,18,11,12);
		startsWith1(list);
	}

}
