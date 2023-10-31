
abstract public class Customer {
private int accno;
private String name;
private String mobile;
protected double bal;
public Customer() {
	super();
}

public Customer(int accno, String name, String mobile,double bal) {
	super();
	this.accno = accno;
	this.name = name;
	this.mobile = mobile;
	this.bal=bal;
}

public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}

public double getBal() {
	return bal;
}

public void setBal(double bal) {
	this.bal = bal;
}

abstract public double calInt();

@Override
public String toString() {
	return "Customer [accno=" + accno + ", name=" + name + ", mobile=" + mobile + "]";
}


}
