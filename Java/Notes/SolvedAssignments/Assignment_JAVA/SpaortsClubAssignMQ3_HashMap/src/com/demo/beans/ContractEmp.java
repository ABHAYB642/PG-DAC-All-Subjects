package com.demo.beans;

import java.time.LocalDate;

public class ContractEmp extends Employee {
	private int no_of_hrs;
	private double charges;

	public ContractEmp() {
		super();
	}

	public ContractEmp(int id, String name, String mobno, String email, String dept, String desg, LocalDate doj,
			int no_of_hrs, double charges) {
		super(id, name, mobno, email, dept, desg, doj);
		this.no_of_hrs = no_of_hrs;
		this.charges = charges;
	}

	public int getNo_of_hrs() {
		return no_of_hrs;
	}

	public void setNo_of_hrs(int no_of_hrs) {
		this.no_of_hrs = no_of_hrs;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	public double CalculateSal() {
		// TODO Auto-generated method stub
		return no_of_hrs * charges;
	}

	@Override
	public String toString() {
		return super.toString() + "ContractEmp [no_of_hrs=" + no_of_hrs + ", charges=" + charges + ", toString()="
				+ "]";
	}

}
