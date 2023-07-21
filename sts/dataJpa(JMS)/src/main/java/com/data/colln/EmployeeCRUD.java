package com.data.colln;

import java.util.*;
import java.util.Map.Entry;
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
						empList.add(new Employee(7,49,"Ma","Male","HR",2006,5556677.00));
						
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
			System.out.println("Most experienced employee: "+experiancedEmp.getEName());
			
	// How many male and female employees are there in the sales and marketing team?
		Map<String, Long> empCount = empList.stream()		
										.filter(emp -> emp.getEDepartment() == "HR")
											.collect(Collectors.groupingBy(Employee::getEGender, Collectors.counting()));
		
				for(Map.Entry<String, Long> mp : empCount.entrySet())
				{
					System.out.println(mp.getKey() +":"+mp.getValue());
				}
						
	// What is the average salary of male and female employees?
		Map<String, Double> avgSal = empList.stream()
										.collect(Collectors.groupingBy(Employee::getEGender,Collectors.averagingDouble(Employee::getESalary)));
			for(Map.Entry<String, Double> mp : avgSal.entrySet())
			{
				System.out.println(mp.getKey()+":"+mp.getValue());
			}
			
	//  Who is the oldest employee in the organization? What is his age and which department he belongs to?
		Employee seniorMostEmp = empList.stream()
									.max(Comparator.comparing(Employee::getEAge))
										.get();
									
				System.out.println("===============");
				System.out.println("Senor Most Employee details.,");
				System.out.println("Employee name "+seniorMostEmp.getEName());
				System.out.println("Employee age "+seniorMostEmp.getEAge());
				System.out.println("Employee joining data "+seniorMostEmp.getYearOfJoining());


	// List down the names of all employees in each department?
		Map<String,List<Employee>> empLst = empList.stream()
												.collect(Collectors.groupingBy(Employee::getEDepartment));
				
		for(Map.Entry<String, List<Employee>> mp : empLst.entrySet())
				{
					System.out.println(mp.getKey()+":"+mp.getValue());
				}
		
	// What is the average salary and total salary of the whole organization?
	DoubleSummaryStatistics ds = empList.stream()
									.collect(Collectors.summarizingDouble(Employee::getESalary));
		System.out.println("Total salary: "+ds.getSum());
		System.out.println("Average salary: "+ds.getAverage());
		System.out.println("Minimum salary: "+ds.getMin());
//		System.out.println("Maximun salary: "+ds.getMax());*/
		
	// Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
		Map<Boolean, List<Employee>> mp = empList.stream()
											.collect(Collectors.partitioningBy(emp -> emp.getEAge() >= 25));
		Set<Entry<Boolean, List<Employee>>> st = mp.entrySet();
			for(Entry<Boolean,List<Employee>> hm : st)
			{
				if(hm.getKey())
				{
					System.out.println("*************");
					System.out.println("Employees above 25 years");
				}
				else
				{
					System.out.println("*************");
					System.out.println("Employess below 25 years.,");
				}
				
				List<Employee> eList = hm.getValue();
					for(Employee e: eList)
					{
						System.out.println(e.getEName());
					}
			}



	
	
	}

}
 