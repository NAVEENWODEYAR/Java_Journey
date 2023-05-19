package cF1;

import java.util.*;

public class HashSt {

	public static void main(String[] args) {
		// HashSet
		HashSet hs = new HashSet();
		System.out.println("HashSet implements the Set Interface");
		System.out.println("Set Interface doesn't allows the duplicate values.");
			hs.add(1);
			hs.add("One");
			hs.add(1);
			hs.add("One");
			System.out.println("HashSet elements :"+hs);
			System.out.println(hs.add(5));
			System.out.println(hs.contains("One"));

	}

}
