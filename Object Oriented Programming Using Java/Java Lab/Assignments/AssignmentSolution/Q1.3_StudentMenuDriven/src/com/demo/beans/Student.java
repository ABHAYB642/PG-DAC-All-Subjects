//Write a menu driven program to maintain student information. Modify  Student 
//class created in previous assignment.  Add a member gpa in student class, 
//add a function in student class to return GPA of a student 

package com.demo.beans;

import java.util.Arrays;

public class Student {
	private int sid;
	private String sname;
	private float gpa;
	private int[] marks;
	public Student() {
		super();
	}
	public Student(int sid, String sname, float gpa, int[] marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.gpa = gpa;
		this.marks = marks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", gpa=" + gpa + ", marks=" + Arrays.toString(marks) + "]";
	}
//	public float calculategpa() {
//		float gpa;
//		
//		gpa= gpa=(1/3)*m1+(1/2)*m2+(1/4)*m3;
//
//		return gpa;
//	}
	
	
		 
		
	
	
}
