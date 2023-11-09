package com.demo.dao;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmpDao {

	void save(Employee e);

	Boolean deleteid(int id);

	Employee displaybyid(int id);

	Collection<Employee> getAll();

	Boolean updateSalById(int id, double sal);

	Employee[] TopNEmployee(int n);

	List<Employee> findBySalary(double sal);

}
