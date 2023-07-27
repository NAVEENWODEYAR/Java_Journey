package com.data.j8coding;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) 
	{
		Optional<String> st = Optional.of("Value");
					if(st.isEmpty())
					{
						System.out.println(st.get());
					}
					else
					{
						System.out.println("No value.,");
					}
	}

}
