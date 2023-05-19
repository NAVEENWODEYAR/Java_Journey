package list;

import java.util.*;
public class Lst2 {

	public static void main(String[] args) {
		// Converting Array to list
		String emp[] = {"Jones","Clara","Rooney","Messi"};
		System.out.println("emp is array with string elements-- "+Arrays.toString(emp));
		System.out.println("Size of the emp array--"+ emp.length);
		
		// converting emp[] to list
		List<String> lt = new ArrayList<String>();
			for(String e:emp)
			{
				lt.add(e);
			}
			System.out.println("lt is generic arraylist"+lt);
							Collections.sort(lt,Collections.reverseOrder());
				System.out.println("lt elements");
				Iterator it = lt.iterator();
					while(it.hasNext())
					{
						System.out.println(it.next());
					}
					
	}

}
