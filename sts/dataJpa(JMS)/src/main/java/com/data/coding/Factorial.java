package com.data.coding;

public class Factorial {
	public static void factorialOfNumber(int n)
	{
		int fact = 1;
		for(int i=1; i<=n; i++)
		{
			fact = fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) 
	{
		int n = Integer.parseInt(args[0]);
		factorialOfNumber(4);
	}

}
