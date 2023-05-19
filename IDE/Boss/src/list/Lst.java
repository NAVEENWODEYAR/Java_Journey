package list;

import java.util.*;
public class Lst {

	public static void main(String[] args) {
		// convert Array to List
		String [] books = {"Kannada","English","Hindi","Malayalam","Marathi"};
		System.out.println("Iterating the array with forEach");
			for(String book:books)
			{
				System.out.println(book);
			}
		System.out.println("Size of the array is- "+books.length);
		System.out.println("Books is an String array "+ Arrays.toString(books));
		
		System.out.println("******************");
		System.out.println("Converting from array to list ");
			List lst = new ArrayList();
				for(String book:books)
				{
					lst.add(book);
				}
				System.out.println("Size of the list is "+ lst.size());
				System.out.println("lst is an list- "+lst);
	}

}
