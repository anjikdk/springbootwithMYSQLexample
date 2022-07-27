package com.sprintboot.mysql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprintboot.mysql.entity.Employee;
import com.sprintboot.mysql.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee emp) {
		
		return employeeRepository.save(emp);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public List<Employee> getEmployees(String fname) {
		
		return employeeRepository.findByFnameStartsWith(fname);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		return employeeRepository.save(emp);
	}

	@Override
	public Employee deleteEmployee(Employee emp) {
		employeeRepository.delete(emp);
		
		return emp;
	}

	@Override
	public void deleteEmployeeById(Integer id) {
		
//		employeeRepository.deleteById(id);
		
		Optional<Employee> emp = employeeRepository.findById(id);
		if(emp.isPresent())
		{
			employeeRepository.delete(emp.get());
		}
		
	}
	
	
	
}
