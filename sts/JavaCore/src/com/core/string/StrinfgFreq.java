package com.core.string;

import java.util.stream.*;

public class StrinfgFreq 
{
	static void charFreq(String st)
	{
		String[] str = st.toLowerCase().split("");
		
				Stream.of(str).collect(Collectors.groupingBy(s->s,Collectors.counting())).entrySet().forEach(System.out::print);
	}
	public static void main(String[] args)
	{
		System.out.println("\nProgram to find the character frequency in string using Java 8\n");
		charFreq("Ashok G H");
	}

}
