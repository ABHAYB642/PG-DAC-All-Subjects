package com.demo.services;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Set;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmployee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;


public class EmployeeServiceImpl implements EmployeeServices {

	private EmployeeDao edao;	
	
	public EmployeeServiceImpl()
	{
		edao = new EmployeeDaoImpl();
	}


	@Override
	// to add new employee
	public void addNewEmp(int ch) {
		// TODO Auto-generated method stub
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
		if(ch==1)
		{
			System.out.println("enter salary");
			double s=sc.nextDouble();
			System.out.println("enter bonus");
			double b=sc.nextDouble();
			e=new SalariedEmployee(pid, nm, mob, em, dept, desg, ldt, s, b);
		}
		else if (ch==2) {
			System.out.println("enter Hrs");
			int hrs=sc.nextInt();
			System.out.println("enter charges per hour");
			double charges=sc.nextDouble();
			e=new ContractEmployee(pid, nm, mob, em, dept, desg, ldt, hrs, charges);
		}
		else if(ch==3){
        	System.out.println("enter no. of emp : ");
            int noofemp = sc.nextInt();
            System.out.println("enter amount : ");
            double amount = sc.nextDouble();
            e=new ContractEmployee(pid, nm, mob, em, dept, desg, ldt, noofemp,amount);

		}
		edao.save(e);
		
	}


	// to display all employee object
	@Override
	public Set<Employee> displayAll() 
	{
		return edao.showall();
	}

	// to display on matched employee object
	@Override
	public Employee displayByID(int id1) {
		
		return edao.findById(id1);
	}


	@Override
	public Set<Employee> sortByName() {
		return edao.sortName();
	}


	@Override
	public boolean deletebyID(int id3) {
		return edao.remove(id3);
	}


	@Override
	public boolean modifySalById(int id5, double sal) {
		return edao.modifySal(id5,sal);
	}


	@Override
	public Set<Employee> sortBySalary() {
		return edao.sortSalary();
	}


	@Override
	public Set<Employee> sortByDesg() {
		return edao.sortDesg();
	}


	@Override
	public Employee[] getTopMostNEmp(int nn) {
		return edao.getNEmp(nn);
	}

}
