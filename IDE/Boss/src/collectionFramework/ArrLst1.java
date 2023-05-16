package collectionFramework;

import java.util.*;
public class ArrLst1 {

	public static void main(String[] args) {
		// ArrayList class 
		ArrayList<String> arl1 = new ArrayList<String>();
			arl1.add(0, "One");
			arl1.add("Two");
			
			
		ArrayList<String> arl2 = new ArrayList<String>();
			arl2.add("1");
			arl2.add("2");
			arl2.add("3");
			
			System.out.println(arl1.addAll(1,arl2));		// 	appending the arl2 to the arl1 at the specified index position
			System.out.println(arl1);
			
			System.out.println(arl1.isEmpty());
			System.out.println(arl2.isEmpty());
			
	
			

	}

}
