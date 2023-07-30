package com.data.j8coding.fi;

import java.util.ArrayDeque;

public class ArrayDQ {

	public static void main(String[] args) 
	{
		ArrayDeque<Integer> adq = new ArrayDeque<>();
							adq.add(0);
							adq.addFirst(18);
							adq.add(81);
							adq.addLast(8);
							adq.add(9);
							adq.add(1);
							System.out.println(adq);
							System.out.println(adq.peekFirst());

	}

}
