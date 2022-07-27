package com.sprintboot.mysql.controller;

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

import com.sprintboot.mysql.entity.Employee;
import com.sprintboot.mysql.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

//	@RequestMapping(value = "/emp", method = RequestMethod.POST)
	@PostMapping("/emp")
	public Employee saveEmployee(@RequestBody Employee emp)
	{
		return employeeService.saveEmployee(emp);
	}
	
	@GetMapping("/emps")
	public List<Employee> getAllEmployees()
	{
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/emp/{fname}")
	public List<Employee> getEmployee(@PathVariable("fname") String fname)
	{
		return employeeService.getEmployees(fname);
	}
	
	@PutMapping("/emp")
	public Employee updateEmployee(@RequestBody Employee emp)
	{
		return employeeService.updateEmployee(emp);
	}
	
	@DeleteMapping("/emp")
	public Employee deleteEmployee(@RequestBody Employee emp)
	{
		return employeeService.deleteEmployee(emp);
	}
	
	@DeleteMapping("/emp/{id}")
	public void deleteEmployee(@PathVariable("id") Integer id)
	{
		employeeService.deleteEmployeeById(id);
	}
	
}
