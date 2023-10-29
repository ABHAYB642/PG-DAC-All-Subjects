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
		sc.close();
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
	public static boolean updateMobile(int id,String mob)
	{
//		for(int i=0;i<cnt;i++) {
//			if(parr[i].getPid()==id) {
//				parr[i].setMobile(mob);
//				return 1;
//			}
//			
//		}
		Person P =searbyID(id);
		if(P!=null)
		{
		    System.out.println("Do you really want to update it");
			System.out.println(P.getMob()+" to "+mob);
			Scanner sc=new Scanner(System.in);
			String ans=sc.next();
			 System.out.println("To Update Please Press 'Yes' ");
			
			sc.close();
			if(ans.equals("yes"));
			{
				P.setMobile(mob);
				return true;
				
			}
			
		}
		
		return false;
	}
	public static boolean deletebyId(int id)   //delete opn
	{
		int i=0;
		boolean flag =false;
		for(i=0;i<cnt;i++)
		{
			if(parr[i].getPid()==id)
			{
				flag=true;              
				break;                          //that person index will get i
			}	
		}
//		for(Person P:parr)
//		{
//			if(P.getPid()==id)
//			{
//				flag=true;
//				break;
//			}
//		}
		
		if(flag)
		{
			System.out.println("Do you really want to Delete it");
			System.out.println(parr[i]);
			 System.out.println("To Delete Please Press 'Yes' ");
			Scanner sc=new Scanner(System.in);
			String ans=sc.next();
			if(ans.equals("Yes"))
			{
				for(int j=i;j<cnt;j++)   //j=i
				{
					parr[j]=parr[j+1];
				}
				cnt--; //*
				return true;
				
			}
			sc.close();
		}
		return false;
		
	}
	
	
}
