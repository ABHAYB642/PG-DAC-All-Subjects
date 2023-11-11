import java.util.Scanner;

public class Cmd1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    //accept 3 cmd args
        int num1 = Integer.parseInt(args[0]);
		
 		int num2 = Integer.parseInt(args[1]);
		
 		int num3 = Integer.parseInt(args[2]);

 		//addition or 3 numbers
        System.out.println("Addition : " + (num1+num2+num3));

        //check prime or not
        for(int i=2;i<num1;i++)
        {
        	if(num1%2==0)
        	{
         		System.out.println("Not prime");
                break;
        	}
        	else
        	{
         		System.out.println("Prime");
         		break;

        	}
        }
        
        //print table
        for(int i=1;i<=10;i++)
        {
        	System.out.println(num1 + " * "+ i + " = " + (num1 * i));
        }
		
		
	}

}
