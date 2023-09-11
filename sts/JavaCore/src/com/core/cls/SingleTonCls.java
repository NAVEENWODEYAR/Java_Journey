package com.core.cls;

public class SingleTonCls
{
	private static SingleTonCls instance;
	
	// private constructor
	private SingleTonCls()
	{
		
	}
	
	public SingleTonCls getInstance()
	{
		if(instance == null)
		{
			instance = new SingleTonCls();
		}
		return instance;
	}
	
}
