package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;



public interface EmployeeServiceIF {

	void addnewEmp(int ch);

	List<Employee> displayAll();

	boolean deletebyID(int id);

	Employee displaybyID(int id);

	boolean modifySalById(int id, double sal);

	List<Employee> sortbyname();

	List<Employee> sortbysal();

	List<Employee> sortbydesg();

	Employee[] getTopNEmployees(int n);

	







}
