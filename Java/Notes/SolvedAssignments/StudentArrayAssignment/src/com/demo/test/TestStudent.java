package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.service.*;
public class TestStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice=0;
		StudentService s=new StudentServiceImpl();
		do {
			System.out.println("1.Add New Student \n2.Display All Student \n3.Search By id \n4.Search by Name \n");
			System.out.println("5.Calculate gpa of student \n6.Exit \n Choice :");
			
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				    s.addNewStudent();
				break;
			case 2:
					Student[] sarr=s.displayAll();
					if(sarr!=null)
						{
						for(Student s1:sarr)
							System.out.println(s1);
						}
						
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			}
			
		}while(choice!=6);
	}

}
