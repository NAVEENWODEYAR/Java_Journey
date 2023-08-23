package com.core.regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegEx 
{
	public static void main(String[] args)
	{
		Pattern p = Pattern.compile("an");
		Matcher m = p.matcher(".abc");
		System.out.println(Pattern.matches("[a-z]+", "Java"));
	}
}
