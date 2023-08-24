package com.data.j8coding.fi.copy;

import java.util.HashMap;

public class HashMpEx {

	public static void main(String[] args) 
	{
		HashMap<String, Integer> hm = new HashMap<>();
								hm.put("One", 7);
								hm.put("Four", 1);
								hm.put("An", 2);
								hm.put("An", 2);
								hm.put("Ba", 3);
								System.out.println(hm.clone());
	}

}
