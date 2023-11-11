
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BankServices {

	static Customer[] cstarr;
	static int cnt;
	static
	{
		cstarr = new Customer[100];
	    cstarr[0] = new SavingAccount("sbi",1000,"vita","IFSC1234","Pune","Aman","7796226371","aman@gmail.com",LocalDate.of(2001, 12,03),"Shivani",5000,1111,7.8);
	
	    cstarr[1] = new SavingAccount("sbi",1000,"vita","IFSC1234","Pune","Shubham","9789684534","shubham@gmail.com",LocalDate.of(2011, 12,03),"Malharpeth",7000,2222,7.8);
		
	    cstarr[2] = new SavingAccount("sbi",1000,"vita","IFSC1234","Pune","Pranav","8080637065","pranav@gmail.com",LocalDate.of(2001, 12,03),"kadegaon",750,3333,7.8);

	    cstarr[3] = new CurrentAccount("sbi",1000,"vita","IFSC1234","Pune","Varad","9734284534","varad@gmail.com",LocalDate.of(2011, 12,03),"Malharpeth",8500,4444,1000);
		
	    cstarr[4] = new CurrentAccount("sbi",1000,"vita","IFSC1234","Pune","Omkar","8080544345","omkar@gmail.com",LocalDate.of(2001, 12,03),"pune",5000,5555,2000); 
		
	    cnt=5;
	}
	
	public static void displayAll()
	{
		for(int i=0 ; i<cnt;i++)
		{
			System.out.println(cstarr[i]);
		}
	}

	public static void addNewCustomer(int ch) 
	{
		Scanner sc = new Scanner(System.in);
        String Bname =  "sbi";
    	double minBalence = 1000;
        String branch =  "vita";
        String ifsc =  "IFSC1234";
        String Addr = "pune";
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter mobile number ");
        String mob = sc.next();
        System.out.println("Enter emailID");
        String em = sc.next();
		System.out.println("Enter joining date date(dd/MM/yyyy) ");
		String dt = sc.next();
        LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));	
        System.out.println("Enter address");
        String adr=sc.next();
        Double interest = 7.8;
        double curbal=0;
        int cc = 50000;
        System.out.println("Enter PIN");
        int pin =sc.nextInt();
        System.out.println("Do your First Deposit to open Account");
        System.out.println("Enter amount");
        double fd = sc.nextDouble();
        
       switch(ch) 		
        {
        case 1 :
        	if(fd>cstarr[1].getMinbalence())
            {
        		cstarr[cnt] = new SavingAccount(Bname,minBalence,branch,ifsc,Addr,name,mob,em,ldt,adr,curbal,pin,interest);
        		cstarr[cnt].setcurbal(fd);
            	cnt++;
            	System.out.println("Saving Account Created");
            	
            }
        	else 
        	 {
        		System.out.println("Deposit should be greater than 1000");
             }
        	break;

        case 2 :
        	if(fd>cstarr[1].getMinbalence())
            {
        	cstarr[cnt] = new CurrentAccount(Bname,minBalence,branch,ifsc,Addr,name,mob,em,ldt,adr,curbal,pin,cc);
        	cstarr[cnt].setcurbal(fd);
        	cnt++;
        	System.out.println("Current Account Created");
            }
        	else
        	{
        	    System.out.println("Deposit should be greater than 1000");
        	}
        	break;
        }
	}

	public static Customer displayByName(String nm) 
	{
		
		for(int i=0 ; i<cnt;i++)
		{
			if(cstarr[i].getName().equals(nm))
			{
				return cstarr[i];
			}
		}
   	   	return null;
	}
	
	public static void showBal(String name)
	{
		int c;
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<cnt;i++)
		{
			c = 3;
			if(cstarr[i].getName().equals(name))
			{
				do {
				System.out.println("Enter pin");
				int n =  sc.nextInt();
				
				if(cstarr[i].getPin()==n)
				{
			    System.out.println("Total Balance : "+cstarr[i].getcurbal());
				break;
				}
				else
				{
					System.out.println("Wrong pin");
					c--;
				}
				}while(c!=0);
			}
		}
		
	}
	public static void deposit(String name , double amount) 
	{

		int c;
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<cnt;i++)
		{
			c = 3;
			if(cstarr[i].getName().equals(name))
			{
				do {
				System.out.println("Enter pin");
				int n =  sc.nextInt();
				
				if(cstarr[i].getPin()==n)
				{
				double bal = cstarr[i].getcurbal();
				cstarr[i].setcurbal(bal+amount);
				System.out.println("Amount Deposited");
				break;
				}
				else
				{
					System.out.println("Wrong pin");
					c--;
				}
				}while(c!=0);
			}
		}
 	}

	public static void withdrow(String nm, double b) 
	{
		int c;
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<cnt;i++)
		{
			c = 3;
			if(cstarr[i].getName().equals(nm))
			{
				do {
				System.out.println("Enter pin");
				int n =  sc.nextInt();
				
				if(cstarr[i].getPin()==n)
					{
					double bal = cstarr[i].getcurbal();
					
						if((cstarr[i].getcurbal())-(cstarr[i].getMinbalence())>=b)
						{
							cstarr[i].setcurbal(bal - b);
							System.out.println("Amount withdrawn..");
						}
						else 
						{
							double c1 = cstarr[i].getcurbal() - cstarr[i].getMinbalence();
							System.out.println("You can withdraw up to " + c1);
						}
						break;
						}
				else
				{
					System.out.println("Wrong pin");
					c--;
				}
				}while(c!=0);
			}
		}
		
	}
	
	
	
}
