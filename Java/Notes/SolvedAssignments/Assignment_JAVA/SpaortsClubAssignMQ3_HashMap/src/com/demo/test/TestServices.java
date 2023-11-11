package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.services.EmpServices;
import com.demo.services.EmpServicesImpl;

public class TestServices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpServices emp = new EmpServicesImpl();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println(" 1. Display All employees\n" + "2. Search by id\n" + "3. Search by name\r\n"
					+ "4. Display all employee by type \r\n"
					+ "5. calculate salary and display for all emplyees with particular designation\r\n"
					+ "6. accept department from user and display 5 employees of that department. \r\n" + "7. Exit\n"
					+ "8.Delete By Id\n" + "9.Modify By Sal\n" + "10.Sort by Sal" + "11.sort by name");
			System.out.println("Enter Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				List<Employee> eList = emp.DisplayAll();
				if (eList != null) {
					for (Employee e : eList) {
						System.out.println(e);
					}
				}
				break;
			case 2:
				System.out.println("Enter id");
				int id2 = sc.nextInt();
				Employee e = emp.GetById(id2);
				if (e != null) {
					System.out.println(e);
				} else {
					System.out.println("Not Found");
				}
				break;

			case 3:
				System.out.println("Enter name : ");
				String nm = sc.next();
				Employee e1 = emp.GetByName(nm);
				if (e1 != null) {
					System.out.println(e1);
				} else {
					System.out.println("Not Found");
				}
				break;
			case 4:
				System.out.println("Enter Choice[1.Salaried Emp 2.Contract Emp 3. Vendor]");
				int ch = sc.nextInt();
				if (!(ch >= 1 && ch <= 3)) {
					System.out.println("you entered wrong choice");
					break;
				}
				List<Employee> l2 = emp.getbytype(ch);
				if (l2 != null) {
					for (Employee m : l2) {
						System.out.println(m);
					}
				} else {
					System.out.println("Not found");
				}
				break;
			case 5:
				System.out.println("Enter Designation");
				String s2 = sc.next();
				List<Employee> l4 = emp.getbyDesg(s2);
				for (Employee i : l4) {

					System.out.println(i + " Total Salary" + i.CalculateSal());
				}
				break;

			case 6:
				System.out.println("Enter Department");
				String s3 = sc.next();
				List<Employee> l5 = emp.getbyDept(s3);
				int count = 0;
				for (int i = 0; i < l5.size(); i++) {
					System.out.println(l5.get(i));
					count++;
					if (count == 5) {
						break;
					}
				}
				break;

			case 7:
				System.out.println("Thank you for visitng..!");
				System.exit(0);
				break;
			case 8:
				System.out.println("Enter id");
				int id4 = sc.nextInt();
				boolean status = emp.deletebyid(id4);
				if (status) {
					System.out.println("Deleted sucessfully");
				} else {
					System.out.println("Not found Emp");
				}
				break;
			case 9:
				System.out.println("Enter id for salary ");
				int id5 = sc.nextInt();
				System.out.println("Enter salary");
				double sal = sc.nextDouble();
				boolean st1 = emp.modifySalById(id5, sal);
				if (st1) {
					System.out.println("Modify Successfully");
				} else {
					System.out.println("Id not found");
				}
			case 10:
				System.out.println("Sort By Salary");
				Set<Employee> hs = emp.SortBySal();
				hs.stream().forEach(System.out::println);
			case 11:
				System.out.println("sort by name");
				List<Employee> li = emp.sortByName();
				li.stream().forEach(System.out::println);
				break;

			default:
				System.out.println("Wrong Choice");
				break;
			}
		} while (true);

	}

}
