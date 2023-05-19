package linkedList;

import java.util.*;
public class LinkedLst {

	public static void main(String[] args) {
		// Linked-List implements List & Deque
		LinkedList lst = new LinkedList();
				lst.add(1);
				lst.push("One");
				lst.addFirst("Zero");
				lst.offer(3);
				System.out.println(lst);
				
				// iterating the list
				Iterator itr = lst.iterator();
					while(itr.hasNext())
					{
						System.out.println(itr.next());
					}
				
					System.out.println("Last element in the list is: "+ lst.getLast());
					System.out.println("Indext of the element(zero) list is: "+ lst.indexOf("Zero"));
					System.out.println(lst.offerFirst(10)+ " " + lst);
					
	}

}
