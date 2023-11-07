package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployee {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice=0;
		EmployeeService es = new EmployeeServiceImpl();
		do 
		{
			System.out.println("1.Add new Object \n2.Display All objects\n3.Display Number of objects\n4.Exit");
			choice =sc.nextInt();
			switch(choice)
			{
			case 1:
				es.addNewObject();
				break;
			case 2:
				Employee[] narr=es.DisplayAllEmployee();
				if(narr!=null)
				{
					for(int i=0;i<narr.length;i++)
					{
						if(narr[i]==null)
						{
							break;
						}
						System.out.println(narr[i]);
					}
				}
				else
				{
					System.out.println("Array is empty :");
				}
				
				break;
			case 3:
				int count =es.displayCount();
				System.out.println("Number of objects on heap = "+(++count));
				break;
			case 4:
				System.out.println("Thank You : ");
				break;
				default :
					System.out.println("Wrong choice : ");
			}
		}while(choice!=4);

	}

}
