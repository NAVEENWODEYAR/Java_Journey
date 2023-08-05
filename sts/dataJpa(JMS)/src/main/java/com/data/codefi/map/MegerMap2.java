package com.data.codefi.map;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MegerMap2 {

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
								
			HashMap<String, Integer>marksList3 = Stream.concat(marksList.entrySet().stream(), marksList2.entrySet().stream())
													.collect(Collectors.toMap(Entry::getKey,Entry::getValue,(v1,v2)-> v1+v2,HashMap::new));
								for(Map.Entry<String, Integer> mp:marksList3.entrySet())
								{
									System.out.println(mp.getKey()+":"+mp.getValue());
								}
								System.out.println("##$%^^%#@%#@%#@");
		HashMap<String,Integer> marksList4 = Stream.concat(marksList3.entrySet().stream(), marksList2.entrySet().stream())
												.collect(Collectors.toMap(Entry::getKey, Entry::getValue,(v1,v2)-> v1+v2,HashMap::new));
								for(Map.Entry<String, Integer>m:marksList4.entrySet())
								{
									System.out.println(m.getKey()+":"+m.getValue());
								}

				
								// using the merge().,
								marksList4.forEach((key,value)->marksList3.merge(key, value, (v1,v2)-> v1+v2));
								for(Map.Entry<String, Integer>mn:marksList4.entrySet())
								{
									System.out.println(mn.getKey()+":"+mn.getValue());
								}
	}

}
