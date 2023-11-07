package com.demo.dao;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void addNewEmp(Employee e);

	Employee[] findAllEmp();

	int findCount();

}
