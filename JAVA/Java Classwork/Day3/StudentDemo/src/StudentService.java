import java.util.Scanner;

public class StudentService {
static Student[] s;
static int cnt;
static {
	s=new Student[100];
	s[0]=new Student(15,"Sujit",90,80,70);
	cnt=1;
}

public static void addStudent() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter ID");
	int id=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter Name");
	String name=sc.nextLine();
	System.out.println("Enter Marks 1");
	int m1=sc.nextInt();
	System.out.println("Enter Marks 2");
	int m2=sc.nextInt();
	System.out.println("Enter Marks 3");
	int m3=sc.nextInt();
	s[cnt]=new Student(id,name,m1,m2,m3);
	cnt++;
}
public static void displayStudent() {
	for(int i=0;i<cnt;i++) {
		System.out.println(s[i]);
	}
}
public static Student[] displaybyName(String name)
{
	Student[] t=new Student[10];
	int count=0;
	for(int i=0;i<cnt;i++) {
		if(s[i].getName().equals(name))
		{
			t[count]=s[i];
			count++;
		}
	}
	if(count>0)
	{
		return t;
	}
	else
	{
		return null;
	}	
}
public static Student DisplaybyID(int id) {
	for(int i=0;i<cnt;i++){
		if(s[i].getId()==id) {
			return s[i];
		}
	}
	return null;
}
public static int UpdateMarks(int id,int marks) {
	for(int i=0;i<cnt;i++) {
		if(s[i].getId()==id) {
			s[i].setM1(marks);
			return 1;
		}
	}
	return -1;
}
}
