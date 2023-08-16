package com.data.j8coding.fi;

public class Palindrome {

	public static void main(String[] args)
	{

		String st = "MAM";
		StringBuilder sb = new StringBuilder();
						sb.append(st);
						sb.reverse();
	
						if(sb.toString().equals(st))
						{
							System.out.println("Palindrome");
						}
						else
						{
							System.out.println("Not an Palindrome");

						}
	}

}
