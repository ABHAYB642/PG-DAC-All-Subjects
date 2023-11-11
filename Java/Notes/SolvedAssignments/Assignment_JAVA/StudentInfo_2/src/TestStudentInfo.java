
public class TestStudentInfo {
	
	private int studid;
	private String studname;
	private int m1,m2,m3;
	
	
	
	public TestStudentInfo() {
		super();
	}

	public TestStudentInfo(int studid, String studname, int m1, int m2, int m3) {
		super();
		this.studid = studid;
		this.studname = studname;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	   //using display method 
     public void display()
     {
    	 System.out.println("Student id : " + studid +"\nStudent name : " + studname);
         System.out.println("Marks 1 : " + m1 + "\nMarks 2 : " + m2 + "\nMarks 3 : " + m3 + "\n");
     }
     

   //using tostring method 
	@Override
	public String toString() {
		return "Student Details : \n--------------- \nstudid=" + studid + "\nstudname=" + studname + "\nm1=" + m1 + "\nm2=" + m2 + "\nm3="
				+ m3 + "\n";
	}

	public static void main(String[] args) {
		
		TestStudentInfo obj1 = new TestStudentInfo(1,"Shubham",78,87,90);
		TestStudentInfo obj2 = new TestStudentInfo(2,"Omkar",85,87,95);
       
        obj1.display();
        obj2.display();
        
        System.out.println(obj1);
        System.out.println(obj2);


	}

}
