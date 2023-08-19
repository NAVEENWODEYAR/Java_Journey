package com.core.set;

import java.util.*;

public class HashSetEx
{

	public static void main(String[] args)
	{
		Set set = new HashSet<>();
			set.add("One");
			set.add("Three");
			set.add("Two");
			set.add("Four");
			set.add("null");
//			set.add(null);
			Iterator itr = set.iterator();
//			while(itr.hasNext())
//			{
//				System.out.println(itr.next());
//			}
			
			set.parallelStream().sorted().forEach(System.out::println);
			
			System.out.println(set.stream().count());
					
	}
}
