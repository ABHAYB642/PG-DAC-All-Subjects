import java.util.Scanner;

class MenuService
{
	
	public static void printTable()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
	    int n=sc.nextInt();
	
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
	}
    public static void displayPattern()
	{
		Scanner sc = new Scanner(System.in);
	System.out.println("enter no of rows to display");
	int num=sc.nextInt();
		
		
		int spacecnt=(int)(num/2);
		for (int i=1;i<=num;i=i+2)
		{
			String s="";
			for(int k=0;k<spacecnt;k++)
			{
				s=s+"-";
			}
			String star="";
			for(int j=1;j<=i;j++)
			{
				star=star+"*";
			}
			System.out.println(s+star);
			spacecnt=spacecnt-1;
			System.out.println();
	    }
	    spacecnt=1;
	    for(int i=num-2;i>=1;i=i-2)
	    {
	    	String s="";
	    	for(int k=0;k<spacecnt;k++)
	    	{
	    		s=s+"-";
	    	}
	    	String star="";
	    	for(int j=1;j<=i;j++)
	    	{
	    		star=star+"*";
	    	}
	           System.out.println(s+star);
	    		spacecnt=spacecnt+1;
	    		System.out.println();
	    }
		
	}
	public static void primeno()
	{
		Scanner sc = new Scanner(System.in);
	System.out.println("enter no ");
	int n=sc.nextInt();
	int count=0;
		for (int i=1; i<=n;i++)
    {
        if ( n % i ==0)
        {
        count++;
        }
    }

    if ( count==2)
    {
        System.out.println(" prime number");
    }
    else
    {
       System.out.println("NOT prime number");
    }
	}		
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int choice;  

        do {  
	
	       System.out.println("===============================");
	
			System.out.println("========== MENU ==========");  

            System.out.println("1. PRINT TABLE ");  

            System.out.println("2. DISPLAY PATTERN"); 
			
			System.out.println("3. PRIME NO");
			
			System.out.println("4. Exit");  

            System.out.println("===============================");
			
			
			
			 System.out.print("Enter your choice: ");  

            choice = sc.nextInt();  

            switch (choice) {  

                case 1:  

							printTable();
               break;  

                case 2: 

                    displayPattern();

                    break;
					
			    case 3:
				       primeno();
					   break;

                case 4:  

                    System.out.println("Exiting...");  

                    break;  

                default:  

                    System.out.println("Invalid choice. Please try again.");  

            }  

        } while (choice != 4);  
	sc.close();
	
  }	
}

