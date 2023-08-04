package com.data.j8coding.fi.ref;

import java.util.function.Function;

public class MethodReferenceEx2 {
	
	public static void main(String[] args) 
	{
		Function<String, Boolean> fn = (s-> {if(s.length()> 5)
												return true;
											else
												return false;													
											});
		
		System.out.println(fn.apply("Str"));
	}

}
