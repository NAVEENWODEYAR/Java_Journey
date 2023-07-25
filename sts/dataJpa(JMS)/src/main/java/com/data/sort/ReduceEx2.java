package com.data.sort;

import java.util.*;

public class ReduceEx2 
{

	public static void main(String[] args) 
	{
		
		List<String> names = Arrays.asList("Raju","Rani","Benny","Nora","Monali");
				Optional<String>longestName = names.parallelStream().reduce((n1,n2)-> n1.length() > n2.length()? n1: n2);
				longestName.ifPresent(System.out::println);
				
				// reduce the list.,
				String name [] = {"Raju","Rani","Benny","Nora","Monali"};
						String st = Arrays.stream(name).reduce((n1,n2) -> n1+"-"+n2).get();
						System.out.println(st);
				
	}
}
 