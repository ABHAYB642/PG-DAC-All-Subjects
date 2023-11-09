package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {
    Scanner sc = new Scanner(System.in);
	private StudentDao sdao;
	
	public StudentServiceImpl() {
		sdao=new StudentDaoImpl();
	}

	@Override
	public Student[] displayAll() {
		return sdao.getAll();
	}

	@Override
	public void addNewStudent() {
		System.out.println("Enter id ");
		int id=sc.nextInt();
		System.out.println("Enter name ");
		String nm=sc.next();
		System.out.println("Enter gpa ");
		float gpa=sc.nextFloat();
		int []arr=new int[3];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Marks "+ i + ":");
			arr[i]=sc.nextInt();
		}
		Student s = new Student(id,nm,gpa,arr);
		sdao.addNewstudent(s);
	}

	@Override
	public Student searchbyid(int id) {
		// TODO Auto-generated method stub
		return sdao.searchbyid(id);
	}

	@Override
	public Student[] searchbyname(String nm) {
		return sdao.searchbyname(nm);
	}

	@Override
	public float calculategpa(int id) {
		return sdao.calculategpa(id);
	}

}
