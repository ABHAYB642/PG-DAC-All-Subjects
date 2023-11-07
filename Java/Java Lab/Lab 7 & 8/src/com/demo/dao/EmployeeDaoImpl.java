package com.demo.dao;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao
{
	static Employee[] earr;
	static int count;
	{
		earr = new Employee[100];
		earr[0]=new Employee(1,"prathamesh Nale","prathamesh@gmail.com");
		earr[1]=new Employee(2,"Rushikesh Mhetre","rushi@gmail.com");
		earr[2]=new Employee(3,"Arjun Jagtap","arjun@gmail.com");
		count=2;
	}

	@Override
	public void addNewEmp(Employee e) 
	{
		earr[++count]=e;
	}

	@Override
	public Employee[] findAllEmp() 
	{
		if(earr!=null)
		{
			return earr;
		}else
		{
			return null;
		}
	}

	@Override
	public int findCount() 
	{
		return count;
	}

}
