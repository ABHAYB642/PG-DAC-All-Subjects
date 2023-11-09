//1. Accept 3 numbers from command line arguments.
// If number is 
//prime, then print the table of the number. Other wise divide
//number by 10 and display output
import java.util.Scanner;


class Assignment1{
	
	public static boolean checkpr(int num)
	{
		int cnt=0;
		for (int i = 2; i < num; i++) {
			if ((num%i) == 0) {
				cnt++;
			}
		}
	if (cnt>=1) {
		return false; 
	}else {
	return true;	
	}}
	
	public static void main(String[] args){
		
		
		//int num=Integer.parseInt(args[0]);
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter Num1");
       int num=sc.nextInt();
		
		

		boolean status=checkpr(num);
		System.out.println(status);
		if(status)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(num*i);
			}
		}
		else
		{
			System.out.println(num/10);
		}
		
}
	}
	






//import java.util.Scanner;
//
//public class Assignment1 {
//
//	public static void main(String[] args) {
//		int num1;
//		int num2;
//		int num3;
//		int cnt = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Num1");
//		num1 = sc.nextInt();
//	
////		num2=sc.nextInt();
////		num3=sc.nextInt();
//
//		for (int i = 1; i <= num1; i++) {
//			if (num1 % i == 0) {
//				cnt++;
//			}
//		}
//		if (cnt == 2) {
//			System.out.println("Number is Prime");
//		} else {
//			System.out.println("Not prime");
//		}
//		//Assignment1 as=new Assignment1();
//		//checkpr(num1);
//		static void checkpr(int num) {
//			System.out.println("H");
//			} 
//		checkpr(num1);
//	};
//	
//
//}


