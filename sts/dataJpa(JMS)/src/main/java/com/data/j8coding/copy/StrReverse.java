// WAP to reverse the String 
package com.data.j8coding.copy;

public class StrReverse 
{
	public static void main(String[] args) 
	{
		String str = "JavA";
		char[] ch = str.toCharArray();
			
			for(int i=ch.length-1; i>=0; i--)
			{
				System.out.print(ch[i]);
			}
		
	}

}
