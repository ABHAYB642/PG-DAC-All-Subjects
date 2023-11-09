package com.demo.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

import com.demo.beans.Employee;
import com.demo.service.*;


public class TestHashMap {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice =0;
		EmpService es=new EmpServiceImpl();
		do {
			System.out.println("1. Add new Employee\n2. delete employee by id\n 3. modify salary");
			System.out.println("4. Display all\n5. display by id\n 6. sort by salary\n7. sort by id");
			System.out.println("8. Display n topmost based on salary \n 9.Display all employees with sal > given salary\n10.exit\n choice:");
			choice=sc.nextInt();
			switch(choice) {
				case 1:
				    System.out.println("1.Salaried\n 2.Contract\n 3.Vendor\n");
				    int ch=sc.nextInt();
				    es.AddNewEmp(ch);
					break;
				case 2:
					System.out.println("Enter id for delete: ");
					int id=sc.nextInt();
					Boolean status=es.DeleteEmpById(id);
					break;
				case 3:
					System.out.println("Enter id: ");
					id=sc.nextInt();
					System.out.println("Enter sal: ");
					double sal=sc.nextDouble();
					status=es.ModifySalbyid(id,sal);
					if(status) {
						System.out.println("Sal Modified.");
					}
					else {
						System.out.println("OOPS!!! Invalid id....");
					}
					break;
				case 4:
					Collection<Employee>eset=es.DisplayAll();
					if(eset!=null) {
						eset.stream().forEach(System.out::println);
					}
					break;
				case 5:
					System.out.println("Enter Id: ");
					id=sc.nextInt();
					Employee e=es.DisplayById(id);
					if(e!=null) {
						System.out.println(e);
					}
					else {
						System.out.println("Invalid id");
					}
					break;
				case 6:
					List<Employee> elst=sortBySal();
				
					break;
				case 7:
					break;
				case 8:
					System.out.println("Select how many top most employees you want");
					int n=sc.nextInt();
					Employee[] earr=es.DisplayNTopEmp(n);
					Stream.of(earr).forEach(System.out::println);
					break;
				case 9:
					System.out.println("Enter Salary To Search");
					sal=sc.nextDouble();
					List<Employee> elst=es.getBySalary(sal);
					if(elst!=null) {
						elst.stream().forEach(System.out::println);
					} else {
						System.out.println("Not Found");
					}
					break;
				case 10:
					System.out.println("Thank You FOr Visiting!!");
					break;
				default:
					System.out.println("Invalid Choice");
			}
			
		}while(choice!=10);
	}
}
