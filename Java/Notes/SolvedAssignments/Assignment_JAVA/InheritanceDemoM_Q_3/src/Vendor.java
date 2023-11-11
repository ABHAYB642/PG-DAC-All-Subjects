import java.time.LocalDate;

public class Vendor extends Employee 
{
   private int noofemp;
   private double amount;

   public Vendor()
   {
	super();
   }
	
	public Vendor(int pid, String pname, String mobile, String email, String department, String designation, LocalDate doj,
			int noofemp, double amount) {
		super(pid, pname, mobile, email, department, designation, doj);
		this.noofemp = noofemp;
		this.amount = amount;
	}

	public int getNoofemp() {
		return noofemp;
	}

	public void setNoofemp(int noofemp) {
		this.noofemp = noofemp;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public double calculatesal()
	{
		return noofemp * amount;
	}

	@Override
	public String toString() {
		return super.toString() + "Vendor [noofemp=" + noofemp + ", amount=" + amount + "]"+"\n";
	}
	   
   
   
}
