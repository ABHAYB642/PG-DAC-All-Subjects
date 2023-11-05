import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeService {
static Employee[] emparr;
static int cnt;
static {
	emparr=new Employee[100];
	
	emparr[0]=new SalariedEmp(1,"MAHESH","4567890","MH@GMAIL.COM","HR","mgr",LocalDate.of(2001, 9,9),40000,6000);
	emparr[1]=new ContractEmp(2,"ASHISH","4567890","MH@GMAIL.COM","HR","mgr",LocalDate.of(2001, 9,9),10,6000);
	emparr[2]=new SalariedEmp(3,"RAM","4567890","MH@GMAIL.COM","HR","mgr",LocalDate.of(2001, 9,9),25,10000);
	emparr[3]=new Vendor(4,"OMKAR","4567890","MH@GMAIL.COM","HR","mgr",LocalDate.of(2001, 9,9),25,10000);
    
	cnt=4;
   
}
public static void addEmp() {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	int ch;
    System.out.println("enetr id");
	int pid=sc.nextInt();
	System.out.println("enetr name");
	String nm=sc.next();
	System.out.println("enetr mobile");
	String mob=sc.next();
	System.out.println("enetr email");
	String em=sc.next();
	System.out.println("enetr desg");
	String desg=sc.next();
	System.out.println("enetr dept");
	String dept=sc.next();
	System.out.println("eneter joining date(dd/mm/yyyy)");
	String dt=sc.next();
	LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	System.out.println("Enter Type of Employee");
	System.out.println("1. Salaried \n 2. Contract \n 3. vendor");
	ch=sc.nextInt();
	switch(ch) {
	case 1:
		System.out.println("enter basic sal");
		double s=sc.nextDouble();
		System.out.println("enter bonus");
		double b=sc.nextDouble();
		emparr[cnt]=new SalariedEmp(pid, nm, mob, em, dept, desg,ldt, s, b);
		cnt++;
		break;
	case 2:
		System.out.println("enetr hrs");
		int hrs=sc.nextInt();
		System.out.println("enter charges");
		double charges=sc.nextDouble();
		emparr[cnt]=new ContractEmp(pid, nm, mob, em, dept, desg, ldt, hrs, charges);
		cnt++;
		break;
	case 3:
		System.out.println("enter no of employess");
		int no=sc.nextInt();
		System.out.println("enter amount");
		double amt=sc.nextDouble();
		emparr[cnt]=new Vendor(pid, nm, mob, em, dept, desg, ldt,no,amt);
		cnt++;
		break;
	default:
		System.out.println("Enter Valid Choice");
	}
	}


public static void display() {
	for(Employee e:emparr) {
		if(e!=null) {
		System.out.println(e);
	}
}}


public static boolean modifysalary(int id,double sal) {
	int pos=searchbyID(id);
	if(pos!=-1)
	{
		for(int i=0;i<cnt;i++) {
			
			if(emparr[i] instanceof SalariedEmp )
			{
				((SalariedEmp)emparr[i]).setSal(sal);
			}
			else if(emparr[i] instanceof ContractEmp)
			{
				((ContractEmp)emparr[i]).setCharges(sal);
			}
			else if(emparr[i] instanceof Vendor)
			{
				((Vendor)emparr[i]).setAmt(sal);
			}
			
	}
		return true;
  }
	return false;
}
public static int searchbyID(int id)
{
	for(int i=0;i<cnt;i++)
	{
		if(emparr[i].getPid()==id)
		{
			return i;
		}
		
	}
	return -1;
}


public static Employee displaybyID(int id) {
	for(int i=0;i<cnt;i++)
	{
		if(emparr[i].getPid()==id)
		{
			return emparr[i];
			
		}
		
	}
	return null;
}

public static double calsalbyID(int id)
{
//	int pos=searchbyID(id);
//	if(pos!=-1) {
	for(int i=0;i<cnt;i++)
	{
		if(emparr[i].getPid()==id)
		{
			return emparr[i].calculateSal();
		}
	}
//	}
	return -1;
	
}


public static double calBonusbyid(int id)
{
	int pos=searchbyID(id);
	if(pos!=-1)
	{
	 
		   if(emparr[pos] instanceof SalariedEmp)
		   {
			return ((SalariedEmp)emparr[pos]).calculateBonus();
		    }
		   else  {
		return -1;   
		   } 	 
    }
	return -2;
	
}
}

	


