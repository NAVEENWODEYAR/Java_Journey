package com.core.interviewquesions;

import java.util.HashSet;
import java.util.Set;

public class HashSetVsHashMap
{
	static
	{
		System.out.println("HashSet Vs HashMap");
		System.out.println("HashSet, stores set of unique elements in any order");
		System.out.println("HashMap, stores key-value pairs,");
	}
	public static void main(String[] args) 
	{
		// HashSet
		Set<Integer> hashSet = new HashSet<>(10);
					hashSet.add(null);
					hashSet.add(0);
					hashSet.add(4);
					hashSet.add(2);
					hashSet.add(7);
					hashSet.add(0);
					hashSet.add(10);
					
					System.out.println("Check weather the particular element exists: "+hashSet.contains(null));
					for(Integer n: hashSet)
					{
						System.out.println(n);
					}
					
		// HashMap,
	}

}
