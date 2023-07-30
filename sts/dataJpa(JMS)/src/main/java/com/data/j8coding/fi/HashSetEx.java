package com.data.j8coding.fi;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) 
	{
		// HashSet stores unique values.,
		HashSet<Integer> hs = new HashSet();
						hs.add(6);
						hs.add(6);
						hs.add(6);
						hs.add(6);
						hs.add(6);
						hs.add(6);
						System.out.println(hs);
						System.out.println(hs.size());
						System.out.println(hs.remove(5));
	}

}
