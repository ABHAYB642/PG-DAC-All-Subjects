package com.demo.beans;

import java.time.LocalDate;

public class Employee extends Person {
	private String Dept;
	private String Desg;
	private LocalDate doj;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String mobno, String email, String dept, String desg, LocalDate doj) {
		super(id, name, mobno, email);
		Dept = dept;
		Desg = desg;
		this.doj = doj;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public String getDesg() {
		return Desg;
	}

	public void setDesg(String desg) {
		Desg = desg;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public double CalculateSal() {
		return 0;
	}

	@Override
	public String toString() {
		return "Employee [" + super.toString() + "Dept=" + Dept + ", Desg=" + Desg + ", doj=" + doj + ", toString()="
				+ "]";
	}

}
