package com.demo.beans;

import java.time.LocalDate;

public  class VendorEmp extends Employee {
	private int noemp;
	private double amt;
	public VendorEmp() {
		super();
	}
	
	public VendorEmp(int pid, String pname, String mobile, String email, String dept, String desg, LocalDate doj,int no,Double amt) {
		super(pid, pname, mobile, email, dept, desg, doj);
		this.noemp=no;
		this.amt=amt;
	}
	public VendorEmp(int id) {
		super(id);
	}
	public int getNoemp() {
		return noemp;
	}

	public void setNoemp(int noemp) {
		this.noemp = noemp;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}
	
	public double calculateSal() {
		return noemp*amt;
	}

	@Override
	public String toString() {
		return super.toString()+"VendorEmp [noemp=" + noemp + ", amt=" + amt + "]";
	}
	
}
