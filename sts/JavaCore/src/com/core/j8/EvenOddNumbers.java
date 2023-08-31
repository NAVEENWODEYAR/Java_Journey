//Given a list of integers, find out all the even numbers exist in the list using Stream functions?

package com.core.j8;

import java.util.*;

public class EvenOddNumbers
{
	static public void oddEvenExractor(List<Integer> list)
	{
		list.parallelStream()
			.filter(n-> n%2==0)
			.sorted()
			.forEach(System.out::println);
	}

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println("Even numbers present in the list ");
		oddEvenExractor(list);
	}

}
