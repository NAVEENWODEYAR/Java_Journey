package com.data.j8coding.fi.copy;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetEx2 {

	public static void main(String[] args) 
	{
		// HashSet stores unique values.,
		HashSet<Integer> hs = new HashSet();
						hs.add(6);
						hs.add(5);
						hs.add(6);
						hs.add(7);
						hs.add(1);
						hs.add(3);
						System.out.println(hs);
						System.out.println(hs.size());
		// LinkedHashSet
		LinkedHashSet<Integer> lt = new LinkedHashSet<>();
						lt.add(10);
						lt.add(8);
						lt.add(10);
						lt.add(6);
						lt.add(9);
						lt.add(1);
						lt.add(4);
						System.out.println(lt);
						
						
			
	}

}
 