
public class CurrentCustomer extends Customer {
	private String cid;
	private int Noofmonths;
	static double interest;
	static double minbal;

	static {
		interest=3;
		minbal=1000;
	}

	public CurrentCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentCustomer(int accno, String name, String mobile, double bal,String cid,int Noofmonths) {
		super(accno, name, mobile, bal);
		this.cid=cid;
		this.Noofmonths=Noofmonths;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public int getNoofmonths() {
		return Noofmonths;
	}

	public void setNoofmonths(int noofmonths) {
		Noofmonths = noofmonths;
	}

	public static double getInterest() {
		return interest;
	}

	public static void setInterest(double interest) {
		CurrentCustomer.interest = interest;
	}

	public static double getMinbal() {
		return minbal;
	}

	public static void setMinbal(double minbal) {
		CurrentCustomer.minbal = minbal;
	}

	@Override
	public String toString() {
		return super.toString()+"CurrentCustomer [cid=" + cid + ", Noofmonths=" + Noofmonths + "]";
	}
	public double calInt()
	{
		return Noofmonths*bal;
	}
	
}
