package com.demo.beans;

import java.time.LocalDate;
import java.util.Date;

abstract public class Employee extends Person {
	private String dept;
	private String desg;
	private LocalDate doj;

	public Employee() {
		
	}

	public Employee(int pid, String pname, String mobile, String email, String dept, String desg, LocalDate doj) {
		super(pid, pname, mobile, email);
		
		this.dept = dept;
		this.desg = desg;
		this.doj = doj;
	}

	public Employee(int id) {
		super(id);
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	abstract public double calculateSal() ;

	@Override
	public String toString() {
		return super.toString() + " Employee [dept=" + dept + ", desg=" + desg + ", doj=" + doj + "]";
	}

}
