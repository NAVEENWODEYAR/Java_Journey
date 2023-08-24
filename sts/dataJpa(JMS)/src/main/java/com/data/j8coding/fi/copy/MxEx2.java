package com.data.j8coding.fi.copy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MxEx2 {
	
	int a;
	public static void main(String[] args)
	{
		int b = 5;
		String st = "Java";
		float f = 0.0f;
		char c = 'C';
		byte bb = 56; 
		
		List<String> lt = Arrays.asList("A","B");
		System.out.println(new MxEx2().a);
		System.out.println(b+ " is of type, "+((Object)(b)).getClass().getSimpleName());
		System.out.println(st+" is of type, "+ ((Object)(st)).getClass().getSimpleName());
		System.out.println(f+" is of type, "+ ((Object)(f)).getClass().getSimpleName());
		System.out.println(c+" is of type, "+ ((Object)(c)).getClass().getSimpleName());
		System.out.println(bb+" is of type, "+ ((Object)(bb)).getClass().getSimpleName());
		System.out.println(lt+" is of type, "+ ((Object)(lt)).getClass().getCanonicalName());
		System.out.println(lt+" is of type, "+ ((Object)(lt)).getClass().getModifiers());

		System.out.println(lt+" is of type, "+ ((Object)(lt)).getClass().getPackageName());

		System.out.println(lt+" is of type, "+ ((Object)(lt)).getClass().getSimpleName());
		System.out.println(lt+" is of type, "+ ((Object)(lt)).getClass().getTypeName());


	}

}
