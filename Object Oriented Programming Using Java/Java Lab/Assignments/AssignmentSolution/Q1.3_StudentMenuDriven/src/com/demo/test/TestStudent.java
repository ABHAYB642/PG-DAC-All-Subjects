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
						for(Student s1:sarr) {
							if(s1!=null) {
						
							System.out.println(s1);
							}}
						
				break;
			case 3:
				System.out.println("Enter id to search");
				int id=sc.nextInt();
				Student s2 =s.searchbyid(id);
				if(s2!=null)
				{
					System.out.println(s2);
				}
				else {
					System.out.println("Not found");
				}
				break;
			case 4:
				System.out.println("Enter name to search");
				String nm=sc.next();
				Student[] s3 =s.searchbyname(nm);
				if(s3!=null)
				{
					for(Student s1:s3)
					{
						if(s1!=null) {
						System.out.println(s1);
					}}
				}
				else {
					System.out.println("not found");
				}
				break;
			case 5:
				System.out.println("Enter id to calculate gpa");
				id=sc.nextInt();
				float gpa=s.calculategpa(id);
				System.out.println(gpa);
				break;
			case 6:
				sc.close();
				System.out.println("Exited");
				break;
			}
			
		}while(choice!=6);
	}

}
