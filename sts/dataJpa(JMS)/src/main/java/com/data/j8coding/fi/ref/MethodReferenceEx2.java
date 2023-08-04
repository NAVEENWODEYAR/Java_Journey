package com.data.j8coding.fi.ref;

import java.util.function.Function;

import com.data.j8coding.fi.BiFunctionEx;

public class MethodReferenceEx2 {
	
	public static void main(String[] args) 
	{
		Function<String, Boolean> fn = (s-> {if(s.length()> 5)
												return true;
											else
												return false;													
											});
		
		System.out.println(fn.apply("Str"));
		
		Function<String, String> f1 = (s)->s.toLowerCase();
		Function<String, String> f2 = String::toUpperCase;
		System.out.println(f1.apply("String"));
		System.out.println(f2.apply("String"));
	}

}
