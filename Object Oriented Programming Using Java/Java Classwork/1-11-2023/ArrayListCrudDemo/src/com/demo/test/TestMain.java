package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeServiceClass;
import com.demo.service.EmployeeServiceIF;

public class TestMain {

	public static void main(String[] args) {
		EmployeeServiceIF eif=new EmployeeServiceClass();
		Scanner sc=new Scanner(System.in);
		
		int choice=0;
		do {
			System.out.println("1.Add Employee");
			System.out.println("2.Display All");
			System.out.println("3.Delete by ID");
			System.out.println("4.Update Sal By ID");
			System.out.println("5.Sort By Name");
			System.out.println("6.Sort By Salary");
			System.out.println("7.Sort By Designation");
			System.out.println("8.Top N Employees");
			System.out.println("9.                ");
			System.out.println("10.Exit");
			choice=sc.nextInt(); 
			switch(choice) {
			case 1:
		        System.out.println();
				System.out.println("1.Add Salaried Emp");
				System.out.println("2.Add Contract Emp");
				System.out.println("3.Add Vendor Emp");
				System.out.println("Enter Choice:");
				int ch=sc.nextInt();
				boolean status=eif.addEmp(ch);
				if(status) {
					System.out.println("Employee Added Successfully");
				}
				else {
					System.out.println("Employee Addition Unsuccessfull");
				}
				break;
			case 2:
				List<Employee>elst=eif.displayall();
				for(Employee e:elst) {
					System.out.println(e);
				}
				break;
			case 3:
				System.out.println("Enter ID");
				int id=sc.nextInt();
				status=eif.delbyid(id);
				if(status) {
					System.out.println("Employee Deleted Successfully");
				}
				else {
					System.out.println("Employee Deletion Unsuccessfull.");
				}
				break;
			case 4:
				System.out.println("Enter ID");
				id=sc.nextInt();
				System.out.println("Enter Salary");
				double sal=sc.nextDouble();
				status=eif.upsalbyid(id,sal);
				if(status) {
					System.out.println("Salary Modified Successfully");
				}
				else {
					System.out.println("Salary Modification Unsuccessfull.");
				}
				break;
			case 5:
				List<Employee>sortedelstbyname=eif.sortbyname();
				for(Employee e:sortedelstbyname) {
					System.out.println(e);
				}
				//elst.stream().forEach(System.out::println);
				break;
			case 6:
				List<Employee>sortedelstbysal=eif.sortbysal();
				for(Employee e:sortedelstbysal) {
					System.out.println(e);
				}
				break;
			case 7:
				List<Employee>sortedelstbyDesg=eif.sortbydesg();
				for(Employee e:sortedelstbyDesg) {
					System.out.println(e);
				}
				break;
			case 8:
				System.out.println("Enter Top Number Of Employees to Display");
				int n=sc.nextInt();
				Employee[]TopNEmployees=eif.findTopNemp(n);
				for(Employee e:TopNEmployees) {
					System.out.println(e);
				}
				break;
			case 9:
				break;
			case 10:
				sc.close();
				System.out.println("Thankyou For Visting");
				System.exit(0);
				break;
			default:
				System.out.println("Enter From choice");
			}
		}while(choice!=10);

	}

}
