//Write a Java Program to find the duplicate characters in a string.
package com.core.string;

public class RemoveDuplicate 
{
	public static void removeDuplicteChars(String str)
	{
		char st[] = str.toCharArray();
		int count = 0;
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i+1; j<str.length(); j++)
			{
				if(st[i]==st[j])
				{
					System.out.println(st[j]);
					count++;
					break;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		removeDuplicteChars("Java");
	}

}
