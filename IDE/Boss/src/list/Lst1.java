package list;

import java.util.*;
public class Lst1 {

	public static void main(String[] args) {
		// converting an list to the array
		List<String> lt = new ArrayList<String>();
					lt.add("One");
					lt.add("Two");
					lt.add("Three");
					lt.add("Four");
					System.out.println("List "+lt);
					System.out.println("List size is: "+lt.size());
					System.out.println("List element at the index position 2 is: "+lt.get(2));
					
					System.out.println("**********");
			String arr[] = lt.toArray(new String[lt.size()]);
					System.out.println("Array "+Arrays.toString(arr));
					System.out.println("Array size is: "+arr.length);
	                System.out.println("Array element at the index postion 3 is: "+arr[3]);

			
					

	}

}
