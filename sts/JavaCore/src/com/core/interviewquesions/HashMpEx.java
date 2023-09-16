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
								// for loop to iterate the map,
								System.out.println("********FOR LOOP***********");
								for(Map.Entry<Integer, Boolean> mp:hashMap.entrySet())
								{
									System.out.println(mp.getKey()+":"+mp.getValue());
								}
	
	}

}
