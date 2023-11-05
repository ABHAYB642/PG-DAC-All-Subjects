package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeServiceIF {

	boolean addEmp(int ch);

	List<Employee> displayall();

	boolean delbyid(int id);

	boolean upsalbyid(int id, double sal);

	List<Employee> sortbyname();

	List<Employee> sortbysal();

	List<Employee> sortbydesg();

	Employee[] findTopNemp(int n);
	


}
