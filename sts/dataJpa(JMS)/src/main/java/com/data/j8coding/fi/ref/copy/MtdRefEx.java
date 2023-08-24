package com.data.j8coding.fi.ref.copy;

import java.util.function.Supplier;

public class MtdRefEx
{
	public String st;
	public MtdRefEx(String st)
	{
		this.st = st;
	}
	public String getName()
	{
		return st;
	}
	public static void main(String[] args) 
	{
		MtdRefEx m= new MtdRefEx("Instance Variable.,");
		Supplier<String> s = () -> m.getName();
		Supplier<String> s1 = m::getName;
		System.out.println(s.get());
		System.out.println(s1.get());
		
	}
}
