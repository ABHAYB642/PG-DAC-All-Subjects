package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService

{
	EmployeeDao ed = new EmployeeDaoImpl();
	@Override
	public void addNewObject() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id :");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name : ");
		String name=sc.nextLine();
		System.out.println("Enter Employee Email : ");
		String email=sc.next();
		
		Employee e = new Employee(id,name,email);
		
		ed.addNewEmp(e);
		
	}
	@Override
	public Employee [] DisplayAllEmployee() 
	{
		return ed.findAllEmp();
	}
	
	
	@Override
	public int displayCount() 
	{
		return ed.findCount();
	}

}







