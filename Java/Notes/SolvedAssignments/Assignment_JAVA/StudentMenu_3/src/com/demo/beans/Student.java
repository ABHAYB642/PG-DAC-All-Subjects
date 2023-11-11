package com.demo.beans;

public class Student {


	private int studid;
	private String studname;
	private int m1,m2,m3;	
	
	
	public Student() {
		super();
	}

	public Student(int studid, String studname, int m1, int m2, int m3) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}
	
	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}
	
	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}
	
		//using tostring method 
		@Override
		public String toString() {
			return "Student Details : \n--------------- \nstudid=" + studid + "\nstudname=" + studname + "\nm1=" + m1 + "\nm2=" + m2 + "\nm3="
					+ m3 + "\n";
		}
		
		public double calculateGPA()
		{
		  return (m1+m2+m3)/3;
		}
}
