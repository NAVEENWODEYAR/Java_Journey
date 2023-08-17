// Program to prove strings are immutable in java.,
package com.data.coding;

public class StringImmutable 
{

	public static void main(String[] args) 
	{
		String s1 = "Java";	//String created in pool and reference assigned to s1
		String s2= s1;		// s2 also has the same reference to "Java" in the pool
			if(s1==s2)
			{
				System.out.println("Both have the same reference.,");
			}
			else
		s1 = "JavaScript";	// new String "JavaScript" got created in the pool, s1 is now referring to the new String in the pool 
			if(s1==s2)
			{
				System.out.print("Strings are immutable");
			}
	}

}
