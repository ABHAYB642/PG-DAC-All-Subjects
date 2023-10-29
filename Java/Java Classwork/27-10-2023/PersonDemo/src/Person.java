
public class Person {

	private int pid;
	private String pname;
	private String mobile;
	static int count;
	static {
		count=0;
	}
	
	public Person()
	{
//		pid=0;
//		pname=null;
//		mobile=null;
		this(0,null,null); //tocall other constructor of
		                   // same class
	}
	public Person(int id,String nm,String mob)
	{
		//count++;
		this.pname=nm;
		this.pid=id;
		
		this.mobile=mob;
		
	}
//	public Person(String nm,String mob)
//	{
//		//count++;
//		this.pname=nm;
//		this.pid=generateCode();
//		
//		this.mobile=mob;
//		
//	}
	private String generateCode() {
		count++;
		if(this.pname!=null)
		{
			return this.pname.substring(0,3)+count;
		}
		else
			return "a"+count;
	}
	public void setPid(int pid)
	{
		this.pid=pid;
			
	}
	public void setPname(String pname)
	{
		this.pname=pname;
			
	}
	public void setMobile(String mob)
	{
		this.mobile=mob;
			
	}
	public int  getPid()
	{
		return this.pid;
	}
    public String getPname() {
    	return this.pname;
    }
    public String getMob()
    {
    	return this.mobile;
    }
    public String toString()
    {
    	return "pid: "+this.pid + " pname : "+ this.pname+ " Mobile :"+
    			this.mobile;
    }   
}    
    
    