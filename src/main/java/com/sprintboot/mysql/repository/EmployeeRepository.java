package com.sprintboot.mysql.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sprintboot.mysql.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{


	public List<Employee> findByFnameStartsWith(String fname);
}
