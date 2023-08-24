package com.data.j8coding.copy;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMp {

	public static void main(String[] args) 
	{
		// HashMap
		HashMap<String, Integer> hm = new HashMap<>();
								hm.put("E", 1);
								hm.put("D", 2);
								hm.put("C",3);
								hm.put("B", 4);
								hm.put("A", 5);
				for(Map.Entry<String, Integer>mp : hm.entrySet())
				{
					System.out.println(mp.getKey()+":"+mp.getValue());
				}
				
		TreeMap<String, String> tm = new TreeMap<>();
								tm.put("Name", "Zoya");
								tm.put("Age", "Twenty");
								tm.put("eMail", "ab@gmail.com");
								System.out.println(tm);
	// Concurrent hashmap, threadSafe
		ConcurrentHashMap<String, String> ch = new ConcurrentHashMap<>();
											ch.put("An", "Karn");
											ch.put("Name", "karn");
										System.out.println(ch);
																
	}
}
