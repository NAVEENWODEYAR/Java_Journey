package com.data.j8coding.fi.ref.copy;

import java.util.function.Function;

@FunctionalInterface
interface Test
{
	static void test()
	{
		System.out.println("Static method of the interface.,");
	}
	void test1();
}

public class MethodReferenceEx {
	
	public static void main(String[] args) 
	{
		Function<String, Integer> fn = (s-> Integer.parseInt(s));
		System.out.println(fn.apply("34"));
		
		// Method referencing.,
		Function<String, Integer> f1 = Integer::parseInt;
		System.out.println(f1.apply("23"));
		
		Test t = ()->System.out.println("Test");
		Test t1 = Test::test;
			
			t.test1();
	}

}
