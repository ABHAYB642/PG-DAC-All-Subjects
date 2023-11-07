package beans;

public class StringManipulation 
{
       //substring(), toLowerCase(), toUpperCase() and trim().
	
	private int id;
	private String str;
	private String str1;
	
	
	public StringManipulation() 
	{
		id=1;
		str="Prathamesh Nale";
		str1="    Tejas Aher     ";
	}
	
	
	public StringManipulation(int id, String str,String str1) {
		super();
		this.id = id;
		this.str = str;
		this.str1 = str1;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	
	
	@Override
	public String toString() {
		return "StringManipulation [id=" + id + ", str=" + str + ", str1=" + str1 + "]";
	}


	public void manipulation()
	{
		System.out.println("Lower case : "+str.toLowerCase());
		System.out.println("Upper case : "+str.toUpperCase());
		System.out.println("SubString : "+str.substring(1,5));
		System.out.println("String Trim : "+str1.trim());
		
	}
	 
}
