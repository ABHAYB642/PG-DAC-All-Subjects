import java.util.Scanner;
public class TestEmpArr {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int choice=0;
	do {
		System.out.println("1. add new Employee\n2. Modify salary \n3. display all ");
		System.out.println("4. display by id \n5. calculate salary by id\n6. calculate Bonus\n7. exit\nchoice :");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			EmployeeService.addEmp();
			break;
		case 2:
			System.out.println("Enter ID");
			int id=sc.nextInt();
			System.out.println("Enter Salary");
			double sal=sc.nextDouble();
			boolean flag=EmployeeService.modifysalary(id,sal);
			if(flag)
			{
				System.out.println("Salary Modified\n");
			}
			else
			{
				System.out.println("Invalid id");
			}
			break;
		case 3:
			EmployeeService.display();
			break;
		case 4:
			System.out.println("Enter ID");
			id=sc.nextInt();
			Employee e=EmployeeService.displaybyID(id);
			if(e!=null)
			{
				System.out.println(e);
			}
			else
			{
				System.out.println("ID not found");
			}
			break;
		case 5:
			System.out.println("Enter ID");
			id=sc.nextInt();
			sal=EmployeeService.calsalbyID(id);
			if(sal!=-1)
			{
				System.out.println(sal);
			}
			else
			{
				System.out.println("ID not found");
			}
			break;
		case 6:{
			System.out.println("Enter ID");
			id=sc.nextInt();
			double bonus=EmployeeService.calBonusbyid(id);
			if(bonus==-2)
			{
				System.out.println("ID not found");
			}
			else if(bonus==-1)
			{
				System.out.println("Employee Not of salaried type");
			}
			else {
				System.out.println(bonus);
			}
			break;
			}
		case 7:
			sc.close();
			System.out.println("Thankyou For Visiting");
			
		}
    }while(choice!=7);
}
}

