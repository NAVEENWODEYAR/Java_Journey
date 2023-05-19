package set;

import java.util.*;
public class LinkedHashSt2 {

	public static void main(String[] args) {
		// LikedHashSet
		LinkedHashSet lks = new LinkedHashSet();
					lks.add(1);
					lks.add(5);
					lks.add(2);
					lks.add(3);
					lks.add(4);
					System.out.println("LinkedHashSet "+ lks);
					
					// iterating the list
					System.out.println("********");
					for (Object l:lks)
					{
						System.out.println(l);
					}
		

	}

}
