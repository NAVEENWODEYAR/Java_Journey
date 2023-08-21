// Java 8 Program to Print ten random numbers using forEach?

package com.core.j8;

import java.util.Random;

public class RandomEx 
{
	public static void randomNumbers(int n)
	{
		new Random().ints().limit(n).forEach(System.out::println);
		new Random().doubles().limit(10).forEachOrdered(System.out::println);
	}
	
	public static void main(String[] args) 
	{
		System.out.println(Math.random());
		randomNumbers(5);
	}

}
