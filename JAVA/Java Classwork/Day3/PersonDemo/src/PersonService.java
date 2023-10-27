import java.util.Scanner;

public class PersonService {
	
	static Person[] parr;
	static int cnt;
	static
	{
		parr=new Person[100];
		parr[0]=new Person(1,"Sejal","8765432345");
		parr[1]=new Person(2,"Abhay","9065652378");
		cnt=2;
	}
	

	public static void addnewPerson()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		String nm=sc.nextLine();
		System.out.println("Enter Mobile: ");
		String mb=sc.next();
		parr[cnt]=new Person(id,nm,mb);
		cnt++;		
	}
	public static void displayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(parr[i]);
		}	
	}
	public static Person searbyID(int id)
	{
		for(int i=0;i<cnt;i++)
		{
			if(parr[i].getPid()==id)
			{
				return parr[i];
			}	
		}
		return null;
	}
	public static Person[] getbyName(String name)
	{
		Person[] arr=new Person[10];
		int count=0;
		for(int i=0;i<cnt;i++)
		{
			if(parr[i].getPname().equals(name))
			{
				arr[count]=parr[i];
				count++;
			}	
		}
		if(count>0) {
			return arr;
		}
		return null;
	}
	public static int updateMobile(int id,String mob)
	{
		for(int i=0;i<cnt;i++) {
			if(parr[i].getPid()==id) {
				parr[i].setMobile(mob);
				return 1;
			}
			
		}
		return -1;
	}
	
	
	
}
