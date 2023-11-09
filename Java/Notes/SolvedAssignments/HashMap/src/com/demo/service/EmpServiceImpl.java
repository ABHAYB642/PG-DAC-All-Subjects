package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.dao.EmpDao;
import com.demo.dao.EmpDaoImpl;

public class EmpServiceImpl implements EmpService{
	private EmpDao edao;
	public EmpServiceImpl() {
		edao=new EmpDaoImpl();
	}
	@Override
	public void AddNewEmp(int ch) {
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
		System.out.println("Enter Date Of Joining (dd/MM/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e=null;
		if(ch==1) {
			System.out.println("Enter Sal: ");
			Double s=sc.nextDouble();
			System.out.println("Enter Bonus: ");
			Double b=sc.nextDouble();
			e=(new SalariedEmp(pid,nm,mob,em,dept,desg,ldt,s,b));
		}
		else if(ch==2) {
			System.out.println("Enter hrs: ");
			int h=sc.nextInt();
			System.out.println("Enter Charges: ");
			Double c=sc.nextDouble();
			e=new ContractEmp(pid,nm,mob,em,dept,desg,ldt,h,c);
		}
		else if(ch==3) {
			System.out.println("Enter No Employee: ");
			int noe=sc.nextInt();
			System.out.println("Enter Amount: ");
			Double amt=sc.nextDouble();
			e=new ContractEmp(pid,nm,mob,em,dept,desg,ldt,noe,amt);
		}
		edao.save(e);
	}
	@Override
	public Boolean DeleteEmpById(int id) {
		
		return edao.deleteid(id);	
	}
	@Override
	public Employee DisplayById(int id) {
		
		return edao.displaybyid(id);
		
	}
	@Override
	public Collection<Employee> DisplayAll() {
		return edao.getAll();
	}
	@Override
	public Boolean ModifySalbyid(int id, double sal) {
		
		return edao.updateSalById(id,sal);
	}
	@Override
	public Employee[] DisplayNTopEmp(int n) {
		return edao.TopNEmployee(n);
	}
	@Override
	public List<Employee> getBySalary(double sal) {
		return edao.findBySalary(sal);
	}
	
}
