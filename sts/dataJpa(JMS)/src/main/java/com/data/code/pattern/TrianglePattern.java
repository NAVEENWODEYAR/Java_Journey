package com.data.code.pattern;

public class TrianglePattern 
{

	private static void trianglePattern()
	{
		for(int i=0; i<=10; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(j+" ");
			}
			System.out.println( );
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Triangle Pattern(Numbers) using for loop,");
		trianglePattern();
	}

}
