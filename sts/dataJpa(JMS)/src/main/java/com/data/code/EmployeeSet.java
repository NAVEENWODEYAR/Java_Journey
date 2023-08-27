package com.data.code;

import java.util.HashSet;
import java.util.Set;

public class EmployeeSet
{

	public static void main(String[] args) 
	{
		Set<Employee> set = new HashSet<>();
		set.add(new Employee(1, "Ammie", "a@gmail.com", 1345.00, "HR", "Female", 2000));
		set.add(new Employee(189, "Zoya", "zoya@gmail.com", 845345.00, "Tech", "Female", 2008));
		set.add(new Employee(25, "Clara", "clara@gmail.com", 2345.00, "Production", "Female", 2010));
		set.add(new Employee(85, "Bella", "bella@gmail.com", 78445.00, "Tech", "Female", 2020));
		set.add(new Employee(89, "Nora", "nora@gmail.com", 5845.00, "Receiption", "Female", 2007));
		set.add(new Employee(58, "Riya", "riya@gmail.com", 98654.00, "Software", "Female", 2015));
		set.add(new Employee(89, "Nora", "nora@gmail.com", 5845.00, "Receiption", "Female", 2007));
		set.add(new Employee(58, "Riya", "riya@gmail.com", 98654.00, "Software", "Female", 2015));
		
		for(Employee e: set)
		{
			System.out.println(e);
		}
	}

}
