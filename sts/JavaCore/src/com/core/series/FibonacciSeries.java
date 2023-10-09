// Write a Java Program for the Fibonacci series.
package com.core.series;

import java.util.Scanner;

public class FibonacciSeries
{
	public static void fibonacciSeries(int n)
	{
		int a=0,b=1,c=1;
			
			for(int i=0; i<=n; i++)
			{
				System.out.print(a+",");
				a = b;
				b = c;
				c = a+b;
			}	
	}
	
	// Fibonacci Series using Recursion.,
	static int fiboUisngJava8(int n)
	{
		if(n<1)
			return n;
		return fiboUisngJava8(n-1)+fiboUisngJava8(n-2);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to generate the series :");
		int i = sc.nextInt();
		
		fibonacciSeries(i);
		System.out.println("\n**********\n");
		fibonacciSeries(5);
	}

}
