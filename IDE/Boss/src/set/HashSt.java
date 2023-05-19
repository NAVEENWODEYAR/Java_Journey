package set;

import java.util.*;
public class HashSt {

	public static void main(String[] args) {
		// HassetAet implements the Set Interface
			HashSet setA = new HashSet();
					setA.add("One");
					setA.add("Five");
					setA.add("Two");
					setA.add("Four");
					setA.add("Three");
					System.out.println("Set A elements " +setA);
					
			HashSet setB = new HashSet();
					setB.add("Four");
					setB.add("Five");
					setB.add("Eight");
					setB.add("Six");
					setB.add("Seven");
					System.out.println("Set B elements "+setB);
					
			// union set operations
//				setA.addAll(setB);
//				System.out.println("**********");
//				System.out.println("Set after union operation "+setA);
				
			// intersection operation
//				setA.retainAll(setB);
//				System.out.println("**********");
//				System.out.println("Set after intersection operation "+setA);
					
			// difference operation 
				setA.removeAll(setB);
				System.out.println(setA);
					
	}

}
