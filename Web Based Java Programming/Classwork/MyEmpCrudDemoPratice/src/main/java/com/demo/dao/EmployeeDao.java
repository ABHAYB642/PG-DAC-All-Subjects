package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeDao {

	List<Employee> getAllEmp();

	boolean deleteEmp(int id);

	void addemp(Employee e);

	Employee getById(int id);

	

	void updateemp(Employee e);

}
