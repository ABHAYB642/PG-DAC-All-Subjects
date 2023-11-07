package Lab3;

import java.util.Scanner;

public class EmployeeDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choise;
		int cnt = 0 ;
		do {
			System.out.println("\n|-----------------------------------------|");
			System.out.println("| 	      SERVICES  		  |");
			System.out.println("|-----------------------------------------|");
			System.out.println("| 1. \tAdd new Employee    		  |");
			System.out.println("| 2. \tDisplay All  			  |");
			System.out.println("| 3. \tSearch Employee by Employee number|");
			System.out.println("| 4. \tSearch Employee by Employee name  |");
			System.out.println("| 5. \tSearch Employee by Designation    |");
			System.out.println("| 6. \tCalculate Salary	          |");
			System.out.println("| 7. \tCalculate Bonus			  |");
			System.out.println("| 8. \tUpdate Employee Name		  |");
			System.out.println("| 9. \tExit		   	          |");
			System.out.println("|-----------------------------------------|");
			System.out
			.print("\nSelect a option : ");
			choise = sc.nextInt();
			System.out.println();
			switch (choise) {
				case 1:
					boolean flag = EmployeeService.addNewEmployee();
					if (flag) {
						System.out.println("Employee Created");
					} else {
						System.out.println("Employee not created please try again");
					}
					break;
				case 2:
					EmployeeService.displayAll();
					break;
				case 3:
					System.out.print("Enter Employee id : ");
					int empId = sc.nextInt();
					Employee e = EmployeeService.displayByEmpId(empId);
					System.out.println(e);
					break;
				case 4:
					sc.nextLine();
					System.out.print("Enter Employee Name : ");
					String empName = sc.nextLine();
					Employee[] e1 = EmployeeService.displayByEmpName(empName);
					int i,ct=0;
					if(e1!=null) {
						for (i = 0; i < e1.length; i++) {
							if (e1[i]!=null) {
								ct++;
								System.out.println(e1[i]);
							}
							
						}
					}
					if(ct==0) {
						System.out.println("Employee not found!!");
						break;
					}
					
					break;
				case 5:
					sc.nextLine();
					System.out.print("Enter Employee Designation : ");
					String empDesg = sc.nextLine();
					e1 = EmployeeService.displayByEmpDesignation(empDesg);
					i=ct=0;
					if(e1!=null) {
						for (i = 0; i < e1.length; i++) {
							if (e1[i]!=null) {
								ct++;
								System.out.println(e1[i]);
							}
							
						}
					}
					if(ct==0) {
						System.out.println("Employee not found!!");
						break;
					}
					break;
				case 6:
					double sal = EmployeeService.calculateSalary();
					System.out.println("Salary : "+sal);
					break;
				case 7:
					double bonus = EmployeeService.calculateBonus();
					if(bonus ==-1) {
						System.out.println("Entered Employee doesn't have bonus ");
					}
					else {
						System.out.println("Bonus : "+bonus);
					}
					break;
				case 8:
					flag =EmployeeService.UpdateEmployeeName();
					if(flag) {
						System.out.println("Name Updated Successfully...! ");
					}
					else {
						System.out.println("Employee Not Found...!Please try again once");
					}
					break;
				case 9:
					System.out.println("Thank You!!");
					System.exit(0);
					break;
				default:
					System.out.println("Choose correct option!!");
					break;
			}
		}while(choise!=9);
	}

}
