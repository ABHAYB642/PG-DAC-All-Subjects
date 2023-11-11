package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmpDao {

	List<Employee> GetAll();

	Employee findbyId(int id2);

	Employee findbyNm(String nm);

	List<Employee> getbyType(int ch);

	List<Employee> getbyD(String s2);

	List<Employee> getbyDept(String s3);

	boolean delete(int id4);

	boolean ModifySal(int id5, double sal);

	Set<Employee> SortSalary();

	List<Employee> sortByName();

}
