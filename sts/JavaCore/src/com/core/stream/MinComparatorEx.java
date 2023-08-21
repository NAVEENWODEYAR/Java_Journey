// Java 8 program to find the Minimum number of a Stream?

package com.core.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class MinComparatorEx
{

	public static void main(String[] args) 
	{
		Integer min = Stream.of(5,6,7,8,90,32,34,6,87,89)
							.min(Comparator.comparing(Integer::valueOf)).get();
		
			System.out.println(min);
	}

}
