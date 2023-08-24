package com.data.j8coding.fi.copy;

import java.util.*;
import java.util.function.BiPredicate;

public class BiFunctionEx {

	public static void main(String[] args) 
	{
		// BiFunction 
		List<String> list = Arrays.asList("Nora","Monali","Rani","Kate");
						 BiPredicate<String, String> bipd = (a,b) -> {return a==b;};
	}

}
 