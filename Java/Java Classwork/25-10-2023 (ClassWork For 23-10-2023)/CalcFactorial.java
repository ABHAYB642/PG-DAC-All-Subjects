/*
class CalcFactorial{
	public static void main(String[] args){
	
		int num=Integer.parseInt(args[0]);
		int f=1;
		for(int i=2;i<=num;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial :" +f);
	}
}
*/

class CalcFactorial
{
	public static int factorial(int num)
	{
		int f=1;
		for(int i=2;i<=num;i++)
		{
			f=f*i;
		}	
		return f;
	}
	

	public static void main(String[] args)
    {
	int num=Integer.parseInt(args[0]);
	int ans=factorial(num);
	System.out.println("Factorial :" +ans);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*class CalcFactorial{
	public static void main(String[] args){
		
		
		int num=Integer.parseInt(args[0]);
	if(args.length>=1){
		
		
		int f=1;
		for(int i=2;i<=num;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial :" +f);
	}
	else {
		System.out.println("Pls pass arguments");
	}	
	}
}*/


