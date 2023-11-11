
public class Member extends Person 
{
   private String typeofmembership;
   private double amount;
		
	   public Member()
	   {
	     super();
	   }

	public Member(int pid, String pname, String mobile, String email, String typeofmembership, double amount) {
		super(pid, pname, mobile, email);
		this.typeofmembership = typeofmembership;
		this.amount = amount;
	}

	public String getTypeofmembership() {
		return typeofmembership;
	}

	public void setTypeofmembership(String typeofmembership) {
		this.typeofmembership = typeofmembership;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return super.toString() + "Member [typeofmembership=" + typeofmembership + ", amount=" + amount + "]"+"\n";
	}
			   
   
}
