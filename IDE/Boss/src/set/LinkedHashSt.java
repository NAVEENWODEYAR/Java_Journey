package set;

import java.util.*;
public class LinkedHashSt {

	public static void main(String[] args) {
		// LikedHashSet
		LinkedHashSet lks = new LinkedHashSet();
					lks.add("One");
					lks.add("Two");
					lks.add("Three");
					lks.add("Four");
					lks.add("Five");
					System.out.println("LinkedHashSet "+ lks);
					
					// iterating the list
					System.out.println("********");
					for (Object l:lks)
					{
						System.out.println(l);
					}
					System.out.println(lks.hashCode());

	}

}
