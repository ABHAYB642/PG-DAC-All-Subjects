package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmp();

	boolean deleteEmp(int id);

	void addemp(Employee e);

	Employee getById(int id);

	void updateemp(Employee e);

}
