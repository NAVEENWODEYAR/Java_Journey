package com.core.string;

public class Student 
{
	private int stId;
	private String stName;
	
	public Student(String name)
	{
		this.stName = name;
	}
	
	public static void main(String[] args) 
	{
		// compare Student objects,
		Student st1 = new Student("Amma");
		Student st2 = new Student("Amma");
		
			if(st1.equals(st2))
				System.out.println("Equal");
			else
				System.out.println("Not equal");		
	}

	@Override
	public boolean equals(Object obj) 
	{
		var st = (Student)obj;
		
			if(this.stId != st.stId )
				return false;
			if(!(this.stName.equals(st.stName)))
				return false;
		return true;
	}
}
