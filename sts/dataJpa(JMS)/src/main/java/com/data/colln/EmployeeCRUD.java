package com.data.colln;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeCRUD 
{

	public static void main(String[] args) 
	{
		List<Employee> empList = new ArrayList<>();
						empList.add(new Employee(1,25,"Monali","Female","HR",2012,34567.00));
						empList.add(new Employee(2,21,"Monark","Male","Testing",2011,64567.00));
						empList.add(new Employee(6,27,"Riya","Female","Tech",2020,14567.00));
						empList.add(new Employee(9,29,"Emma","Female","Testing",2010,84567.00));
						empList.add(new Employee(3,21,"Zack","Male","Tech",2019,94567.00));
						empList.add(new Employee(5,34,"Root","Male","Staff",2009,54567.00));
						empList.add(new Employee(4,56,"Broad","Male","Staff",2003,84567.00));
						empList.add(new Employee(7,49,"Mary","Female","HR",2006,5556677.00));
						
	/**   How many male and female employees are there in the organization?   M-4, F-4
		Map<String, Long> maleFemaleEmp = empList.stream()
											.collect(Collectors.groupingBy(Employee::getEGender, Collectors.counting()));
		for(Map.Entry<String,Long> mp : maleFemaleEmp.entrySet())
		{
			System.out.println(mp.getKey() +" = "+mp.getValue());
		}
						
	// Print the name of all departments in the organization?
						empList.stream()
								.map(emp -> emp.getEDepartment())
								.distinct()
								.forEach(System.out::println);
						
	// What is the average age of male and female employees?
		Map<String, Double> avgAge = empList.stream()
									.collect(Collectors.groupingBy(Employee::getEGender, Collectors.averagingDouble(Employee::getEAge)));
									
				for(Map.Entry<String, Double> mp : avgAge.entrySet())
				{
					System.out.println(mp.getKey() +" : "+mp.getValue());
				}
	
	// Get the details of highest paid employee in the organization?
	Optional<Employee> maxSal = empList.stream()	
									.max(Comparator.comparing(Employee::getESalary));
		Employee mxSal = maxSal.get();
		System.out.println("Employee Details, with maximum salary ");
		System.out.println("Emp name "+mxSal.getEName());
		System.out.println("Emp salary "+mxSal.getESalary());
		
		
	// Get the names of all employees who have joined after 2015?
								empList.stream()
											.filter(emp -> emp.getYearOfJoining() > 2015)
												.map(Employee::getEName)
												.forEach(System.out::println);
	
	// Count the number of employees in each department?
		Map<String, Long> mp = empList.stream()
								.collect(Collectors.groupingBy(Employee::getEDepartment, Collectors.counting()));
			for(Map.Entry<String, Long> m : mp.entrySet())
			{
				System.out.println(m.getKey()+": "+m.getValue());
			}
	// What is the average salary of each department?
		Map<String, Double> avgSal = empList.stream()
										.collect(Collectors.groupingBy(Employee::getEDepartment,Collectors.averagingDouble(Employee::getESalary)));
						
			for(Map.Entry<String, Double> mp : avgSal.entrySet())
			{
				System.out.println(mp.getKey()+":"+mp.getValue());
			}
						
	// Get the details of youngest male employee in the product development department?
		Employee youngestMaleEmp =  empList.stream()
									.filter(emp -> emp.getEDepartment()=="Staff" && emp.getEGender()=="Male")
										.min(Comparator.comparing(Employee::getEName)).get();
			System.out.println(youngestMaleEmp.getEName());
						
	// Who has the most working experience in the organization?
		Employee experiancedEmp = empList.stream()
									.sorted(Comparator.comparing(Employee::getYearOfJoining))
										.findFirst().get();
			System.out.println("Most experianced employee: "+experiancedEmp.getEName());*/
			
			
	// How many male and female employees are there in the sales and marketing team?
		Map<>		
						
				
	}

}
