package com.demo.service;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmpService {

	void AddNewEmp(int ch);

	Boolean DeleteEmpById(int id);

	Employee DisplayById(int id);

	Collection<Employee> DisplayAll();

	Boolean ModifySalbyid(int id, double sal);

	Employee[] DisplayNTopEmp(int n);

	List<Employee> getBySalary(double sal);

}
