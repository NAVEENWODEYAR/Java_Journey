package com.annotation.model;

import com.annotation.Doggie;

public class FirstAnnotCls 
{
	public static void main(String args[])
	{
		// creating the object..,
		FirstAnnotClsEx ft = new FirstAnnotClsEx(6,"Gori");
		Doggie dg = new Doggie();
		
		// accessing the method of FirstAnnotClsEx
		ft.disp();
		
		// checking the annotations mapping..,
		if(dg.getClass().isAnnotationPresent(FirstAnnot.class))
		{
			System.out.println("This class is annotated with the custom annotation..,");
			System.out.println(ft.getClass());
			System.out.println(ft);
		}
		else
		{
			System.out.println("This class is not annotated with the custom annotation..,");

		}
			dg.setAge(6);
			dg.setName("Gani");
			System.out.println(dg.getAge() + "\r\n" + dg.getName());
	}
}
