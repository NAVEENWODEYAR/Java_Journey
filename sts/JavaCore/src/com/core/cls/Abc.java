package com.core.cls;

public class Abc implements Cloneable
{

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Abc a = new Abc();
		Abc b = new Abc();
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.clone());
		Abc c = (Abc) a.clone();
		System.out.println(a==c);
		
	}

}
