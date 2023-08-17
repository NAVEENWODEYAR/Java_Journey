package com.data.coding;

import java.util.*;

public class IntegersInList {

	public static boolean oddevenInList(List<Integer> lt)
	{
		for(int i: lt)
		{
			if(i%2 ==0)
			
				return true;
		}
				
			return false;
			
		
	}
	public static void main(String[] args)
	{
		List<Integer> lt = List.of(1,2,3,4,5,6,7,8,9);
		System.out.println(oddevenInList(lt));
	}

}
