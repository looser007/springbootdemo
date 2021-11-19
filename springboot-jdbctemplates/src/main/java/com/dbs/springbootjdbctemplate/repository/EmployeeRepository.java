package com.dbs.springbootjdbctemplate.repository;


import java.util.List;
import java.util.Optional;

import com.dbs.springbootjdbctemplate.dto.Employee;

public interface EmployeeRepository {
	public Employee createEmployee(Employee employee);
	public Employee  deleteEmployee(String empId);
	public Employee updateEmployee(String empId,Employee employee);
	public Optional<Employee> getEmployeeeById(String empId);
	public Optional<List<Employee>> getEmployees();

}
