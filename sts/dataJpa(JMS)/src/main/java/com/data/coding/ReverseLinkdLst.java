package com.data.coding;

import java.util.LinkedList;

public class ReverseLinkdLst
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> lt = new LinkedList<>();
							lt.add(6);
							lt.add(1);
							lt.add(7);
							lt.add(2);
							
				System.out.println(lt);
				System.out.println("********");
				// reverse the list 
		LinkedList<Integer> ltr = new LinkedList<>();
					lt.descendingIterator().forEachRemaining(ltr::add);
					System.out.println(ltr);
	}

}
