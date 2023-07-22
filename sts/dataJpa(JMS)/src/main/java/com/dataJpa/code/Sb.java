package com.dataJpa.code;

import java.util.StringJoiner;

public class Sb
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder("->");
						sb.append("Test");
						sb.append("Test");
						System.out.println(sb);
						
		StringJoiner sj = new StringJoiner("[","->","]");
					sj.add("1");
					sj.add("One");
					System.out.println(sj);
	}
}
