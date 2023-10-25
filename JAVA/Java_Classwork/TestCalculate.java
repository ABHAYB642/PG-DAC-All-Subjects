import java.util.Scanner;
class TestCalculate{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2=sc.nextInt();
		
		int ans=NumberServices.addition(num1,num2);
		System.out.println("Addition "+ ans);
		ans=NumberServices.add_digits(num1);
		System.out.println("Add_digits "+ ans);
	}
	


}