package com.dbs.springbootjdbctemplate;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dbs.springbootjdbctemplate.dto.Employee;
import com.dbs.springbootjdbctemplate.service.EmployeeService;

@SpringBootApplication
public class SpringbootJdbctemplatesApplication {

	public static void main(String[] args) {
	ApplicationContext applicationContext=	SpringApplication.run(SpringbootJdbctemplatesApplication.class, args);
	DataSource dataSource=applicationContext.getBean(DataSource.class);
	System.out.println(dataSource!=null);
	EmployeeService employeeService=applicationContext.getBean(EmployeeService.class);
	Employee employee=new Employee("gmk01","malakondaiah","gurram","vij",71000);
	Employee employee2=employeeService.createEmployee(employee);
	System.out.println(employee2);
	
	}

}
