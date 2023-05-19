package cF1;

import java.util.*;
public class ArrLstReverseOrder {

	public static void main(String[] args) {
		// Here, element iterates in reverse order  
		ArrayList arl = new ArrayList();
					arl.add(1);
					arl.add(10);
					arl.add(2);
					arl.add(8);
					arl.add(3);
					arl.add(6);
					arl.add(4);
		System.out.println("Iterating the list.");
		Iterator it = arl.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			
		System.out.println("Iterating the list in the reverse order.");
		ListIterator ltr = arl.listIterator(arl.size());
			while(ltr.hasPrevious())
			{
				Object st = ltr.previous();
				System.out.println(st);
			}	

	}
}
