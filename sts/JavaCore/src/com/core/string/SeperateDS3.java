package com.core.string;

public class SeperateDS3 
{
	public static void extractString()
	{
		String st= "Naveen@123#$Kumar!456K";
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder();
		StringBuffer sbf = new StringBuffer();
		
		for(char s: st.toCharArray())
		{
			if(Character.isAlphabetic(s))
				sb.append(s);
			else if(Character.isDigit(s))
				sbf.append(s);
			else
				sb1.append(s);
		}
		
		System.out.println("Alphabets in the given string-= "+sb);
		System.out.println("Digits in the given string-= "+sbf);
		System.out.println("Symbols in the given string-= "+sb1);
		
	}
	public static void main(String[] args) 
	{
		extractString();
	}

}
