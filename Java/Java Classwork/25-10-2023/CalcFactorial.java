class CalcFactorial 
{
	public static void main(String[] args)
	{
		int num=Integer.parseInt(args[0]);
		int f=1;
		for(int i=0;i<=num;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial " +f);
	}
	
}
