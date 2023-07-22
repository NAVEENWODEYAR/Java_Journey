package com.dataJpa.code.string;

import java.util.StringJoiner;

public class StringBuilderEx
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder(",");
					sb.append("One").append("1");
					System.out.println(sb);
	}
}
