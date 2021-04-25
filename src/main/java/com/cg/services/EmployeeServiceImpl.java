package com.cg.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.EmployeeDao;
import com.cg.entities.Employee;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao empdao;

	@Override
	public List<Employee> addEmployee(Employee e) {
		System.out.println("Inserting an emp");
		
		empdao.saveAndFlush(e);
		
		return empdao.findAll();
	}

	@Override
	public List<Employee> updateEmployee(Employee e) {
		System.out.println("updating emp");
		
		empdao.saveAndFlush(e);
		
		return empdao.findAll();
	}

	@Override
	public List<Employee> deleteEmployee(Integer empId) {
		System.out.println("Delete an emp based on id");
		
		empdao.deleteById(empId);
		
		return empdao.findAll();
	}

	@Override
	public Employee getEmployeeById(Integer empId) {
		System.out.println("Retrieve emp by id");
		
		Optional<Employee> e = empdao.findById(empId);

		return e.get();
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return empdao.findAll();
	}
	
	

}
