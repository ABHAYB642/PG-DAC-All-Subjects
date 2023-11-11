import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeService {
	
	static Employee[] emparr;
	static int cnt;
	static 
	{
	   emparr = new Employee[100];
	   emparr[0] = new SalariedEmployee(1,"om","1234567890","emp@email.com","SD","MainHead",LocalDate.of(2007,7, 7),5000,2000);
	   emparr[1] = new SalariedEmployee(2,"vivek","1234567890","emp@email.com","Hr","MainHead",LocalDate.of(2007,7, 7),50000,200);
	   emparr[2] = new ContractEmployee(3,"shiv","1344567890","emp@email.com","MaNAGER","MainHead",LocalDate.of(2007,4, 3),100000,5000);
	   emparr[3] = new ContractEmployee(4,"shiv","1344567890","emp@email.com","MaNAGER","MainHead",LocalDate.of(2007,4, 3),100000,5000);
	   emparr[4] = new Vendor(5,"sagar","9455674500","emp@email.com","Hr","MainHead",LocalDate.of(2000,4,17),20,5000);
	   emparr[5] = new Vendor(6,"sagar","9455674500","emp@email.com","Hr","MainHead",LocalDate.of(2000,4,17),20,5000);
	   cnt=6;

	}

	public static void addnewEmployee(int ch) {

		Scanner sc1=new Scanner(System.in);
		System.out.println("enetr id : ");
		int pid=sc1.nextInt();
		System.out.println("enetr name : ");
		String nm=sc1.next();
		System.out.println("enetr mobile : ");
		String mob=sc1.next();
		System.out.println("enetr email : ");
		String em=sc1.next();
		System.out.println("enetr desg : ");
		String desg=sc1.next();
		System.out.println("enetr dept : ");
		String dept=sc1.next();
		System.out.println("eneter joining date(dd/mm/yyyy) : ");
		String dt=sc1.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		switch(ch)
		{
		case 1:
				System.out.println("enter salary : ");
				double s=sc1.nextDouble();
				System.out.println("enter bonus : ");
				double b=sc1.nextDouble();
				emparr[cnt]=new SalariedEmployee(pid,nm,mob,em,desg,dept,ldt,s,b);
			    break;
		       
		case 2:
				System.out.println("enetr hrs : ");
				int hrs=sc1.nextInt();
				System.out.println("enter charges : ");
				double charges=sc1.nextDouble();
				emparr[cnt]=new ContractEmployee(pid,nm,mob,em,desg,dept,ldt,hrs,charges);
			       break;
		       
		case 3:
				   System.out.println("enter no. of employee : ");
				   int noe =sc1.nextInt();
				   System.out.println("enter amount : ");
				   double amt=sc1.nextDouble();
				   emparr[cnt]=new Vendor(pid,nm,mob,em,desg,dept,ldt,noe,amt);
			       break;
	
		}
		
		System.out.println("new employee is inserted..!");
		cnt++;
	}

	public static void displayAll()
	{
		for(int i=0;i<cnt;i++)
		{
			System.out.println(emparr[i]);
		}
	}
	
	private static int searchByID(int pid)
	{
		for(int i=0;i<cnt;i++)
		{
			if(emparr[i].getPid()==pid)
			{
				return i;
			}
		}
		return -1;
	}

	public static boolean ModifySalByID(double sal, int id)
	{int pos=searchByID(id);
	if(pos!=-1)
	{
		if(emparr[pos] instanceof SalariedEmployee)
		{
			((SalariedEmployee)emparr[pos]).setSal(sal);
		}
		else if(emparr[pos] instanceof ContractEmployee)
		{
			((ContractEmployee)emparr[pos]).setCharges(sal);
		}
		else
		{
			((Vendor)emparr[pos]).setAmount(sal);
		}
		return true;
	}
	   return false;	
	}

	public static Employee searchByIDN(int id4) 
	{
		for(int i=0;i<cnt;i++)
		{
			if(emparr[i].getPid()==id4)
			{
				return emparr[i];
			}
		}

		return null;
	}

	public static double calculateSalaryById(int pid)
	{
		int pos=searchByID(pid);
		if(pos!=-1)
		{
			return emparr[pos].calculatesal();
		}
		 
		return 0;
	}

	public static double calculateBonusByID(int id3) {
		int pos=searchByID(id3);
		if(pos!=-1 && emparr[pos] instanceof SalariedEmployee)
		{
		        return ((SalariedEmployee)emparr[pos]).calculateBonus();
			//eturn emparr[pos].calculateBonus();
		}		
		return -1;
	}



}
