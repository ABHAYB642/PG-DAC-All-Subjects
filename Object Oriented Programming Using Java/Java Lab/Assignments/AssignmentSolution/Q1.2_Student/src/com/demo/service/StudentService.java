package com.demo.service;
import com.demo.beans.*;

public class StudentService {
	static Student [] sarr;
	static int cnt;
	static {
		sarr=new Student[10];
		int []marks= {12,13,14};
		sarr[cnt]=new Student(12,"abhay",marks);
		sarr[cnt]=new Student(13,"abhayb",marks);
		cnt=2;
	}
	public void addStudent(int id,String sname,int [] m) {
		sarr[cnt]=new Student(id,sname,m);
		cnt++;
	}
	
	
	public void display() {
		for(Student s:sarr) {
			if(s!=null) {
			//s.toString();
			System.out.println("student Details");
			System.out.println("Student id: "+s.getSid());
			System.out.println("Student Name: "+s.getName());
			int [] m=new int[3];
			m=s.getMarks();
			System.out.println("M1 "+m[0]);
			System.out.println("M2 "+m[1]);
			System.out.println("M3 "+m[2]);
			System.out.println();
		}}
		
		
	}
	
}
