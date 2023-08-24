package com.data.coding.copy;

import java.io.IOException;

public class ExceptionEx
{

	public static void main(String[] args)
	{
		try 
		{
   			throw new IOException("Hello World!");
   		} 
		catch(Exception e)
		{
   			System.out.println(e.getMessage());
   		}
	}

}
