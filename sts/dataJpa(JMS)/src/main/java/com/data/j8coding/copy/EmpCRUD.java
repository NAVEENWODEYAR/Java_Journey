package com.data.j8coding.copy;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpCRUD {

	public static void main(String[] args) 
	{
		// List to pass the dummy data to the Employee.,
		List<Employee> eList = List.of(new Employee(25,"Ammie","Female","HR"),
										new Employee(29,"Baily","Male","Testing"),
										new Employee(35,"Cavin","Male","Devops"),
										new Employee(36,"Dane","Male","HR"),
										new Employee(39,"Kane","Male","Devops"),
										new Employee(32,"Dora","Female","Developer"));
		
		/**
		// 1. print all the departments.,
					System.out.println("=====Departments=======");
					eList.stream().map(Employee::geteDept).distinct().forEach(System.out::println);
					
		// 2. print the count of employees in each department.,
					Map<String, Long> empCount = eList.stream().collect(Collectors.groupingBy(Employee::geteDept,Collectors.counting()));
//					System.out.println(empCount);
					System.out.println("=====Employees in each department=======");
					
						for(Map.Entry<String, Long> mp : empCount.entrySet())
						{
							System.out.println(mp.getKey()+":"+mp.getValue());
						}
					
		// 3. find the average age of male & female employees.,
					Map<String, Double> avgAge = eList.stream().collect(Collectors.groupingBy(Employee::geteGender,Collectors.averagingDouble(Employee::geteAge)));
					System.out.println("=====Average age of the Employees=====");
					System.out.println(avgAge);
					
					
	// 4. List of employees working in an department and salary is greater than condition.,
					List<Employee> someEmp = eList.stream().filter(emp -> emp.geteDept().equals("HR") && emp.geteAge() > 35).collect(Collectors.toList());
					System.out.println(someEmp);
					*/
	
	// 5. Employee with highest salary.,
//					Optional<Employee> maxSal = eList.stream().max(Comparator.comparing(Employee::geteAge));
					Employee maxSal = eList.stream().max(Comparator.comparing(Employee::geteAge)).get(); 
//					Employee mxSal = maxSal.get();
					System.out.println(maxSal.geteName());
					System.out.println(maxSal.geteAge());

	}

}
 