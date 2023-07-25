package com.data.sort;

import java.util.stream.IntStream;

public class CollnEx
{

	public static void main(String[] args) 
	{
		// Intermediate operations returns the stream ex-filter(), distinct(), sorted
		// Terminal operations returns other than streams ex- forEach(), count(), min(), max()
		
		IntStream.of(1,2,3,4,5,6,7,8,9).filter(i -> i%2 ==0).forEach(System.out::println);
	}

}
