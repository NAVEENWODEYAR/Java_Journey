package com.data.j8coding.copy;

public class StrRev1
{
	 public static void main(String[] args)
	    {
	        // reverse the string
	        String s = "Spring Boot";
	        java.lang.StringBuilder s1 = new java.lang.StringBuilder();
//	                                s1.append(s);
//	                                s1.reverse();
//	                                System.out.println(s1);

	            for (int i = s.length()-1; i> 0; i--)
	            {
	                s1.append(i);
	            }
	        System.out.println(s1);
	    }
}
