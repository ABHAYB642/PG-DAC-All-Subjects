package com.demo.dao;

import com.demo.beans.Employee;
import com.demo.beans.SalariedEmployee;

public class EmployeeDaoImpl implements EmployeeDao
{
	static Employee [] earr;
	static int cnt;
	{
		 cnt=0;
		 earr=new Employee[100];
		 earr[0]=new SalariedEmployee(20000,2.30,"hr","manager",1,"Prathamesh","prathamesh@gmail.com");
		 earr[1]=new SalariedEmployee(20000,2.30,"hr","manager",2,"Rushikesh","Rushikesh@gmail.com");
		 earr[2]=new SalariedEmployee(20000,2.30,"hr","manager",3,"Saurabh","Saurabh@gmail.com");
		 cnt=2;
	}

	@Override
	public void addNew(Employee e) 
	{
		earr[++cnt]=e;
	}

	@Override
	public Employee[] findAllObjects() 
	{
		return earr;
	}
	
	

}
