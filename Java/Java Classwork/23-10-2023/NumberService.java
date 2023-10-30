class NumberService{

public static int factorial(int n)
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
	public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int num = sc.nextInt();
	
	int ans=factorial(num);
	System.out.println("Factorial :" +ans);
	sc.close();
	}
}
