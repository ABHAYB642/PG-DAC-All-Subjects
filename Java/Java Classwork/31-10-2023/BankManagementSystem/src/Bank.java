
public class Bank {
	private String bname;
	private String branch;
	private int ifsc;
	private Customer c;
	public Bank() {
		super();
	}
	public Bank(String bname, String branch, int ifsc, Customer c) {
		super();
		this.bname = bname;
		this.branch = branch;
		this.ifsc = ifsc;
		this.c = c;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getIfsc() {
		return ifsc;
	}
	public void setIfsc(int ifsc) {
		this.ifsc = ifsc;
	}
	public Customer getC() {
		return c;
	}
	public void setC(Customer c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Bank [bname=" + bname + ", branch=" + branch + ", ifsc=" + ifsc + ", c=" + c + "]";
	}
	
	
}
