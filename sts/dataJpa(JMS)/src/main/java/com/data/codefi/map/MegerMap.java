package com.data.codefi.map;

import java.util.HashMap;
import java.util.Map;

public class MegerMap {

	public static void main(String[] args) 
	{
		HashMap<String, Integer> marksList = new HashMap<>();
								marksList.put("Science",87);
								marksList.put("Social",96);
								marksList.put("Maths",81);
								marksList.put("GK",99);
								marksList.put("Lan",91);
		
		HashMap<String, Integer> marksList2 = new HashMap<>();
								marksList2.put("Science",87);
								marksList2.put("Social",96);
								marksList2.put("Maths",81);
								marksList2.put("GK",99);
								marksList2.put("Lan",91);
								
								marksList.putAll(marksList2);
								

	}

}
