package cF1;

import java.util.*;
public class ArrLstSort {

	public static void main(String[] args) {
		// Sorting the elements using Collections.sort()
		System.out.println("Sorting the elements using Collections.sort");
			List lt = new ArrayList();
				lt.add(1);
				lt.add(9);
				lt.add(2);
				lt.add(5);
				lt.add(3);
				lt.add(10);
				lt.add(6);
				lt.add(7);
				System.out.println("Original List: "+lt);
				
		// Iterating the list
				System.out.println("Elements of the list are: ");
				for(int i=0; i<lt.size(); i++)
				{
					System.out.println(lt.get(i));
				}
				
		// sorting using Collections.sort()
				Collections.sort(lt);
				System.out.println("List after sorting: "+lt);
		
		// Iterating using Iterator
				System.out.println("Sorted order ");
				Iterator it = lt.iterator();
					while(it.hasNext())
					{
						System.out.println(it.next());
					}
	
		//  reverse order
//				System.out.println("Reverse Order ");
//				Collections.reverse(lt);
				
		// Sorting in the reverse order
				System.out.println("Sorting in the reverse order");
				Collections.sort(lt, Collections.reverseOrder());
				System.out.println(lt);
				
	}

}
