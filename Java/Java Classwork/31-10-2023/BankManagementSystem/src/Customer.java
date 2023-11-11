
import java.time.LocalDate;

abstract public class Customer extends BankClass {
private String name;
private String mob;
private String email;
private LocalDate dateOpen;
private String addr;
private double curbal;
private int pin;
public Customer() {
	super();
}
public Customer(String bname , double minbalence ,String branch, String IFSC, String address, String name, String mob, String email, LocalDate dateOpen, String addr,double curbal,int pin) {
	super(branch, IFSC, address,bname , minbalence);
	this.name = name;
	this.mob = mob;
	this.email = email;
	this.dateOpen = dateOpen;
	this.addr = addr;
	this.curbal=curbal;
	this.pin=pin;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMob() {
	return mob;
}
public void setMob(String mob) {
	this.mob = mob;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public LocalDate getDateOpen() {
	return dateOpen;
}
public void setDateOpen(LocalDate dateOpen) {
	this.dateOpen = dateOpen;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public double getcurbal() {
	return curbal;
}
public void setcurbal(double curbal) {
	this.curbal=curbal;
}
public int getPin()
{
	return pin;
}

@Override
public String toString() {
	return "Customer [name=" + name + ", mob=" + mob + ", email=" + email + ", dateOpen=" + dateOpen + ", addr=" + addr+ "Current Balance :" + curbal+"pin :" + "****"
			+ ", toString()=" + super.toString() + "]";
}

}
