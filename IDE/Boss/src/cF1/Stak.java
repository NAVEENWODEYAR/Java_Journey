package cF1;

import java.util.*;
public class Stak {

	public static void main(String[] args) {
		// Stack is the subclass of Vector. It implements the last-in-first-out(LIFO) data structure
		Stack st = new Stack();
				st.push("Julie");
				st.push("Serena");
				st.add("Veronica");
				st.add("Melina");
				st.pop();
				st.remove("Melina");
				st.add(3,"Melina");
				st.set(3,"Rory");
				System.out.println(st);
				
			// Iterating using Iterator
			System.out.println("Elements of the Stack ");
			Iterator it = st.iterator();
				while(it.hasNext()){
					System.out.println(it.next());
				}
					
	}

} 
