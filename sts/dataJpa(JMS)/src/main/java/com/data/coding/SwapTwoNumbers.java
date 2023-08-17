package com.data.coding;

public class SwapTwoNumbers {

	public static void reverseString(int a,int b)
	{
		System.out.println("Before swapping, "+b+"--"+a);
		a = a+b; 	
		b = a-b;	
		a = a-b;	
		System.out.println("After swapping, "+b+"--"+a);
	}
	public static void main(String[] args)
	{
		// reverse the given string using stringBuilder
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		reverseString(a,b);
	}

}
