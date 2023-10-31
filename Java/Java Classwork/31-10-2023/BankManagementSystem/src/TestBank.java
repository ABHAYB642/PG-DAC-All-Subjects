import java.util.Scanner;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("\n1.Open account\n2.Deposit\n3.Withdraw\n4.List All");
			System.out.println("5.Display by id \n6.Exit\nchoice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Account No");
				int ano=sc.nextInt();
				System.out.println("Enter Name");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.println("Enter Balance");
				double bal=sc.nextDouble();
				boolean flag=BankService.openAcc(ano,bal,name);
				if(flag) {
					System.out.println("Account Created Successfully");
				}
				else {
					System.out.println("Enter Valid amount or more than 2000");
				}
				break;
			case 2:
				System.out.println("Enter Account No.");
			    ano= sc.nextInt();
				System.out.println("Enter Amount to deposit");
			    bal= sc.nextDouble();
				flag=BankService.Deposit(ano,bal);
				if(flag) {
					System.out.println("Amount Deposited Successfully !");
				}
				else {
					System.out.println("Enter Valid Account Number");
				}
				break;
			case 3:
				System.out.println("Enter Account No.");
			    ano= sc.nextInt();
				System.out.println("Enter amount to withdraw");
				bal=sc.nextDouble();
				int c=BankService.Withdraw(ano,bal);
				if(c==1) {
					System.out.println("Amount Withdrawn Successfully !");
				}
				else if(c==2) {
					System.out.println("Min Bal Should be 1000");
				}
				else {
					System.out.println("Account No Not found");
				}
				break;
			case 4:
				BankService.Listall();
				break;
			case 5:
				//BankService.DisplaybyID();
				break;
			case 6:
				sc.close();
				System.out.println("Thankyou For Visiting");
				break;
			default:
				System.out.println("Enter Valid Choice");
	}
		}while(choice!=7);
		

	}
}
