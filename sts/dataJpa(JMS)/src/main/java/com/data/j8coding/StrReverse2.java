// WAP to reverse the String 
package com.data.j8coding;

public class StrReverse2 
{
	public static void main(String[] args) 
	{
		String str = "JavA";
		StringBuilder sb = new StringBuilder();
						sb.append(str);
						sb.reverse();
						System.out.println("Original String "+str);
						System.out.println("Reverserd string "+sb);
	}

}
