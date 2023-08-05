package com.data.codefi.map;

import java.util.*;

public class MegerMap {

	public static void main(String[] args) 
	{
		Map<String, Integer> marksList = new HashMap<>();
								marksList.put("Science",87);
								marksList.put("Social",96);
								marksList.put("Maths",81);
								marksList.put("GK",99);
								marksList.put("Lan",91);
		
		Map<String, Integer> marksList2 = new HashMap<>();
								marksList2.put("Science",89);
								marksList2.put("Social",96);
								marksList2.put("Maths",89);
								marksList2.put("GK",91);
								marksList2.put("Computer",81);
								
								
								/**marksList.putAll(marksList2);
								for(Map.Entry<String, Integer>mp: marksList.entrySet())
								{
									System.out.println(mp.getKey()+":"+mp.getValue());
								}
								*/
								
								marksList2.forEach((key,value)-> marksList.merge(key, value, (v1,v2)-> (v1+v2)/2));

								for(Map.Entry<String, Integer> mp:marksList.entrySet())
								{
									System.out.println(mp.getKey()+":"+mp.getValue());
								}
								
								

	}

}
