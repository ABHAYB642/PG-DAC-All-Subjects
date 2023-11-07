package Lab3;

public class Person {
	
	private int pid;
	private String Pname;
	private String mobile;
	private String email;

	public Person() {
		super();
	}


	public Person(int pid, String pname, String mobile, String email) {
		super();
		this.pid = pid;
		Pname = pname;
		this.mobile = mobile;
		this.email = email;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return Pname;
	}


	public void setPname(String pname) {
		Pname = pname;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Person [pid=" + pid + ", Pname=" + Pname + ", mobile=" + mobile + ", email=" + email + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
