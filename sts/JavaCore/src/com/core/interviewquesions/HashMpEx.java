package com.core.interviewquesions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMpEx 
{
	
	public static void main(String[] args)
	{
		System.out.println("Map & HashMap");
		
		// HashMap, not thread-safe,
		Map<Integer, Boolean> hashMap = new HashMap<>(5, .9f);
								hashMap.put(1, true);
								hashMap.put(null, false);
								hashMap.put(0, true);
								hashMap.put(2, true);
								System.out.println(hashMap);
								hashMap.compute(0, (k,v)-> v.FALSE);
								
								System.out.println(hashMap);
								// for loop to iterate the map,
								System.out.println("********FOR LOOP***********");
								for(Map.Entry<Integer, Boolean> mp:hashMap.entrySet())
								{
									System.out.println(mp.getKey()+":"+mp.getValue());
								}
		
								System.out.println("*****Concurrent HashMap*********");
		Map<String,Integer> conHashMap = new ConcurrentHashMap();
						conHashMap.put("One", 256);
						conHashMap.put("null", 127);
						conHashMap.put("", 34437365);
						conHashMap.put("infinity", 344365);
						System.out.println(conHashMap);
						conHashMap.compute("null", (k,v)-> v+(v*v));
						System.out.println(conHashMap);
						
						
	}

}
