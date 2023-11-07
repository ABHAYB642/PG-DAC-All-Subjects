package Lab2;

import java.time.LocalDate;

public class Vendor extends Employee{
	
	private int noOFEmployee;
	private double fixedSalary;
	
	public Vendor() {
		super();
	}

	public Vendor(int pid, String pName, String mobile, String email, String dept, String desg, LocalDate DOJ,
			int noOFEmployee, double fixedSalary) {
		super(pid,pName,mobile,email,dept,desg,DOJ);
		this.noOFEmployee = noOFEmployee;
		this.fixedSalary = fixedSalary;
	}

	public int getNoOFEmployee() {
		return noOFEmployee;
	}

	public void setNoOFEmployee(int noOFEmployee) {
		this.noOFEmployee = noOFEmployee;
	}

	public double getFixedSalary() {
		return fixedSalary;
	}

	public void setFixedSalary(double fixedSalary) {
		this.fixedSalary = fixedSalary;
	}
	
	@Override
	public double CalcSalary() {
		return fixedSalary;
	}

	@Override
	public String toString() {
		return super.toString() + "Vendor [noOFEmployee=" + noOFEmployee + ", fixedSalary=" + fixedSalary + "]";
	}
}
