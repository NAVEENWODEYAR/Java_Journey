package linkedList;

import java.util.*;
public class LnkLst1 {

	public static void main(String[] args) {
		// Traversing the list of elements in reverse order  
		LinkedList<String> lst = new LinkedList();
						lst.push("Emmie");
						lst.push("Florence");
						lst.add("Anjelina");
						lst.addFirst("Mayers");
						lst.addLast("Love");
						lst.offer("Orea");
						lst.offerLast("Last");
						lst.push("pola");
						System.out.println("Size of the list is: "+lst.size());
						System.out.println("Original list "+lst);
						
						Collections.sort(lst);
						System.out.println("Sorted list "+lst);
						
						Collections.sort(lst,Collections.reverseOrder());
						System.out.println("Sorted list in the reverse order "+ lst);
						
				// Iterating the elements
					System.out.println("Iterating using Iterator");
					Iterator itr = lst.iterator();
						while(itr.hasNext())
						{
							System.out.println(itr.next());
						}
						
				// Iterating in the reverse order
					System.out.println("Iterating using Iterator in the reverse order");
					Iterator it = lst.descendingIterator();
						while(it.hasNext())
						{
							System.out.println(it.next());
						}

						
						
	}

}
