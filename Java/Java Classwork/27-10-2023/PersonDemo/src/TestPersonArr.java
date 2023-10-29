import java.util.Scanner;

public class TestPersonArr {

	
	
	public static void main(String[] args) {
		int choice=0;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println(" 1.Add new Person \n 2.Display all person \n 3.Display by id \n 4.Update Mobile By id ");
			
			System.out.print(" 5.Dislay by name \n 6.Delete by id 7.EXIT \n");
			
			System.out.println("Enter choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				PersonService.addnewPerson();
				break;
			case 2:
				PersonService.displayAll();
				break;
			case 3:
				System.out.println("Enter your id ");
				int id=sc.nextInt();
				Person ob=PersonService.searbyID(id);
				if(ob!=null)
				{
					System.out.println(ob);
				}
				else
				{
					System.out.println("Person not found ");
				}
				break;
			case 4:
				System.out.println("Enter Person id");
				int id1=sc.nextInt();
				System.out.println("Enter Person Updated MobileNo");
				String mob=sc.next();
				boolean flag=PersonService.updateMobile(id1,mob);
				if(flag) {
					System.out.println("Update Successfull");
				}
				else {
					System.out.println("ID Not Found");
				}
				break;
			case 5:
				System.out.println("Enter Name");
				sc.nextLine();
				String name=sc.nextLine();
				Person[] ob1=PersonService.getbyName(name);
				if(ob1!=null)
				{
//					for(int i=0;i<ob1.length;i++) 
//					{
//						if(ob1[i]!=null)
//						{
//					     System.out.println(ob1[i]);
//				         }
//					}
					for(Person ob2:ob1) {
						if(ob2!=null) {
							System.out.println(ob2);
						}
					}
				}
					
				else
				{
					System.out.println("Person not found ");
				}
				break;
				
			case 6:
				System.out.println("Enter id ");
			    id =sc.nextInt();
			    boolean status = PersonService.deletebyId(id);
			    if (status)
			    {
			      System.out.println("Deleted Succesfully ");
			    }
			    else
			    {
			    	System.out.println("Id Not Found");
			    }
				break;
				
			case 7:
				System.out.println("Exited");
				System.exit(0);
				break;
			default:
				System.out.println("Again Enter Valid choice !");
			}
			
		}while(choice!=7);
		sc.close();
	}

}
