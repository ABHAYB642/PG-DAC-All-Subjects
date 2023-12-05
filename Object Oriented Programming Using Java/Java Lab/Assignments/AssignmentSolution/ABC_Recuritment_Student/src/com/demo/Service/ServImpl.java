package com.demo.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.Beans.Student;
import com.demo.Dao.DaoIf;
import com.demo.Dao.DaoImpl;

public class ServImpl implements ServIf {
	private DaoIf Dao;

	public ServImpl() {
		Dao = new DaoImpl();
	}

	@Override
	public void addStudent() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter Degree");
		String Degree = sc.next();
		System.out.println("Enter Marks");
		int marks = sc.nextInt();
		System.out.println("Enter Birthdate (dd/mm/yyyy)");
		String bd = sc.next();
		LocalDate ldt = LocalDate.parse(bd, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		Student s = new Student(id, name, ldt, Degree, marks);

		System.out.println("enter no of skill");
		int n = sc.nextInt();
		List<String> sk = new ArrayList<>();
		// String[] sk = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter skill " + (i + 1));
			// sk[i] = sc.next();
			String st = sc.next();
			sk.add(st);
		}
		Dao.save(s, sk);
	}

	@Override
	public void getid(int id, String string) {
		Dao.addSkill(id, string);
	}

	@Override
	public void deleteId(int id) {
		Dao.removeID(id);
	}

	@Override
	public void deleteSkillById(int id1, String string1) {
		Dao.deleteskill(id1, string1);
	}

	@Override
	public void dispStudByskil(String string2) {
		Dao.dispstud(string2);

	}

	@Override
	public List<Student> dispStudByDegree(String string3) {
		// TODO Auto-generated method stub
		return Dao.dispStudByDegree(string3);
	}

}
