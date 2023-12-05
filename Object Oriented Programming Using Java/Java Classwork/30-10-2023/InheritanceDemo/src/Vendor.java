import java.time.LocalDate;

public class Vendor extends Employee{
	private int noOfEmp;
	private double amt;
	public Vendor() {
		super();
	}
	public Vendor(int pid, String pname, String mobile, String email,String dept, String desg, LocalDate doj,int noOfEmp, double amt) {
		super(pid,pname,mobile,email,dept,desg,doj);
		this.noOfEmp = noOfEmp;
		this.amt = amt;
	}
	public int getNoOfEmp() {
		return noOfEmp;
	}
	public void setNoOfEmp(int noOfEmp) {
		this.noOfEmp = noOfEmp;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	@Override
	public String toString() {
		return super.toString()+"Vendor [noOfEmp=" + noOfEmp + ", amt=" + amt + "]";
	}
	
	public double calculateSal() {
		return noOfEmp * amt;
	}
	
	
}
