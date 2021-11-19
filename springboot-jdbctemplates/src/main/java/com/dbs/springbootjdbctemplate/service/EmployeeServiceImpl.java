package com.dbs.springbootjdbctemplate.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dbs.springbootjdbctemplate.dto.Employee;
import com.dbs.springbootjdbctemplate.repository.EmployeeRepository;
@Component
@Scope()
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
	EmployeeRepository employeeRepository;
	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.createEmployee(employee);
	}

	@Override
	public Employee deleteEmployee(String empId) {
		// TODO Auto-generated method stub
		return employeeRepository.deleteEmployee(empId);
	}

	@Override
	public Employee updateEmployee(String empId, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> getEmployeeeById(String empId) {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployeeeById(empId);
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.getEmployees();
	 
	}

}
