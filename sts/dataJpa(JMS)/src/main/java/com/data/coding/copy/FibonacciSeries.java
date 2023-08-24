package com.data.coding.copy;

public class FibonacciSeries {

	public static void fibNacciSeries(int n)
	{
		int a = 0;
		int b = 1;
		int c = 1;
			
			for(int i=0; i<=n; i++)
			{
				System.out.print(a+",");
			a = b;
			b = c;
			c = a+b;
			}
	}
	public static void main(String[] args)
	{
		int a = Integer.parseInt(args[0]);
		fibNacciSeries(a);
		
	}

}
