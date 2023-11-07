package Lab3;

import java.time.LocalDate;

public class ContractEmployee extends Employee{
	private int hrs;
	private double rate;
	
	
	public ContractEmployee() {
		super();
		
	}

	public ContractEmployee(int pid, String pname, String mobile, String email, String dept, String desg, 
			LocalDate doj,int hrs, double rate) {
		super(pid, pname,mobile,email,dept,desg,doj);
		this.hrs = hrs;
		this.rate = rate;
	}

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public double CalcSalary() {
		return hrs*rate;
	}

	@Override
	public String toString() {
		return super.toString() + "ContractEmployee [hrs=" + hrs + ", rate=" + rate + "]";
	}
	

	
	
	
	

}
