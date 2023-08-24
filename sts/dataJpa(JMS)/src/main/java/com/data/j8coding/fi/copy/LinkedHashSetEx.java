package com.data.j8coding.fi.copy;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetEx {

	public static void main(String[] args) 
	{
		// HashSet stores unique values.,
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
						hs.add(6);
						hs.add(5);
						hs.add(4);
						hs.add(7);
						hs.add(3);
						hs.add(8);
						System.out.println(hs);
						System.out.println(hs.size());
	}

}
