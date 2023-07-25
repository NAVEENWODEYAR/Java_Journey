package com.data.sort;

import java.util.*;

public class SortEx 
{

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(9,1,7,3,5);
		
		// sort using the Collections class static methods
		Collections.sort(list);
		System.out.println("Natural sorting order: "+list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Reverse order: "+list);
		
		// shuffle 
//		Collections.shuffle(list);
		System.out.println("Shufled list: "+list);
		
		Collections.swap(list, 4, 1);
		System.out.println(list);
	}
}
