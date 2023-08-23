package com.core.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegEx 
{
	public static void main(String[] args)
	{
		Pattern p = Pattern.compile(".m");
		Matcher m = p.matcher("ammie");
		boolean b = m.matches();
		System.out.println(b);
		
		System.out.println(Pattern.matches("[a-z A-Z]+", "Java"));
		System.out.println(Pattern.matches("[\\w]+", "Java123"));

	}
}
