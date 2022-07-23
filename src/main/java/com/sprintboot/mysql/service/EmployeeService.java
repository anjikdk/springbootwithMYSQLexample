package com.sprintboot.mysql.service;

import java.util.List;

import com.sprintboot.mysql.entity.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee emp);
	
	public List<Employee> getAllEmployees();
	
	public List<Employee> getEmployees(String fname);
}
