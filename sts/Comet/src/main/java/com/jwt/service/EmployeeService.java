package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.modal.Employee;
import com.jwt.repo.EmployeeRepo;

@Service
public class EmployeeService 
{
	//DI
	@Autowired
	private EmployeeRepo empRepo;
	
	// CRUD operations.,
	// 1.insert the data.,
	public Employee insertEmployee(Employee emp)
	{
		return empRepo.save(emp);
	}
	
	// 2. select the data.,
	public List<Employee> getEmployees()
	{
		return empRepo.findAll();
	}
	
	// 3. updatae the record
	public Employee updateEmployee(Employee emp, Integer empId)
	{
		Employee e = empRepo.findById(empId).get();
				e.setEmpName(emp.getEmpName());
				e.setEmpMail(emp.getEmpMail());
				e.setEmpSal(emp.getEmpSal());
				return empRepo.save(e);
	}
	
	// 4. delete the record
	public String deleteEmployee(Integer empId)
	{
		empRepo.deleteById(empId);
		return "";
	}
}
