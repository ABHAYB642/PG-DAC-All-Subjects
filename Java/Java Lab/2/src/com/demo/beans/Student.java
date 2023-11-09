package com.demo.beans;

import java.util.Arrays;

public class Student {
  private int sid;
  private String name;
  private int[] marks;
public Student() {
	super();
}
public Student(int sid, String name, int[] marks) {
	super();
	this.sid = sid;
	this.name = name;
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
public int[] getMarks() {
	return marks;
}
public void setMarks(int[] marks) {
	this.marks = marks;
}
//@Override
//public String toString() {
//	return "Student [sid=" + sid + ", name=" + name + ", marks=" + Arrays.toString(marks) + "]";
//}

@Override
public String toString() {
	return "Student Details\nsid=" + sid + "\n, name=" + name + "\n,M1=" + marks[0]+"\n"+"M2=" + marks[1]+"\n"+"M2=" + marks[2]+"\n"+ "]";
}

  
  
}
