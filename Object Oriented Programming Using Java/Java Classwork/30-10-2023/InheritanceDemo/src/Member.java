
public class Member extends Person {
private String TypeofMembership;
private double amt;
public Member() {
	super();
}

public Member(int pid, String pname, String mobile, String email,String typeofMembership, double amt) {
	super(pid,pname,mobile,email);
	TypeofMembership = typeofMembership;
	this.amt = amt;
}

public String getTypeofMembership() {
	return TypeofMembership;
}
public void setTypeofMembership(String typeofMembership) {
	TypeofMembership = typeofMembership;
}
public double getAmt() {
	return amt;
}
public void setAmt(double amt) {
	this.amt = amt;
}

@Override
public String toString() {
	return super.toString()+"Member [TypeofMembership=" + TypeofMembership + ", amt=" + amt + "]";
}

}
