package com.bookstore.lamda;

import java.util.function.Function;

public class Lamda1
{
	public static void main(String[] args)
	{
		// To use lambda function we need FI
		Function<Integer, Integer> add = a->a*a;
		System.out.println("Square of the number is " +add.apply(5));	
	}

}
