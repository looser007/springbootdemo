package com.dbs.springbootjdbctemplate.repository;



import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



import com.dbs.springbootjdbctemplate.dto.Employee;
import com.dbs.springbootjdbctemplate.mapper.EmployeeRowMapper;
@Repository



public class EmployeeRepositoryImpl implements EmployeeRepository {



@Autowired
JdbcTemplate jdbcTemplate;
@Override
public Employee createEmployee(Employee employee) {
// TODO Auto-generated method stub
String insertStatement="insert into employee(empId,empFirstName,empLastName,address,empsalary)"
+"values(?,?,?,?,?)";
int result=jdbcTemplate.update(insertStatement,
		employee.getEmpId(),
		employee.getEmpFirstName(),
		employee.getEmpLastName(),
		employee.getAddress(),
		employee.getEmpSalary());

if(result>0)
return employee;
else
return null;
}

@Override
public Employee  deleteEmployee(String empId) {
// TODO Auto-generated method stub
	String delstatement="delete from employee where empId=?";
    jdbcTemplate.update(delstatement,empId);	
return null;
}



@Override
public Employee updateEmployee(String empId, Employee employee) {
// TODO Auto-generated method stub
	
return null;
}



@Override
public Optional<Employee> getEmployeeeById(String empId) {
// TODO Auto-generated method stub
	try {
	String query="select * from employee where empid=?";
	Employee employee=jdbcTemplate.queryForObject(query,new EmployeeRowMapper(),empId);
	System.out.println(employee);
   if(employee!=null) {
	  return Optional.of(employee);
   }
   else {
	   return Optional.empty();
   }
	}catch(DataAccessException e) {
		
	}
	return Optional.empty();
 
}



@Override
public Optional<List<Employee>> getEmployees() {
// TODO Auto-generated method stub
	String query="select * from employee";
	List<Employee> list=jdbcTemplate.query(query,new EmployeeRowMapper());
	System.out.println(list);
  if(list!=null) {
	  return Optional.of(list);
   }
   else {
	   return Optional.empty();
   }	
	
}

}

