// Java 8 program to find the Minimum number of a Stream?

package com.core.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class MinComparatorEx
{
	public static void minNumber(int arr[])
	{		
		int min = Arrays.stream(arr).min().getAsInt();
			System.out.println("Lowest int " +min);
			
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("Highest int " +max);
	}
	public static void main(String[] args) 
	{
		minNumber(new int[] {5,4,3,2,67,7,8,9,98});
		
		System.out.println("******************");
		Integer min = Stream.of(4,5,6,7,8,98)
							.min(Comparator.comparing(Integer::valueOf))
							.get();
		Integer max = Stream.of(78,890,432,12345)
							.max(Comparator.comparing(Integer::valueOf))
							.get();
			System.out.println("Using Comparator " +min);
			System.out.println("Using Comparator " +max);

	}

}
