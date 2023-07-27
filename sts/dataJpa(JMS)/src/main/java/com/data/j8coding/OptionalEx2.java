package com.data.j8coding;

import java.util.Optional;

public class OptionalEx2 {

	public static void main(String[] args) 
	{
//		String st = "I have value";
		String st = null;
//		Optional op = Optional.of(st);
		Optional op = Optional.ofNullable(st);
		System.out.println(op);
		System.out.println(op.orElse("Test"));
	
	}

}
