package com.data.sort;

import java.util.*;

public class SortEx2 
{

	public static void main(String[] args) 
	{
		// Sorting operations in Stream()
		List<String> list = Arrays.asList("Vasu","Raju","Nag","Seenu");
		
		// count the number of elements in the stream
		System.out.println("No of elements in the stream : "+list.stream().count());
		
		// sort the names according to their length.,
				list.stream()
					.sorted((String n1,String n2) -> n1.length() - n2.length())
						.map(names -> names.toUpperCase())
							.forEachOrdered(System.out::println);
	}
}
