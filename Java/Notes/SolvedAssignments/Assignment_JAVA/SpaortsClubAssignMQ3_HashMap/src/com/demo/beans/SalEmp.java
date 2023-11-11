package com.demo.beans;

import java.time.LocalDate;

public class SalEmp extends Employee {
	private double basic_sal;
	private double bonus;

	public SalEmp() {
		super();
	}

	public SalEmp(int id, String name, String mobno, String email, String dept, String desg, LocalDate doj,
			double basic_sal, double bonus) {
		super(id, name, mobno, email, dept, desg, doj);
		this.basic_sal = basic_sal;
		this.bonus = bonus;
	}

	public double getBasic_sal() {
		return basic_sal;
	}

	public void setBasic_sal(double basic_sal) {
		this.basic_sal = basic_sal;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double CalculateSal() {
		return (basic_sal + (basic_sal * 0.10) + (basic_sal * 0.15) - (basic_sal * 0.08));

	}

	public double calculateBonus() {
		return basic_sal * 0.10 + bonus;
	}

	@Override
	public String toString() {
		return super.toString() + "SalEmp [basic_sal=" + basic_sal + ", bonus=" + bonus + ", toString()=" + "]";
	}

}
