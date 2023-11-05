package com.demo.beans;

import java.time.LocalDate;

public class VendorEmp extends Employee{
	private int noEmp;
	private double amt;
	public VendorEmp() {
		super();
	}
	public VendorEmp(int pid, String name, String mob,String dept,LocalDate doj,String desg,int noEmp, double amt) {
		super(pid,name,mob,dept,doj,desg);
		this.noEmp = noEmp;
		this.amt = amt;
	}
	public int getNoEmp() {
		return noEmp;
	}
	public void setNoEmp(int noEmp) {
		this.noEmp = noEmp;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	@Override
	public String toString() {
		return super.toString()+"VendorEmp [noEmp=" + noEmp + ", amt=" + amt + "]";
	}
	@Override
	public double calsal() {
		return noEmp*amt;
	}
	

}
