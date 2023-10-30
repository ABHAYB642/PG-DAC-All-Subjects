import java.util.Scanner;

class Table{
	
	public static void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
	}	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	System.out.println("enter number");
	int num=sc.nextInt();
	printTable(num);
	sc.close();
	}
}