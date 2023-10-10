// Write a Java Program to generate the Fibonacci series.
package com.core.series;

import java.util.Scanner;
import java.util.stream.Stream;

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
		System.out.println("\nEnter an number to generate the series :");
		int i = sc.nextInt();
		
		fibonacciSeries(i);
		System.out.println("\n**********\n");
		fibonacciSeries(5);
	}
	
	// static block.,
	static
	{
		System.out.println("\nFibonacci Series using Java 8 & Stream\n");
		Stream.iterate(new int[]{0,1}, f-> new int[] {f[1],f[0]+f[1]})
				.limit(10)
				.map(n->n[0])
				.forEach(num->System.out.print(num));	
	}
}
