package com.core.string;

class Student
{
	private int stId;
	private String stName;
	
	public Student(String name)
	{
		this.stName = name;
	}
}
public class StringComp {

	public static void main(String[] args) 
	{
		String s1 = new String("String");
		String s2 = new String("String");
		strCompare(s1, s2);
		
		// compare Student objects,
		Student st1 = new Student("Amma");
		Student st2 = new Student("Amma");
		
	}
	static void strCompare(String s1,String s2)
	{
		System.out.println("\nString comparision,\n");
		if(s1 == s2)
			System.out.println("True");
		else
			System.out.println("False");
	}
	
	static void objComparision(Student s1, Student s2s)
	{
		System.out.println("\n Object Comparision,\n");
	}

}
