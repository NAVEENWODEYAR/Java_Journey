package com.core.interviewquesions;

public class SingleTonCls  implements Cloneable
{
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	// static instance of the class,
	private static SingleTonCls obj=null;
	
	private SingleTonCls()
	{
		
	}
	
	public static SingleTonCls getInstance()
	{
		if(obj == null)
		{
			obj = new SingleTonCls();
		}
		return obj;
	}	
	public static void main(String[] args) 
	{
		SingleTonCls obj = SingleTonCls.getInstance();
		SingleTonCls obj1 = SingleTonCls.getInstance();
							
		System.out.println(obj.hashCode() == obj1.hashCode());
	}
}
