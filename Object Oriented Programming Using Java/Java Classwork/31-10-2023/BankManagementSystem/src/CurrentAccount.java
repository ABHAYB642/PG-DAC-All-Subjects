
import java.time.LocalDate;

public class CurrentAccount extends Customer {
	
	private double creditcash;
	
	public CurrentAccount() {
		super();
	}

	
	public CurrentAccount(String bname, double minbalence, String branch, String IFSC, String address, String name,
			String mob, String email, LocalDate dateOpen, String addr,double curbal,int pin, double creditcash) {
		super(bname, minbalence, branch, IFSC, address, name, mob, email, dateOpen, addr,curbal,pin);
		this.creditcash = creditcash;
	}

	

	public double getCreditcash() {
		return creditcash;
	}


	public void setCreditcash(double creditcash) {
		this.creditcash = creditcash;
	}



	@Override
	public String toString() {
		return "CurrentAccount [creditcash=" + creditcash + ", toString()=" + super.toString() + "]";
	}


	
}
