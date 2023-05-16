package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrLst5 {

	public static void main(String[] args) {
		// remove()
		
		List<String> l = new ArrayList<String>();
			l.add("One");
			l.add("Two");
			l.add("three");
			l.add("four");
		List<Integer> lt = new ArrayList<Integer>();
			lt.add(1);
			lt.add(4);
			lt.add(9);
			lt.add(3);
			
			
			System.out.println("ArrayList with only string "+ l);
			System.out.println("ArrayList with only numbers "+ lt);
		
			lt.remove(0);
			lt.remove(lt);
			System.out.println("After removing the element" +lt);
			
			Collections.sort(lt);
			Collections.sort(l);
			
			System.out.println("Sorted order"+lt);
			System.out.println("Sorted order"+l);
			
			Collections.shuffle(l);
			Collections.shuffle(lt);
			System.out.println("After Shuffling "+l);
			System.out.println("After Shuffling "+lt);
	}

}
