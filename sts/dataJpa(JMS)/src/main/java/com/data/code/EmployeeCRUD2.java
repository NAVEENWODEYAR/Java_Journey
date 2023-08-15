package com.data.code;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.apache.commons.codec.binary.Base16;
import org.apache.commons.collections4.comparators.ReverseComparator;

public class EmployeeCRUD2 {

	public static void main(String[] args) 
	{
		// Real Time queries using Java 8
		List<Employee> empList = new ArrayList<>();
						empList.add(new Employee(1, "Ammie", "a@gmail.com", 1345.00, "HR", "Female", 2000));
						empList.add(new Employee(189, "Zoya", "zoya@gmail.com", 845345.00, "Tech", "Female", 2008));
						empList.add(new Employee(25, "Clara", "clara@gmail.com", 2345.00, "Production", "Female", 2010));
						empList.add(new Employee(85, "Bella", "bella@gmail.com", 78445.00, "Tech", "Female", 2020));
						empList.add(new Employee(89, "Nora", "nora@gmail.com", 5845.00, "Receiption", "Female", 2007));
						empList.add(new Employee(58, "Riya", "riya@gmail.com", 98654.00, "Software", "Female", 2015));
						empList.add(new Employee(42, "Mary", "mary@gmail.com", 71245.00, "Testing", "Female", 2017));
						empList.add(new Employee(8, "Julie", "julie@gmail.com", 45825.00, "Testing", "Female", 2012));
						empList.add(new Employee(6, "Roney", "roney@gmail.com",54455.00, "HR", "Female", 2023));
						empList.add(new Employee(9, "Carmel", "carmel@gmail.com", 54321.00, "Production", "Female", 2014));
						empList.add(new Employee(2, "Ramu", "ramu@gmail.com", 8654.00, "Software", "Male", 2016));
						empList.add(new Employee(31, "Manoj", "manoj@gmail.com", 1117245.00, "Testing", "Male", 2019));
						empList.add(new Employee(24, "Rinku", "rinku@gmail.com", 8825.00, "Testing", "Male", 2011));
						empList.add(new Employee(24, "Emanuel", "em@gmail.com", 825.00, "Testing", "Male", 2019));
						empList.add(new Employee(57, "Nag", "nag@gmail.com",54155.00, "HR", "Male", 2013));
						empList.add(new Employee(98, "Candy", "candy@gmail.com", 51.00, "Production", "Male", 2014));
						empList.add(new Employee(14, "Randy", "randy@gmail.com", 15.00, "HR", "Male", 2014));
		
		/**
		// How many male & female employees are there in the empList?
						empList.parallelStream()
								.collect(Collectors.groupingBy(Employee::getEGender,Collectors.counting()))
								.entrySet()
								.forEach(System.out::println);
						
	   // Print the name of all departments in the organization?
							empList.parallelStream()
									.map(de->de.getEDept())
									.distinct()
									.forEach(System.out::println);
									
							System.out.println("*****************");
							
							empList.parallelStream()
									.map(Employee::getEDept)
									.distinct()
									.forEachOrdered(System.out::println);
			
	  // What is the average age of male and female employees?
								empList.parallelStream()
										.collect(Collectors.groupingBy(Employee::getEGender,Collectors.averagingDouble(Employee::getESal)))
										.entrySet()
										.forEach(System.out::println);
								
	// Get the details of highest paid employee in the organization?
				Employee employee = empList.parallelStream()
											.collect(Collectors.maxBy(Comparator.comparing(Employee::getESal))).get();

										System.out.println(employee.getEName()+":"+employee.getESal());
	
    //  Get the details of lowest paid employee in the organization?	
				Employee e1 = empList.parallelStream()
											.collect(Collectors.minBy(Comparator.comparing(Employee::getESal))).get();
										System.out.println(e1.getEName()+":"+e1.getESal());
	
	// Get the names of all employees who have joined after 2015?
							empList.parallelStream()
									.filter(e -> e.getYearOfJoining() > 2015)
									.map(Employee::getEName)
									.forEach(System.out::println);
						
	// Count the number of employees in each department?
							empList.parallelStream()
									.collect(Collectors.groupingBy(Employee::getEDept,Collectors.counting()))
									.entrySet()
									.forEach(System.out::println);
							
	// What is the average salary of each department?
							empList.parallelStream()
									.collect(Collectors.groupingBy(Employee::getEDept,Collectors.averagingDouble(Employee::getESal)))
									.entrySet()
									.forEach(System.out::println);
	
						
	// Get the details of youngest male employee in the product development department?
							Optional<Employee> min = empList.parallelStream()
									.filter(emp -> emp.getEGender().equalsIgnoreCase("Male"))
									.min(Comparator.comparing(Employee::getEId));
							System.out.println(min.get().getEName()+":"+min.get().getEId());
	*/						
   // Who has the most working experience in the organization	
							Employee e2 = empList.parallelStream()
												   .min(Comparator.comparing(Employee::getYearOfJoining)).get();
							System.out.println(e2.getEName()+":"+e2.getYearOfJoining());
	
											empList.stream()
													.sorted(Comparator.comparing(Employee::getYearOfJoining))
													.findFirst()
													.ifPresent(System.out::println);
	}
}






