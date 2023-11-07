package Lab3;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{
	
	private double sal;
	private double bonus;
	
	public SalariedEmployee() {
		super();
		System.out.println("Welcome to Salaried Employee Default Constructor");
	}

	public SalariedEmployee(int pid, String pName, String mobile, String email, String dept, String desg,
			LocalDate doj,double sal, double bonus) {
		super(pid,pName,mobile,email,dept,desg,doj);
		this.sal = sal;
		this.bonus = bonus;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double CalcSalary() {
		return sal + bonus;
	}

	@Override
	public String toString() {
		return super.toString() + "SalariedEmployee [sal=" + sal + ", bonus=" + bonus + "]";
	}
	

}
