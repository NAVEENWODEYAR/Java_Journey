package com.data.coding.copy;

import java.util.*;

public class IntegersInList2 {

	public static boolean oddEveninList()
	{
		List<Integer> lt = List.of(1,2,3,4,5,6,7,8,9);
						return lt.parallelStream()
								.anyMatch(n -> n%2==0);
	}
	public static void main(String[] args)
	{
		System.out.println(oddEveninList());
	}

}
