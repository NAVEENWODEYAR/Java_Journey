package com.data.colln;


import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.antlr.v4.runtime.misc.EqualityComparator;


public class EmpCRUD 
{

	public static void main(String[] args)
	{
		// insert dummy data.,
		List<Employee> eList = Arrays.asList(new Employee(1,25,"Monali","Female","HR",2012,34567.00),
												new Employee(2,21,"Monark","Male","Testing",1998,64567.00),
												new Employee(6,27,"Riya","Female","Tech",2020,14567.00),
												new Employee(9,29,"Emma","Female","Testing",2010,84567.00),
												new Employee(19,39,"Emanuel","Male","HR",2018,64567.00),
												new Employee(29,49,"Watson","Male","HR",1999,754567.00),
												new Employee(3,49,"Roney","Male","Tech",2018,24567.00),
												new Employee(6,36,"Monali","Female","Operations",2010,84567.00));
		
		/**
		// 1.  How many male and female employees are there in the organization?
						Map<String, Long> genderCount  = eList.stream()
															.collect(Collectors.groupingBy(Employee::getEGender,Collectors.counting()));
						
							for(Map.Entry<String, Long> mp : genderCount.entrySet())
							{
								System.out.println(mp.getKey()+":"+mp.getValue());
							}
							
							
	// 2. Print the name of all departments in the organization?
							List<String> deptNames = eList.stream()
									.map(Employee::getEDepartment)
										.distinct().collect(Collectors.toList());
							System.out.println(deptNames);
							
		
	// 3. What is the average age of male and female employees?
						Map<String, Double> avgAge =	eList.stream()
								.collect(Collectors.groupingBy(Employee::getEGender, Collectors.averagingDouble(Employee::getEAge)));
						
						System.out.println("Average age of the employees");	
						for(Map.Entry<String, Double> mp : avgAge.entrySet())
							{
								System.out.println(mp.getKey()+":"+mp.getValue());
							}
							
		// 4. Get the details of highest paid employee in the organization?
							Optional<Employee> maxSal = eList.stream()
														.max(Comparator.comparing(Employee::getESalary));
							Employee mxSal = maxSal.get();
							System.out.println(mxSal.getEName());
							System.out.println(mxSal.getESalary());
							
							
	// 5. Get the names of all employees who have joined after 2015?
							eList.stream()
								.filter(emp -> emp.getYearOfJoining() > 2015)
									.map(Employee::getEName)
										.forEach(System.out::println);		
							
	
	// 6. Count the number of employees in each department?
							Map<String, Long> empCount = eList.stream()
															.collect(Collectors.groupingBy(Employee::getEDepartment,Collectors.counting()));
							Set<Entry<String, Long>> st = empCount.entrySet();
							
							for(Entry<String, Long> el : st)
							{
								System.out.println(el.getKey()+":"+el.getValue());
							}
							
							
	// 7.  What is the average salary of each department?
							Map<String, Double> avgSal = eList.stream()
														.collect(Collectors.groupingBy(Employee::getEDepartment,Collectors.averagingDouble(Employee::getESalary)));
							
							for(Entry<String, Double> mp : avgSal.entrySet())
							{
								System.out.println(mp.getKey()+":"+mp.getValue());
							}
							
	// 8. Get the details of youngest male employee in the product development department?
							Optional<Employee> youngestEmp = eList.stream()
																.filter(emp -> emp.getEDepartment() == "HR" && emp.getEGender() =="Male")
																	.min(Comparator.comparing(Employee::getEAge));
							Employee yEmp = youngestEmp.get();
							System.out.println(yEmp.getEName());
							
							
	// 9. Who has the most working experience in the organization?
							Employee seniorEmp = eList.stream()
														.sorted(Comparator.comparing(Employee::getYearOfJoining))
															.findFirst().get();
							System.out.println("Senior most employee: "+seniorEmp.getEName());
							System.out.println(seniorEmp.getYearOfJoining());
							System.out.println(seniorEmp.getEAge());
							
	
	// 10. How many male and female employees are there in the sales and marketing team?
							Map<String, Long> empHR = eList.stream()
								.filter(emp -> emp.getEDepartment().equals("HR"))
									.collect(Collectors.groupingBy(Employee::getEGender,Collectors.counting()));
							
							for(Map.Entry<String, Long> mp : empHR.entrySet())
							{
								System.out.println(mp.getKey()+":"+mp.getValue());
							}
							
													
	// 11. What is the average salary of male and female employees?
					Map<String, Double> avgSal = eList.stream()
													.collect(Collectors.groupingBy(Employee::getEGender,Collectors.averagingDouble(Employee::getESalary)));
													
													
						for(Map.Entry<String, Double> mp : avgSal.entrySet())
						{
							System.out.println(mp.getKey()+":"+mp.getValue());
						}
						
						
						
	// 12. List down the names of all employees in each department?
						Map<String, List<Employee>> eNames = eList.stream()
													.collect(Collectors.groupingBy(Employee::getEDepartment));
							
						Set<Entry<String, List<Employee>>> set = eNames.entrySet();
						
						for(Entry<String, List<Employee>> mp : set)
						{
							System.out.println("===========");
							System.out.println(mp.getKey());
							
							List<Employee> list = mp.getValue();
							for(Employee e: list)
							{
								System.out.println(e.getEName());
							}	
						}
						
						
						
	// 13. What is the average salary and total salary of the whole organization?
							DoubleSummaryStatistics ds = eList.stream().collect(Collectors.summarizingDouble(Employee::getESalary));
	
							System.out.println("Average salary of the organization: " +ds.getAverage());
							System.out.println("Total salary of the organization: " +ds.getSum());
							System.out.println("Employee count of the organization: " +ds.getCount());

						
	
	// 14. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
							 Map<Boolean, List<Employee>> empList = eList.stream()
									 									.collect(Collectors.partitioningBy(emp -> emp.getEAge() > 25));
							
							 for(Entry<Boolean,List<Employee>> employee : empList.entrySet())
							 {
								 System.out.println(employee);
							 }
							 
							 
	// Who is the oldest employee in the organization? What is his age and which department he belongs to?
							Employee oldestEmp = eList.stream().max(Comparator.comparing(Employee::getEAge)).get();
							System.out.println("Seniormost employee of the organization:" +oldestEmp.getEName());
							
		
		
	// How many male and female employees are there in the organization?
							Map<String, Long> genderCount = eList.stream().collect(Collectors.groupingBy(Employee::getEGender,Collectors.counting()));
							System.out.println(genderCount);
							
							
	//Print the name of all departments in the organization?
								eList.stream().map(Employee::getEDepartment).distinct().forEach(System.out::println);
		
	//  What is the average age of male and female employees?
								Map<String, Double> avgAge = eList.stream().collect(Collectors.groupingBy(Employee::getEGender,Collectors.averagingDouble(Employee::getEAge)));
								System.out.println(avgAge);
								
	// Get the details of highest paid employee in the organization?
								Employee maxSal = eList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getESalary))).get();
								System.out.println("Highest paid Employee in the organisation: "+maxSal.getEName());
								
		
	// Get the names of all employees who have joined after 2015?
								eList.stream().filter(emp -> emp.getYearOfJoining() > 2015).forEach(emp ->System.out.println(emp.getEName()));
								eList.stream().filter(emp -> emp.getYearOfJoining() > 2015).map(Employee::getEName).forEach(System.out::println);
								
	
	// Count the number of employees in each department?
								 Map<String, Long> empCount = eList.stream().collect(Collectors.groupingBy(Employee::getEDepartment,Collectors.counting()));
								 System.out.println(empCount);
								 							eList.stream().collect(Collectors.groupingBy(Employee::getEDepartment,Collectors.counting())).entrySet().forEach(System.out::println);
								 
	
	//  What is the average salary of each department?
											eList.stream().collect(Collectors.groupingBy(Employee::getEDepartment,Collectors.averagingDouble(Employee::getESalary))).entrySet().forEach(System.out::println);
		
	//  Get the details of youngest male employee in the product development department?
											eList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getEAge))).ifPresent(e-> System.out.println(e.getEName()+","+e.getEAge()));
	
	// Who has the most working experience in the organization?
											Employee e = eList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst().get();
											System.out.println(e.getEName()+","+e.getYearOfJoining());
		 
	// How many male and female employees are there in the sales and marketing team?	
												eList.stream().filter(emp -> emp.getEDepartment().equals("HR")).collect(Collectors.groupingBy(Employee::getEGender,Collectors.counting())).entrySet().forEach(System.out::println);
											
	// What is the average salary of male and female employees?
												eList.stream().collect(Collectors.groupingBy(Employee::getEGender,Collectors.averagingDouble(Employee::getESalary))).entrySet().forEach(System.out::println);
		
		
	// List down the names of all employees in each department?
												eList.stream().collect(Collectors.groupingBy(Employee::getEDepartment)).entrySet().forEach(System.out::println);
	
	// What is the average salary and total salary of the whole organization?
												DoubleSummaryStatistics ds = eList.stream().collect(Collectors.summarizingDouble(Employee::getESalary));
																				System.out.println("Total salary of the organization: "+ds.getSum());
																				System.out.println("Average salary of the organization: "+ds.getAverage());
																				System.out.println("Minimum salary of the organization: "+ds.getMin());
																				System.out.println("Maximum salary of the organization: "+ds.getMax());
		
     //  Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
														eList.stream().collect(Collectors.partitioningBy(emp -> emp.getEAge() > 25)).entrySet().forEach(System.out::println);
	*/
	//  Who is the oldest employee in the organization? What is his age and which department he belongs to?
														Employee e = eList.stream().max(Comparator.comparing(Employee::getEAge)).get();
														System.out.println("Oldest Employee in the organization,"+e.getEName()+","+e.getEAge());
	}
}
	
	
