import java.util.Scanner;

class NumberService{

public static int factorial(int num)
{
	int f=1;
		for(int i=2;i<=num;i++)
		{
			f=f*i;
		}	
		return f;
}
}

class Factorial
{
	public static void main(String[] args)   //main outside the class
    {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int num = sc.nextInt();
	
	int ans=NumberService.factorial(num);    //static fun so classname.funname
	System.out.println("Factorial :" +ans);
	sc.close();
	}
}
