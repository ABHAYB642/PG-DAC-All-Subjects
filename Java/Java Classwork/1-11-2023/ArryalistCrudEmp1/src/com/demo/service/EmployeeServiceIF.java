package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;



public interface EmployeeServiceIF {

	void addnewEmp(int ch);

	List<Employee> displayAll();

	void deletebyID(int id);

	Employee displaybyID(int id);







}
