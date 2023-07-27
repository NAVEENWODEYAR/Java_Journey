package com.data.j8coding.fi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MxEx {

	public static void main(String[] args)
	{
		List<Integer> lt = Arrays.asList(1,2,3,4,5,6,7,8,9);
						Optional<Integer> l1 = lt.stream().sorted(Collections.reverseOrder()).findFirst();
						System.out.println(l1.get());
						
		Optional<Integer> list = Arrays.asList(2,4,6,8,10).stream().max((a,b) -> a-b);
		System.out.println(list.get());
						
						
	}

}
