package com.data.j8coding;

import java.util.Optional;

public class OptionalEx3 {

	public static void main(String[] args) 
	{
		String st = "String";
			
		// create an optional object.,
//		Optional opt = Optional.ofNullable(st);
		Optional opt = Optional.of(st);
		
		if(opt.isEmpty())
		{
			System.out.println("Initialize the value.,");
		}
		else
		{
			System.out.println(opt.get().toString());
		}
	
	}

}
