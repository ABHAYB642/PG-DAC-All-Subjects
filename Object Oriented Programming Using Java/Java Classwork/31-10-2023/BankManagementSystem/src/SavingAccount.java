
import java.time.LocalDate;

public class SavingAccount extends Customer {
  
	private double intrest;

	public SavingAccount() {
		super();
	}

	public SavingAccount(String bname, double minbalence, String branch, String IFSC, String address, String name,
			String mob, String email, LocalDate dateOpen, String addr,double curbal,int pin, double intrest) {
		super(bname, minbalence, branch, IFSC, address, name, mob, email, dateOpen, addr,curbal,pin);
		this.intrest = intrest;
	}

	public double getIntrest() {
		return intrest;
	}

	public void setIntrest(double intrest) {
		this.intrest = intrest;
	}
	

	@Override
	public String toString() {
		return "SavingAccount [intrest=" + intrest + ", toString()=" + super.toString() + "]";
	}
	
	
	 
}
