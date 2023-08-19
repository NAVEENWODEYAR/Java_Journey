package com.core.set;

import java.util.*;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) 
	{
		Map<Integer, String> mp = new TreeMap<>();
							mp.put(1, "One");
							mp.put(2, "Two");
							mp.put(10, "Ten");
							mp.put(5, "Five");
							mp.put(7, "Seven");
							
			mp.entrySet().stream().forEach(System.out::println);
	
			Map<Integer, String> hmp = new HashMap<>();
			hmp.put(1, "One");
			hmp.put(2, "Two");
			hmp.put(10, "Ten");
			hmp.put(5, "Five");
			hmp.put(7, "Seven");
			
			hmp.entrySet().stream().forEach(System.out::println);
	}

}
