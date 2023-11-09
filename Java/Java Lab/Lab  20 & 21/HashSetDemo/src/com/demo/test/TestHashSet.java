package com.demo.test;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.services.EmployeeServices;
import com.demo.beans.Employee;
import com.demo.services.EmployeeServiceImpl;
public class TestHashSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		EmployeeServices empl=new EmployeeServiceImpl();
		int choice=0;
		
		
		do {
			
			System.out.println("\n1.add new emp\n2.display all\n3.delete emp by id\n4.modify sal by id\n5.sort by name\n6.sort by Salary"
					+ "\n7.display by id \n8.Sort by desg \n9.Get Top N Employee based on Salary\n10.exit");
			System.out.println("enter choice : ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1 :
				  System.out.println("1.salaried Emp\t2.Contracted Emp\t3.Vendor");
				  int ch=sc.nextInt();
				  empl.addNewEmp(ch);
				  System.out.println("Employee added succesfully");
				  break;

			case 2 :
				  Set<Employee>l1=empl.displayAll();
					if(l1 !=null) {
						l1.stream().forEach(System.out::println);
					}
				  break;
				  
			case 3 :
				  System.out.println("Enter id to delete log");
				  int id3=sc.nextInt();
				  boolean status=empl.deletebyID(id3);
				  if(status)
				  {
					  System.out.println("Deleted sucessfully");
				  }
				  else
				  {
					  System.out.println("Id not found");
				  }
				  break;
				  
			case 4 :
				  System.out.println("Enter id and salary to modify");
				  System.out.println("Enter id");
				  int id5=sc.nextInt();
				  System.out.println("Enter salary");
				  double sal=sc.nextDouble();
				  boolean st=empl.modifySalById(id5,sal);
				  if(st)
				  {
					  System.out.println("Modified successfully");
				  }
				  else
				  {
					  System.out.println("Id not found");
				  }
				  break;
				  
			case 5 :
				Set<Employee> l2=empl.sortByName();
				if(l2 !=null) {
					l2.stream().forEach(System.out::println);
				}
				  break;
				  
			case 6 :
				  Set<Employee> l4=empl.sortBySalary();
				  if(l4 !=null) {
						l4.stream().forEach(System.out::println);
					}
				  break;
				  
			case 7 :
				  System.out.println("Enter Id:");
				  int id1=sc.nextInt();
				  Employee e1=empl.displayByID(id1);
				  if(e1!=null)
				  {
					  System.out.println(e1);
				  }
				  break;
				  
			case 8 :
				   Set<Employee> l5= empl.sortByDesg();
				   if(l5!=null)
				   {
					   l5.stream().forEach(System.out::println);
				   }
				   break;
			case 9:
					System.out.println("Enter value of n");
					int nn=sc.nextInt();
					Employee[] l6=empl.getTopMostNEmp(nn);
					if(l6!=null)
					{
						for(Employee e:l6)
						{
							System.out.println(e);
						}
					}
					break;
					
			case 10 :
				  System.out.println("you are exit now..");
				  System.exit(0);
				  break;
			default :
				    System.out.println("you entered wrong choice..");
				    break;
			}
			
		}while(true);
		
		

	}

}
