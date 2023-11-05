package com.demo.beans;

import java.time.LocalDate;

abstract public class Employee extends Person{
	private String dept;
	private LocalDate doj;
	private String desg;
	public Employee() {
		super();
	}
	public Employee(int pid, String name, String mob,String dept, LocalDate doj, String desg) {
		super(pid,name,mob);
		this.dept = dept;
		this.doj = doj;
		this.desg = desg;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	@Override
	public String toString() {
		return super.toString()+ "Employee [dept=" + dept + ", doj=" + doj + ", desg=" + desg + "]";
	}
	abstract public double calsal();
	
	
	

}
