package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDaoIF {

	void save(Employee e);

	List<Employee> findAll();

	boolean deleteId(int id);

	Employee getbyID(int id);

	

	boolean updatesalbyID(int id, double sal);

	List<Employee> sortbyName();

	List<Employee> sortbySal();

	List<Employee> sortbydesg();

	Employee[] findTopNEmployeesBySal(int n);



}
