package collectionFramework;

import java.util.*;
public class ArrayLst {

	public static void main(String[] args) {
		// Array List 
		ArrayList al = new ArrayList();
		
		System.out.println(al);
		// adding the elements using add()
			al.add("One");
			al.add(01);
			al.add(2.5f);
			al.add("Two");
			System.out.println(al);
			
		// retriving the elements using get()
			al.get(3);			// using the get
			System.out.println(al.get(2));
			
		// adding the elements at the preferred index position
			al.add(4,"Five");
			System.out.println(al);
			
		// updating the elements
			al.set(2, "Emma");
			System.out.println(al);
			
		// deleting the elements
			al.remove(3);
			System.out.println(al);
			
		// checking the size
			System.out.println("ArrayList contains-" + al.size() + "elements.");
		
		// Iterating using the iterator
			Iterator<Integer> it = al.iterator();
				while(it.hasNext())
				{
					System.out.println("****");
					System.out.println(it.next());
				}
	}

}
