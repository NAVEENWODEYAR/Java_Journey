package com.core.set;

import java.util.*;

public class TreeSetEx
{

	public static void main(String[] args)
	{
		TreeSet<Integer> set = new TreeSet<>();
					set.add(1);
					set.add(5);
//					set.add(null);
			System.out.println("TreeSet doesn't allows null values");	
			Iterator itr = set.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
					
	}
}
