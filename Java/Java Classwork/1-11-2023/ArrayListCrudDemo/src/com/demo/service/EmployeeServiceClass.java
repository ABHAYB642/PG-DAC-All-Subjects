package com.demo.service;

import com.demo.dao.EmployeeDaoIF;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.dao.EmployeeDao;

public class EmployeeServiceClass implements EmployeeServiceIF  {
	private EmployeeDaoIF edao;
	public EmployeeServiceClass() {
		edao=new EmployeeDao();
	}
	@Override
	public boolean addEmp(int ch) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pid");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name");
		String name=sc.nextLine();
		System.out.println("Enter mob");
		String mob=sc.next();
		System.out.println("enter dept");
		String dept=sc.next();
		System.out.println("enter desg");
		String desg=sc.next();
		System.out.println("enter date of joining(dd/MM/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e=null;
		switch(ch) {
		case 1:
			System.out.println("Enter Sal");
			double sal=sc.nextDouble();
			System.out.println("Enter Bonus");
			double bonus=sc.nextDouble();
			e=new SalariedEmp(id,name,mob,dept,ldt,desg,sal,bonus);
		  break;
		case 2:
			System.out.println("Enter Charges");
			sal=sc.nextDouble();
			System.out.println("Enter Hours");
			int hrs=sc.nextInt();
			e=new ContractEmp(id,name,mob,dept,ldt,desg,sal,hrs);
			break;
		case 3:
			System.out.println("Enter Charges");
			sal=sc.nextDouble();
			System.out.println("Enter No of Employees");
			int noEmp=sc.nextInt();
			e=new ContractEmp(id,name,mob,dept,ldt,desg,sal,noEmp);
		  break;
		 default:
			 System.out.println("Please Enter Valid Choice");	
		}
		return edao.save(e);
	}
	@Override
	public List<Employee> displayall() {
		return edao.getall();
		
	}
	@Override
	public boolean delbyid(int id) {
		return edao.removebyid(id);
		
	}
	@Override
	public boolean upsalbyid(int id, double sal) {
		return edao.upsal(id,sal);
	}
	@Override
	public List<Employee> sortbyname() {
		return edao.sortbyname();
	}
	
	@Override
	public List<Employee> sortbysal() {
		return edao.sortbysal();
	}
	@Override
	public List<Employee> sortbydesg() {
		return edao.sortbydesg();
	}
	@Override
	public Employee[] findTopNemp(int n) {
		return edao.findTopNemp(n);
	}
	
	

}
