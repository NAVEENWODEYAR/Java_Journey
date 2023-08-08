package com.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.modal.Employee;
import com.jwt.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController 
{

	// DI
	@Autowired
	private EmployeeService empService;
	
			/** REST API generation
			 1. Post for sending the data., 
			 http://localhost:5050/emp/insertEmployee */
			@PostMapping("/insertEmployee")
			public Employee insertEmployee(@RequestBody Employee emp)
			{
				return empService.insertEmployee(emp);
			}
			
			// 1.a sending the list object.,
			@PostMapping("/insertEmployees")
			public List<Employee> insertEmployees(@RequestBody List<Employee> emp)
			{
				List<Employee> e1 = empService.insertEmployees(emp);
				return e1;
			}
			
			// 2. Get for receiving the data.,
			// http://localhost:5050/getEmployes
			@GetMapping("/getEmployes")  
			public List<Employee> getEmployee()
			{
				return empService.getEmployees();
			}
			
			// 2.a get the record
			// http://localhost:5050/emp/getEmployee/
			@GetMapping("/getEmployee/{empId}")
			public Employee getEmployee(@PathVariable Integer empId)
			{
				return empService.getEmployee(empId);
			}
			
			// 3. Put for updating the record.,
			@PutMapping("/updateEmployee/{empId}")
			public Employee updateEmployee(@RequestBody Employee emp, @PathVariable Integer empId)
			{
				return empService.updateEmployee(emp, empId);
			}
			
			// 4.Delete for deleting the data.,
			@DeleteMapping("/deleteEmployee/{empId}")
			public String deleteEmployee(@PathVariable Integer empId)
			{
				 empService.deleteEmployee(empId);
				return "Employee with, "+empId+" deleted successfully";
			}
}
