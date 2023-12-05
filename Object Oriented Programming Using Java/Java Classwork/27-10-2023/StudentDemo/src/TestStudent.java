import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		do {
			System.out.println("1.Add Student");
			System.out.println("2.Display All");
			System.out.println("3.Display by Name");
			System.out.println("4.Display By ID");
			System.out.println("5.Update Marks M1");
			System.out.println("6.Exit");
		System.out.println("Enter Your Choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			StudentService.addStudent();
			break;
		case 2:
			StudentService.displayStudent();
			break;
		case 3:
			System.out.println("Enter Student Name :");
			sc.nextLine();
			String name=sc.nextLine();
			Student[] N=StudentService.displaybyName(name);
			if (N!=null){
				for(Student s:N) {
					if(s!=null)
					{
						System.out.println(s);
					}
			}
			}
			else
			{
				System.out.println("Student not found");
			}
			break;
		case 4:
			System.out.println("Enter Student ID :");
			int id = sc.nextInt();
			Student ob=StudentService.DisplaybyID(id);
			if(ob!=null)
			{
				System.out.println(ob);
				
			}
			else
			{
				System.out.println("Id Not Found");
			}
			break;
		case 5:
			System.out.println("Enter Id");
			int sid;
			sid=sc.nextInt();
			System.out.println("Enter Marks 1:");
			int marks=sc.nextInt();
			int m=StudentService.UpdateMarks(sid,marks);
			if(m==1)
			{
				System.out.println("Update Successfull");
				
			}
			else
			{
				System.out.println("Id Not Found");
			}
			break;
	
		case 6:
			System.out.println("Exited");
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice");
		}
		
			
	}while(choice!=6);

}
}