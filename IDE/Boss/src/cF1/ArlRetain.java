package cF1;

import java.util.*;
public class ArlRetain {

	public static void main(String[] args) {
		// retainAll() method compares an ArrayList with the collection 
		ArrayList al = new ArrayList();
				al.add(1);
				al.add(3);
				al.add(5);
				al.add(7);
				al.add(9);
			System.out.println("List 1 elements: "+al);
			
		ArrayList al1 = new ArrayList();
				al1.add(1);
				al1.add(2);
				al1.add(3);
				al1.add(4);
				al1.add(5);
				al1.add(1);
				System.out.println("List 1 elements: "+al1);
				
				System.out.println("After retaining the elements ");
				al.retainAll(al1);
				System.out.println("List 1 elements: "+al);

	}

}
