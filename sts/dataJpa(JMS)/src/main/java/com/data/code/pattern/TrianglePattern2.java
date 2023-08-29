package com.data.code.pattern;

public class TrianglePattern2 
{

	private static void trianglePattern()
	{
		for(int i=10; i>=0; i--)
		{
			for(int j=10; j>=i; j--)
			{
				System.out.print(j+" ");
			}
			System.out.println( );
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Triangle Pattern using for loop,");
		trianglePattern();
	}

}
