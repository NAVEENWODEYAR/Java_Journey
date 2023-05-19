package cF1;

import java.util.*;
public class ArrLst1 {

	public static void main(String[] args) {
		// Sorting the elements in the reverse order.
		List lt = new ArrayList();
			lt.add("Ana");
			lt.add("Zara");
			lt.add("Nole");
			lt.add("Bella");
			lt.add("Clara");
			lt.add("Verona");
			System.out.println("The original list "+lt);
			
		// sorting  ASC
			Collections.sort(lt);
			System.out.println("Ascending order "+lt);
			
		// sorting DSC
			Collections.sort(lt, Collections.reverseOrder());
			System.out.println("Descending order "+lt);
	}

}
