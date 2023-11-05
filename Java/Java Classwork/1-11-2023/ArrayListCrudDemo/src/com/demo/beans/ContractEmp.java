package com.demo.beans;

import java.time.LocalDate;

public class ContractEmp extends Employee{
	private double charges;
	private int hrs;
	
	public ContractEmp() {
		super();
	}

	public ContractEmp(int pid, String name, String mob,String dept, LocalDate doj,String desg,double charges, int hrs) {
		super(pid,name,mob,dept,doj,desg);
		this.charges = charges;
		this.hrs = hrs;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	@Override
	public String toString() {
		return super.toString()+"ContractEmp [charges=" + charges + ", hrs=" + hrs + "]";
	}

	@Override
	public double calsal() {
		return charges*hrs;
	}
	
	

}
