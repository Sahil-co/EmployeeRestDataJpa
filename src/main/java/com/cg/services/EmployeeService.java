package com.cg.services;

import java.util.List;

import com.cg.entities.Employee;

public interface EmployeeService {

	public List<Employee> addEmployee(Employee e);
	
	public List<Employee> updateEmployee(Employee e);
	
	public List<Employee> deleteEmployee(Integer empId);
	
	public Employee getEmployeeById(Integer empId);
	
	public List<Employee> getAllEmployee();
}
