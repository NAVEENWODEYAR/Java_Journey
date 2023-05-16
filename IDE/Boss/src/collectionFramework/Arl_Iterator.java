package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
public class Arl_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
				al.add(1);
				al.add(2);
				al.add(3);
				al.add(4);
				al.add(5);
				al.add(6);
				al.add(7);
				al.add(8);
			Iterator<Integer> itr = al.iterator();
			System.out.println(itr);
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			// iterating using for-each loop
			System.out.println("***FOR each loop****");
			for (int i : al)
			{
				System.out.println(i);
			}
	}

}
