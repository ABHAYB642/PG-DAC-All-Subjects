package com.demo.beans;

import java.time.LocalDate;

public class Vendor extends Employee {
	private int no_of_emp;
	private double amount;

	public Vendor() {
		super();
	}

	public Vendor(int id, String name, String mobno, String email, String dept, String desg, LocalDate doj,
			int no_of_emp, double amount) {
		super(id, name, mobno, email, dept, desg, doj);
		this.no_of_emp = no_of_emp;
		this.amount = amount;
	}

	public int getNo_of_emp() {
		return no_of_emp;
	}

	public void setNo_of_emp(int no_of_emp) {
		this.no_of_emp = no_of_emp;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public double CalculateSal() {
		return no_of_emp * amount;
	}

	@Override
	public String toString() {
		return super.toString() + "Vendor [no_of_emp=" + no_of_emp + ", amount=" + amount + ", toString()=" + "]";
	}

}
