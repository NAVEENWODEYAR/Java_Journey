package com.core.string;

public class Student 
{
	private int stId;
	private String stName;
	
	public Student(String name)
	{
		this.stName = name;
	}
	
	static void objComparision(Student s1, Student s2)
	{
		System.out.println("\n Object Comparision,\n");
		
		if(s1.equals(s2))
			System.out.println("Both the objects are equal");
		else
			System.out.println("Both the objects are not equal");
		
	}
	
	public static void main(String[] args) 
	{
		// compare Student objects,
		Student st1 = new Student("Amma");
		Student st2 = new Student("Amma");
		objComparision(st1, st2);
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		if(obj == this)
			return true;
		if(!(obj instanceof Student))
			return false;
		Student s = (Student)obj;
		return stName.equals(s.n)  == 0;
	}

}
