package list;

import java.util.*;
public class LstReverseOrder {

	public static void main(String[] args) {
		// ListIterator example
		List<Integer> lt = new ArrayList();
					lt.add(1);
					lt.add(5);
					lt.add(2);
					lt.add(3);
					lt.add(4);
					System.out.println("List elements: "+lt);
					
					// Traversing the list
					System.out.println("Iterating in the normal order");
					Collections.sort(lt);
					ListIterator ltr = lt.listIterator();
						while(ltr.hasNext())
						{
							System.out.println("Index-" +ltr.nextIndex() + "value-" +ltr.next());
						}
						
						System.out.println("*************************");
						System.out.println("Iterating in the reverse order");
							while(ltr.hasPrevious())
							{
								System.out.println("Index-" + ltr.previousIndex() + "value-"+ ltr.previous());
							}
	}

}
