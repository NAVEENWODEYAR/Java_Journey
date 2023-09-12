package com.core.cls;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
		SingleTonCls a = new SingleTonCls();
					a.getInstance();
					System.out.println(a.hashCode());
	
		SingleTonCls b = SingleTonCls.getInstance();
					System.out.println(b.hashCode());
					
					System.out.println(a.equals(b));
					System.out.println(a==b);
					
		SingleTonCls c = SingleTonCls.getInstance();
					System.out.println(c.getClass().hashCode());
					System.out.println(c==b);
					System.out.println(c.equals(b));
					
					
		// reflection to break singleton and make prototype
		Class<?> singleTon = Class.forName("com.core.cls.SingleTonEx");
		@SuppressWarnings("unchecked")
		Constructor<SingleTonEx> constructor = (Constructor<SingleTonEx>) singleTon.getDeclaredConstructor(null);
		constructor.setAccessible(true);
		SingleTonEx instance = constructor.newInstance();
		System.out.println(instance.hashCode());
		
		// cloning
		System.out.println("Using cloning");
		try {
			SingleTonEx clonedInstance = (SingleTonEx) a.clone();
			System.out.println(clonedInstance.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
