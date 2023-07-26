package com.data.code;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class EmployeeCRUD {

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
	
	
	/**    How many male & female employees are there in the empList?
		int maleEmployees = (int) empList.stream().filter(emp -> emp.getEGender()=="Male").count();
		System.out.println(maleEmployees); 
	
			Map<String,Long> genderCount = empList.stream().collect(Collectors.groupingBy(Employee::getEGender, Collectors.counting()));
			System.out.println(genderCount);
			
		  Print the name of all departments in the organization?
			List<String> dept = empList.stream().map(Employee::getEDept).distinct().collect(Collectors.toList());
			System.out.println(dept);
			
			Long deptCount = empList.stream().map(Employee::getEDept).distinct().count();
			System.out.println(deptCount);
						
		// What is the average age of male and female employees?
		Map<String, Double> averageAge = empList.stream()
										.collect(Collectors.groupingBy(Employee::getEGender, Collectors.averagingDouble(Employee::getESal)));
		System.out.println(averageAge);
						
	  // Get the details of highest paid employee in the organization?
		Employee maxSalary = empList.stream()
							.collect(Collectors.maxBy(Comparator.comparing(Employee::getESal))).get();
		System.out.println("Emp with highest salary details");
		System.out.println("Emp Name= "+maxSalary.getEName());
		System.out.println("Emp Salary= "+maxSalary.getESal() );
						
	 // Get the details of lowest paid employee in the organization?
		Optional<Employee>  minSal = empList.stream()
							.collect(Collectors.minBy(Comparator.comparing(Employee::getESal)));
		
		Employee e = minSal.get();
		System.out.println("Emp with lowest salary.,");
		System.out.println("Emp Name= " +e.getEName());
		System.out.println("Emp Salary= "+e.getESal());
						
						
	// Get the names of all employees who have joined after 2015?
		List<String> eName = empList.stream()
								.filter(e -> e.getYearOfJoining()>=2015).map(Employee::getEName).collect(Collectors.toList());
		
		empList.stream()
		.filter(e -> e.getYearOfJoining()>=2015)
		.map(Employee::getEName)
		.collect(Collectors.toList()).forEach(System.out::println);
						
	//  Count the number of employees in each department?
		Map<String,Long> noEmployees = empList.stream()
										.collect(Collectors.groupingBy(Employee::getEDept, Collectors.counting()));
		for(Map.Entry<String,Long> mp: noEmployees.entrySet()  )
		{
			System.out.println("Department "+mp.getKey() +" ,No of employees "+mp.getValue()); 
		}
		
		//What is the average salary of each department?
		Map<String, Double> avgSal = empList.stream()
									.collect(Collectors.groupingBy(Employee::getEDept, Collectors.averagingDouble(Employee::getESal)));
		
		for(Map.Entry<String, Double> mp :avgSal.entrySet())
		{
			System.out.println(mp.getKey() +" "+mp.getValue());
		} 
						
		// Get the details of youngest male employee in the product development department?
		Employee youngestEmployee = empList.stream()
									.filter(e -> e.getEDept() == "HR" && e.getEGender() == "Male")
									.min(Comparator.comparing(Employee::getEId)).get();
		System.out.println("Name " +youngestEmployee.getEName());
	}
						
	// Who has the most working experience in the organization
		Employee seniorMostEmp = empList.stream()
								.sorted(Comparator.comparing(Employee::getYearOfJoining))
								.findFirst().get();
		System.out.println(seniorMostEmp.getEName());
						
	// How many male and female employees are there in the sales and marketing team?
	Map<String, Long> testingTeam = empList.stream()
			.filter(e -> e.getEDept() == "Testing")
									.collect(Collectors.groupingBy(Employee::getEGender, Collectors.counting()));
	for(Map.Entry<String, Long> mp :testingTeam.entrySet())
	{
		System.out.println(mp.getKey() +" "+mp.getValue());
	}
	
	// What is the average salary of male and female employees?
	Map<String, Double> avgSal = empList.stream()
								.collect(Collectors.groupingBy(Employee::getEGender, Collectors.averagingDouble(Employee::getESal)));
	for(Map.Entry<String, Double> mp :avgSal.entrySet())
	{
		System.out.println(mp.getKey() +" "+mp.getValue());
	}
						
	//  List down the names of all employees in each department?
		Map<String, List<Employee>> empLst = empList.stream()
											.collect(Collectors.groupingBy(Employee::getEDept));
		Set<Entry<String, List<Employee>>> st = empLst.entrySet();
			
		for(Entry<String, List<Employee>> eSet :st)
		{
			System.out.println("*******");
			System.out.println("Employees in "+eSet.getKey());
			System.out.println("*******");
			List<Employee> list = eSet.getValue();
			for(Employee e:list)
			{
				System.out.println(e.getEName());
			}
		}
		
		//  What is the average salary and total salary of the whole organization?
			DoubleSummaryStatistics dSummary = empList.stream()
												.collect(Collectors.summarizingDouble(Employee::getESal));
			System.out.println("Average salary= "+dSummary.getAverage());
			System.out.println("Total salary= "+dSummary.getSum());
						
						
		// Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
		Map<Boolean, List<Employee>> youngerEmp = empList.stream()
													.collect(Collectors.partitioningBy(e -> e.getEId() >= 25));
		System.out.println(youngerEmp);
		Set<Entry<Boolean, List<Employee>>> entryset = youngerEmp.entrySet();
		for(Entry<Boolean, List<Employee>> hm: entryset )
		{
			if(hm.getKey())
			{	
				System.out.println("********");
				System.out.println("Above 25");
			}
			else
			{
				System.out.println("********");
				System.out.println("Below 25");
			}
			List<Employee> lt = hm.getValue();
			for(Employee e: lt)
			{
				System.out.println(e.getEName());
			}
		}*/
		
		// Who is the oldest employee in the organization? What is his age and which department he belongs to?
		Employee oldestEmp = empList.stream()
							.max(Comparator.comparing(Employee::getEId)).get();
							
		System.out.println("Oldest employee "+oldestEmp.getEName());
	}
}






