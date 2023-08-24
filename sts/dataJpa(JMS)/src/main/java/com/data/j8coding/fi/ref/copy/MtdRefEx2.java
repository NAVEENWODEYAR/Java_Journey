package com.data.j8coding.fi.ref.copy;

import java.util.function.Supplier;

class Test6
{
	
}
public class MtdRefEx2
{
	
	public static void main(String[] args) 
	{
		// create the object using the constructor reference.,
		Supplier<Test6> s = Test6::new;
		System.out.println(s.get());
		
		// create the object using the lambda,
		Supplier<MtdRefEx2> s1 = ()-> new MtdRefEx2();
		System.out.println(s1.get());
		
		
	}
}
