

public class BankClass 
{
	    private String Bname;
		private  String branch;
		private  String IFSC;
		private  String  address;
		private  double minbalence=0;

		public BankClass() 
		{
			super();
		}
		public BankClass(String branch, String IFSC, String address,String Bname,double minbalence) 
		{
			super();
			this.Bname = Bname;
			this.minbalence= minbalence;
			this.branch = branch;
			this.IFSC = IFSC;
			this.address = address;
			
		}
		public String getBranch() 
		{
			return branch;
		}
		public void setBranch(String branch)
		{
			this.branch = branch;
		}
		public String getIFSC() 
		{
			return IFSC;
		}
		public void setIFSC(String iFSC) 
		{
			IFSC = iFSC;
		}
		public String getAddress() 
		{
			return address;
		}
		public void setAddress(String address) 
		{
			this.address = address;
		}
		public String getBname() {
			return Bname;
		}
		public void setBname(String bname) {
			Bname = bname;
		}
		public double getMinbalence() {
			return minbalence;
		}
		
		@Override
		public String toString() {
			return "BankClass [Name ="+ Bname + "MinBalence =" + minbalence+ "branch=" + branch + ", IFSC=" + IFSC + ", address=" + address + "]";
		}

		
}
