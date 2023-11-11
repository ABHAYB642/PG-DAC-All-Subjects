package com.demo.Beans;

import java.time.LocalDate;
import java.util.Arrays;

public class Student {
private int sid;
private String name;
private LocalDate bdate;
private String degree;
private int marks;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(int sid, String name, LocalDate bdate, String degree, int marks) {
	super();
	this.sid = sid;
	this.name = name;
	this.bdate = bdate;
	this.degree = degree;
	this.marks = marks;
}

public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public LocalDate getBdate() {
	return bdate;
}

public void setBdate(LocalDate bdate) {
	this.bdate = bdate;
}

public String getDegree() {
	return degree;
}

public void setDegree(String degree) {
	this.degree = degree;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

@Override
public String toString() {
	return "Student [sid=" + sid + ", name=" + name + ", bdate=" + bdate + ", degree=" + degree + ", marks="
			+ marks + "]";
} 


}
