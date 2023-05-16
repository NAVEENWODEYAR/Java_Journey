package collectionFramework;

import java.util.*;

public class ArrLst3 {

	public static void main(String[] args) {
		// Copy Elements of One ArrayList to Another ArrayList in Java
		// Using assignment(=) operator
		System.out.println("Copying the elements of one list to other list using (=).");
			ArrayList al1 = new ArrayList();
						al1.add("One");
						al1.add(2);
						al1.add("Threee");
						al1.add(4);
						al1.add("Five");
			ArrayList al2 = al1;
				System.out.println("Originl List "+al1);
				System.out.println("Copied list "+al2);
		
				
		// Passing in the constructor
			ArrayList al3 = new ArrayList(al1);
				System.out.println("List using the constructor "+al3);
		
		// using addAll()	
			ArrayList al4 = new ArrayList();
						al4.addAll(al1);
						System.out.println("Using addAll()- "+al4);
						
		// using List.copyOf()
			ArrayList al5 = new ArrayList(List.copyOf(al1));
					System.out.println("Using List.copyOf "+ al5);
					
		// Using clone()
			ArrayList al6 = new ArrayList();
				al6 = (ArrayList)al1.clone();
				Collections.swap(al6, 0, 4);				// swapping the elements using Collections.swap()
				System.out.println("Using clone "+al6);	

	}
}
