package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import com.demo.service.EmployeeServiceIF;
import com.demo.beans.Employee;
import com.demo.service.EmployeeServiceClass;
public class TestArrayList {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		EmployeeServiceIF esob = new EmployeeServiceClass(); 
		int choice=0;
		do {
			System.out.println("1. Add new Employee\n2. delete employee by id\n 3. modify salary\n");
			System.out.println("4. Display all\n5. display by id\n 6. sort by salary\n7. sort by name\n8.exit\n choice: ");
			choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("1. salaried\n2.contract\n 3.vendor");
				int ch=sc.nextInt();
				esob.addnewEmp(ch);
				break;
			case 2:
				System.out.println("Enter id to delete");
				int id = sc.nextInt();
				boolean status=esob.deletebyID(id);
				if(status) {
					System.out.println("deleted successfully");
				}
				else {
					System.out.println("not found");
				}
				break;
				
			case 3:
				System.out.println("Enter id to modify salary");
			    id = sc.nextInt();
			    System.out.println("enter salary");
				double sal=sc.nextDouble();
				status=esob.modifySalById(id,sal);
			    if(status) {
					System.out.println("salry modified successfully");
				}
				else {
					System.out.println("not found");
				}
				
				break;
			case 4:
				List<Employee> elist=esob.displayAll();
				if(elist!=null) {
					elist.stream().forEach(System.out::println);
				}
				
				break;
			case 5:
				System.out.println("enetr id for search");
				 id=sc.nextInt();
				Employee e=esob.displaybyID(id);
				if(e!=null) {
					System.out.println(e);
				}
				else
				{
					System.out.println("not found");
				}
				break;
			case 6:
				List<Employee> elst=esob.sortbysal();
				elst.stream().forEach(System.out::println);
				
				break;
			case 7:
				elst=esob.sortbyname();
				elst.stream().forEach(System.out::println);
				break;
			case 8:
				elst=esob.sortbydesg();
				elst.stream().forEach(System.out::println);
				break;
			case 9:
				System.out.println("How many topmost employees based on salary you want?");
				int n=sc.nextInt();
				Employee[] earr=esob.getTopNEmployees(n);
				Stream.of(earr).forEach(System.out::println);
				break;
            case 10:
            	sc.close();
				System.out.println("Thanks,Visit again....");
				break;
            default:
    			System.out.println("wrong choice");
			}
			
			
		}while(choice!=10);
	}

}
