package com.cg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.Employee;
import com.cg.services.EmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("An API for CRUD Operations")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@GetMapping("/find")
	@ApiOperation(value="fetches all the employee rows from db.....!!!")
	public List<Employee> getAllEmp(){
		System.out.println("In empController to retrieve all emp");
		
		return empService.getAllEmployee();
	}
	
	@GetMapping("/find/{eid}")
	public Employee getEmpById(@PathVariable Integer eid){
		System.out.println("In empController to retrieve an emp by id");
		
		return empService.getEmployeeById(eid);
	}
	
	@DeleteMapping("/delete/{eid}")
	public List<Employee> deleteEmp(@PathVariable Integer eid){
		System.out.println("In empController to delete an emp by id");
		
		return empService.deleteEmployee(eid);
	}
	
	@PostMapping(value="/insert", consumes=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> insertEmp(@RequestBody Employee e){
		System.out.println("Insert an emp");
		
		return empService.addEmployee(e);
	}
	
	@PutMapping("/update")
	public List<Employee> updateEmp(Employee e){
		System.out.println("Update an emp");
		
		return empService.updateEmployee(e);
	}
}
