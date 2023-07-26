package com.data.j8coding;

public class StrRev2
{
	 public static void main(String[] args)
	    {
	        // reverse the string
	        String s = "Spring Boot";

	        // Convert the string to the array.,
	            char[] c = s.toCharArray();
	           for (int i = c.length-1; i>=0; i--)
	           {
	               System.out.print(c[i]);
	           }
	    }
}
