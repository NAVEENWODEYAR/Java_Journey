package set;

import java.util.*;
public class HashSt2 {

	public static void main(String[] args) {
		// HassetAet implements the Set Interface
			HashSet setA = new HashSet();
					setA.add("One");
					setA.add("Five");
					setA.add("Two");
					setA.add("Four");
					setA.add("Three");
					System.out.println(setA);
					System.out.println("Size of the list is "+setA.size());
					System.out.println("HashCode value of the set "+setA.hashCode());
					System.out.println(setA.contains("Four"));
	}

}
