package com.data.codefi;

public class NumbersExtractor 
{

	public static void main(String[] args) 
	{
		StringBuilder evenNumbers = new StringBuilder();
		StringBuilder oddNumbers = new StringBuilder();  
		
			for(int i=0; i<=100; i++)
			{
				if(i%2 == 0)
				{
					evenNumbers.append(" "+i);
				}
				else
				{
					oddNumbers.append(" "+i);
				}
			}
			System.out.println("Even Numbers,"+evenNumbers);
			System.out.println("*******");
			System.out.println("Odd Numbers, "+oddNumbers);
	}

}
