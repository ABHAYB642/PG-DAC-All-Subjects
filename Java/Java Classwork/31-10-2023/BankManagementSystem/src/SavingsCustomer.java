
public class SavingsCustomer extends Customer {
private String sid;
private int Noofmonths;
static double interest;
static double minbal;

static {
	interest=7;
	minbal=5000;
}
public SavingsCustomer() {
	super();
}
public SavingsCustomer(int accno, String name, String mobile,double bal,String sid, int noofmonths) {
	super(accno,name,mobile, bal);
	this.sid = sid;
	this.Noofmonths = noofmonths;
}
public String getSid() {
	return sid;
}
public void setSid(String sid) {
	this.sid = sid;
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
	SavingsCustomer.interest = interest;
}
public static double getMinbal() {
	return minbal;
}
public static void setMinbal(double minbal) {
	SavingsCustomer.minbal = minbal;
}
@Override
public String toString() {
	return super.toString()+"SavingsCustomer [sid=" + sid + ", Noofmonths=" + Noofmonths + "]";
}
public double calInt() {
	return Noofmonths*bal;
}


}
