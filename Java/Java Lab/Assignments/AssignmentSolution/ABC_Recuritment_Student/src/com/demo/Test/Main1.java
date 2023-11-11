package com.demo.Test;

import java.util.List;
import java.util.Scanner;

import com.demo.Beans.Student;
import com.demo.Service.ServIf;
import com.demo.Service.ServImpl;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ServIf sf = new ServImpl();
		int choice = 0;
		do {
			System.out.println("1. add new student \n" + "2. add new skill for a student \n" + "3. delete student \n"
					+ "4. delete skill for a student \n"
					+ "5. display all students with given skill(accept skill from user) \n"
					+ "6. display all students with given degree(accept degree from user \n"
					+ "7. exit \n Your Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				sf.addStudent();
				break;
			case 2:
				System.out.println("Enter ID");
				int id = sc.nextInt();
				System.out.println("Enter Skill");
				String string = sc.next();
				sf.getid(id, string);
				break;
			case 3:
				System.out.println("Enter ID for deletion");
				id = sc.nextInt();
				sf.deleteId(id);
				break;

			case 4:
				System.out.println("Enter ID");
				int id1 = sc.nextInt();
				System.out.println("Enter Skill");
				String string1 = sc.next();
				sf.deleteSkillById(id1, string1);
				break;

			case 5:
				System.out.println("Enter Skill");
				String string2 = sc.next();
				sf.dispStudByskil(string2);
				break;

			case 6:
				System.out.println("Enter Degree");
				String string3 = sc.next();
				List<Student> ll = sf.dispStudByDegree(string3);
				ll.stream().forEach(System.out::println);
				break;

			case 7:
				System.out.println("you are exit now..");
				System.exit(0);
				break;

			default:
				break;
			}
		} while (choice != 7);

	}

	private static List<Student> dispStudByskil(String string2) {
		// TODO Auto-generated method stub
		return null;
	}

	private static List<Student> dispAllStudBySkill(String string2) {
		// TODO Auto-generated method stub
		return null;
	}
}
