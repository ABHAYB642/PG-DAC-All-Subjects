package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDaoIF {

	void save(Employee e);

	List<Employee> findAll();

	void deleteId(int id);

	Employee getbyID(int id);



}
