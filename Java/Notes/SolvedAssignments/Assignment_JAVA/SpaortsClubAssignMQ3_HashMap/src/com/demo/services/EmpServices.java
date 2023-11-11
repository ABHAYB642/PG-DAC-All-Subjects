package com.demo.services;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmpServices {

	List<Employee> DisplayAll();

	Employee GetById(int id2);

	Employee GetByName(String nm);

	List<Employee> getbytype(int ch);

	List<Employee> getbyDesg(String s2);

	List<Employee> getbyDept(String s3);

	boolean deletebyid(int id4);

	boolean modifySalById(int id5, double sal);

	Set<Employee> SortBySal();

	List<Employee> sortByName();

}
