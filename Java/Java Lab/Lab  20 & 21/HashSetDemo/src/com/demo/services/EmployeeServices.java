package com.demo.services;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeServices {

	void addNewEmp(int ch);

	Set<Employee> displayAll();

	Employee displayByID(int id1);

	Set<Employee> sortByName();

	boolean deletebyID(int id3);

	boolean modifySalById(int id5, double sal);

	Set<Employee> sortBySalary();

	Set<Employee> sortByDesg();

	Employee[] getTopMostNEmp(int nn);

}
