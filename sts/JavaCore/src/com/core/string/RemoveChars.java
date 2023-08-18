// Write a Java method that will remove a given character from a string object.
package com.core.string;

public class RemoveChars 
{
	public static String removeChars(String st, char c)
	{
		if(st.isEmpty())
			return null;
		return st.replaceFirst(Character.toString(c),"");
	}
	public static void main(String[] args)
	{
		System.out.println(removeChars("String", 't'));
	}

}
