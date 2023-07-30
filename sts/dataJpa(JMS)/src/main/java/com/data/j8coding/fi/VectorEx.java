package com.data.j8coding.fi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args)
	{
		Vector<Integer> vt = new Vector<>();
						vt.add(1);
						vt.add(5);
						vt.add(2);
						vt.add(3);
						vt.add(4);
						System.out.println(vt);
						System.out.println(vt.size());
						System.out.println(vt.spliterator());
		
		Stack<String> st = new Stack();
						st.add("Ram");
						st.add("Sitha");
						st.add("Lav");
						st.add("Kush");
						st.push("Kush");
						st.pop();
						System.out.println(st);
						Collections.sort(st);
						System.out.println(st.peek());
						System.out.println(st);
						
	}

}
