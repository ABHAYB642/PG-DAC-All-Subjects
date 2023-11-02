package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.beans.Vendor;
import com.demo.dao.EmployeeDaoClass;
import com.demo.dao.EmployeeDaoIF;

public class EmployeeServiceClass implements EmployeeServiceIF {

	private EmployeeDaoIF edao;

	public EmployeeServiceClass() {
		super();
		edao=new EmployeeDaoClass();
	}

	@Override
	public void addnewEmp(int ch) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter mobile");
		String mob=sc.next();
		System.out.println("enter email");
		String em=sc.next();
		System.out.println("enter dept");
		String dept=sc.next();
		System.out.println("enter desg");
		String desg=sc.next();
		System.out.println("enter date of joining(dd/MM/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e=null;
		if(ch==1) {
			System.out.println("enter salary");
			double s=sc.nextDouble();
			System.out.println("enter bonus");
			double b=sc.nextDouble();
			e=new SalariedEmp(pid, nm, mob, em, dept, desg, ldt, s, b);
		}
		else if (ch==2) {
			System.out.println("enter Hrs");
			int hrs=sc.nextInt();
			System.out.println("enter charges per hour");
			double charges=sc.nextDouble();
			e=new ContractEmployee(pid, nm, mob, em, dept, desg, ldt, hrs, charges);
		}
		else if(ch==3){
			//vendor details
			System.out.println("Enter no of employees");
			int num=sc.nextInt();
			System.out.println("Enter amount");
			double amt=sc.nextDouble();
			e=new Vendor(pid, nm, mob, em, dept, desg, ldt,num,amt);
		}
		edao.save(e);
	}

	@Override
	public List<Employee> displayAll() {
		// TODO Auto-generated method stub
		return edao.findAll();
	}

	@Override
	public void deletebyID(int id) {
		edao.deleteId(id);
		
	}

	@Override
	public Employee displaybyID(int id) {
		// TODO Auto-generated method stub
		return edao.getbyID(id);
	}

	

	
	
	
}
