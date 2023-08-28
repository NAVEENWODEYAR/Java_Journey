package com.data.codefi;

import java.util.*;


public class MapExample {

	public static void main(String[] args) 
	{
		Map<Integer, String> mp = new HashMap<>();
							mp.put(1, "One");
							mp.put(2, "Two");
							
			mp.forEach((k,v)->System.out.println(k+":"+v));
			mp.entrySet().stream().filter(k->k.getKey()%2==0)
			.forEach(System.out::println);
			
	}

}
