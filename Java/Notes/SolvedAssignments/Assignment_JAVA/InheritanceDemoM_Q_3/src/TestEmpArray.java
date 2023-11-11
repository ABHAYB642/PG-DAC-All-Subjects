import java.util.Scanner;

public class TestEmpArray {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		int choice;
		
		do {
		
			System.out.print("\n1.add new Employee\n2.Modify salary \n3.display all");
			System.out.println("\n4.display by id \n5.calculate salary by id\n6.calculate Bonus\n7.exit");
            System.out.println("\nenter your coice :");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1 : 
				  System.out.println("\n1.salaried\n2.contract\n3.vendor");
				  int ch=sc.nextInt();
				  EmployeeService.addnewEmployee(ch);
				  break;
				  
			case 2 : 
			    	System.out.println("Enter id");
		    		int id=sc.nextInt();
		    		System.out.println("Enter Salary");
		    		double sal=sc.nextDouble();
		    		boolean status=EmployeeService.ModifySalByID(sal,id);
		    		if(status)
		    		{
		    			System.out.println("Modification done");
		    		}
		    		else
		    		{
		    			System.out.println("id not found");
		    		}
    		
				  break;
				  
			case 3 : 
				  EmployeeService.displayAll();
				  break;
				  
			case 4 : 
	        		System.out.println("Enter Id that you want to display ");
	        		int id4=sc.nextInt();
	        		Employee e=EmployeeService.searchByIDN(id4);
	        		if(e!=null)
	        		{
	        			System.out.println(e);
	        		}
	        		else
	        		{
	        			System.out.println("ID not found");
	        		}
				  break;
				  
			case 5 : 
					System.out.println("Enter id that you want to find salary");
		        	int pid=sc.nextInt();
		        	double salary=EmployeeService.calculateSalaryById(pid);
		        	if(salary!=-1)
		        	{
		        		System.out.println("Salary of Employee : "+(salary));
		        	}
		        	else
		        	{
		        		System.out.println("Employee Not Found");
		        	}
					  break;
				  
			case 6 :
					System.out.println("Enter Id you want to find bonus");
		        	int id3=sc.nextInt();
		        	double bonus=EmployeeService.calculateBonusByID(id3);
		        	if(bonus!=-1)
		        	{
		        		System.out.println("Total Bonus Calculated: "+bonus);
		        	}
		        	else
		        	{
		        		System.out.println("Id not found");
		        	}
					  break;
				  
			case 7 : 
				  sc.close();
				  System.out.println("Thank you for visiting.....");
				  break;
			
			default : 
				    System.out.println("you enterd wrong choice..");
				    break;
			}
				
		}while(choice!=7);
		
	}

}
