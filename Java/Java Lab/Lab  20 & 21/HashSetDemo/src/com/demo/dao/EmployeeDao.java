package com.demo.dao;
import java.util.Set;
import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	List<Employee> sortAllName = null;
	boolean modifySal = false;
	List<Employee> sortSalary = null;

	void save(Employee e);

	Set<Employee> showall();

	Employee findById(int id1);

	Set<Employee> sortName();

	boolean remove(int id3);

	boolean modifySal(int id5, double sal);

	Set<Employee> sortSalary();

	Set<Employee> sortDesg();

	Employee[] getNEmp(int nn);

}
