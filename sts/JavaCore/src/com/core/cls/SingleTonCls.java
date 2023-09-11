package com.core.cls;

public class SingleTonCls
{
	private static SingleTonCls instance=null;
	private String s;
	
	// private constructor
	private SingleTonCls()
	{
		s="Private constructor";
	}
	
	public static SingleTonCls getInstance()
	{
		if(instance == null)
		{
			instance = new SingleTonCls();
		}
		return instance;
	}
	
	public static void main(String[] args) 
	{
		SingleTonCls a = new SingleTonCls();
					a.getInstance();
					System.out.println(a.getClass().hashCode());
	
		SingleTonCls b = SingleTonCls.getInstance();
					System.out.println(b.getClass().hashCode());
	}
	
}