package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Employee;

@Repository("empDao")
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
