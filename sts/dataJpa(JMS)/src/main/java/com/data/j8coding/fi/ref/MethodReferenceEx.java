package com.data.j8coding.fi.ref;

import java.util.function.Function;

public class MethodReferenceEx {
	
	static void test()
	{
		System.out.println("Static Method Reference.,");
	}
	public static void main(String[] args) 
	{
		Function<String, Integer> fn = (s-> Integer.parseInt(s));
		System.out.println(fn.apply("St"));
	}

}
