package cF1;

import java.util.*;
public class LinkLst {

	public static void main(String[] args) {
		// LinkedList
		LinkedList lt = new LinkedList();
		System.out.println(lt);
				lt.add("Angel");
				lt.add(25);
				lt.add("Female");
				lt.add("angel@gmail.com");
			System.out.println("LinkedList "+lt);
			
			// iterating using iterator
			System.out.println("Iterating using the Iterator.");
			Iterator it = lt.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
	}

}
