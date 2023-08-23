package com.core.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegEx2 
{
	public static void main(String[] args)
	{
		
		System.out.println(Pattern.matches("[a-z A-Z]+", "Java"));
		System.out.println(Pattern.matches("[\\w]+", "Java123"));

	}
}
