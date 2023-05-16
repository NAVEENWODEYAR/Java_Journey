package collectionFramework;

import java.util.*;
public class ArrLst2 {

	public static void main(String[] args) {
		// swapping the elements in the arraylist
		
		ArrayList al = new ArrayList();
			al.add("Vasu");
			al.add("Rahul");
			al.add(10);
			al.add("Naveen");
			System.out.println("Initial list "+al);
			
			Collections.swap(al, 0, 2);					// swapping the elements using Collections.swap()
			System.out.println("Swapped list "+al);
			
			ArrayList al1 = al;							// copying elements of one list to other list
			System.out.println("Copied List "+al1);
			System.out.println("Original list "+al);

	}

}
