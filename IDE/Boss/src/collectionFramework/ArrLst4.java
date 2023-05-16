package collectionFramework;

import java.util.*;
public class ArrLst4 {

	public static void main(String[] args) {
		// Copying the elements of one list to the other list
		ArrayList al = new ArrayList();
				al.add(1);
				al.add(2);
				al.add(3);
				al.add(9);
				al.add(5);
				al.add(7);
			System.out.println("*******");
			System.out.println("Copying the elements of one list into the other");
			System.out.println(al);
			// using assignment(=) operator.
			System.out.println("Using (=) operator");
			ArrayList al1 = al;
			System.out.println(al1);
			System.out.println("*******");
			
			// Using the constructor
			System.out.println("Using the constructor");
			ArrayList al2 = new ArrayList(al);
			System.out.println(al2);
			System.out.println("*******");
			
			// Using the addAll()
			System.out.println("Using addAll()");
			ArrayList al3 = new ArrayList();
						al3.addAll(al2);
						System.out.println(al3);
						System.out.println("*******");
						
			// Using List.copyOf()
			System.out.println("Using the List.copyOf()");
			ArrayList al4 = new ArrayList(List.copyOf(al3));
			System.out.println(al4);
			System.out.println("*******");
			
			// Using the clone()
			System.out.println("Using the clone()");
			ArrayList al5 = new ArrayList();
					al5 = (ArrayList)al4.clone();
					System.out.println(al5);
					System.out.println("*******");
			
	}

}
