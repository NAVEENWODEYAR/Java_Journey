//Java 8 program to multiply 3 to all elements in the list and print the list?

package com.core.j8;

import java.util.Arrays;

public class MapEx 
{
	
	public static void multNumbers(int arr[])
	{
		Arrays.stream(arr)
				.map(n -> n*3)
					.forEach(System.out::println);
	}
	public static void main(String[] args) 
	{
		multNumbers(new int[] {1,2,3,4,5,6,7,8,9,10});
		System.out.println("**********");
	}

}
