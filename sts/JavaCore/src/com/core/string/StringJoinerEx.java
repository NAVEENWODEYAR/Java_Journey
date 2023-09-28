// Java 8 Program to add prefix and suffix to the String?

package com.core.string;

import java.util.StringJoiner;

public class StringJoinerEx 
{

	public static void main(String[] args) 
	{
		StringJoiner str  = new StringJoiner(",","#","#");
					str.add("One");
					str.add("Two");
					str.add("Three");
					str.add("Four");
					str.add(null);
					str.add("null");
					str.add("");
					
					System.out.println(str);
	}

}
