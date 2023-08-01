package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.modal.Employee;
import com.jwt.repo.EmployeeRepo;
import com.jwt.utility.MailSender;

@Service
public class EmployeeService 
{
	//DI
	@Autowired
	private EmployeeRepo empRepo;
	
	@Autowired
	MailSender mailSender;
	
	// CRUD operations.,
	// 1.insert the data.,
	public Employee insertEmployee(Employee emp)
	{
		Employee e1 = empRepo.save(emp);
				mailSender.sendMail("Regarding the User Registration.,", "Demo mail", emp.getEmpMail());
					
		return e1;
	}
	
	// 2. select the data.,
	public List<Employee> getEmployees()
	{
		return empRepo.findAll();
	}
	
	// 3. Update the record
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
