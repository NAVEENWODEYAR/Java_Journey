package com.core.cls;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleTonCls implements Cloneable
{
	private static SingleTonCls instance=null;
	
	// private constructor
	private SingleTonCls()
	{
		
	}
	
	public static SingleTonCls getInstance()
	{
		if(instance == null)
		{
			instance = new SingleTonCls();
		}
		return instance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException 
	{
		
		SingleTonCls b = SingleTonCls.getInstance();
					System.out.println("Hashcode of the object b "+b.hashCode());
					
		SingleTonCls c = SingleTonCls.getInstance();
					System.out.println("Hashcode of the object c "+c.hashCode());
					System.out.println(c==b);
					System.out.println(c.equals(b));
								
		// reflection to break singleton and make prototype
		Class<?> singleTon = Class.forName("com.core.cls.SingleTonEx");
		@SuppressWarnings("unchecked")
		Constructor<SingleTonEx> constructor = (Constructor<SingleTonEx>) singleTon.getDeclaredConstructor(null);
		constructor.setAccessible(true);
		SingleTonEx instance = constructor.newInstance();
		System.out.println("Hashcode of the reflection object "+instance.hashCode());
	}	
}
