package com.core.string;

public class StringComp {

	public static void main(String[] args) 
	{
		String s1 = new String("String");
		String s2 = new String("String");
		strCompare(s1, s2);
	}
	static void strCompare(String s1,String s2)
	{
		if(s1.equals(s2))
			System.out.println("True");
		else
			System.out.println("False");
	}

}
