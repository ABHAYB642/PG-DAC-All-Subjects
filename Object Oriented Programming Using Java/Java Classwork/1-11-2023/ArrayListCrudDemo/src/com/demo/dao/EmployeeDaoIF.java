package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDaoIF {

	boolean save(Employee e);

	List<Employee> getall();
	
	public Employee getByid(int id);

	boolean upsal(int id, double sal);

	boolean removebyid(int id);

	List<Employee> sortbyname();

	List<Employee> sortbysal();

	List<Employee> sortbydesg();

	Employee[] findTopNemp(int n);

	



}
