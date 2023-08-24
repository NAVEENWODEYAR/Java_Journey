package com.data.j8coding.copy;

import java.util.function.BiFunction;

interface LambdaI
{
	int add(int a);
}
public class LamdaEx 
{
	public static void main(String[] args)
	{
		// lambda function 
		LambdaI i = a -> a*a;
		System.out.println(i.add(5));
		
		// BiFunction predefined functional interface.,
		BiFunction<Integer, Integer, Integer> fn = (a,b) -> a+b;
		System.out.println(fn.apply(9, 8));
		
	}

}
