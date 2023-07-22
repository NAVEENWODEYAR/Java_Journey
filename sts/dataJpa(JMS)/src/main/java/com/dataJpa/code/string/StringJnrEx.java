package com.dataJpa.code.string;

import java.util.StringJoiner;

public class StringJnrEx
{
	public static void main(String[] args) 
	{
		StringJoiner sj = new StringJoiner(",", "[", "]");
					sj.add("One").add("Two").add("Three");
					System.out.println(sj.toString());
	}
}
