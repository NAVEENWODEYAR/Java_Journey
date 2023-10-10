//Java 8 program to perform concatenation on two Streams.,
package com.core.stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamConcat
{

	public static void main(String[] args)
	{
		List<Integer> l1 = List.of(15,2,3,48,5);
		List<Integer> l2 = Arrays.asList(6,7,8,9,10);
		Stream<Integer> stream = Stream.concat(l1.stream(), l2.stream());
						stream.sorted(Comparator.comparing(Integer::valueOf))
								.forEach(System.out::println);
	}

}
