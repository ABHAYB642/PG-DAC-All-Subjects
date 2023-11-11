import java.util.Scanner;

public class Exception_main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       try { 
        for(int i=0;i<3;i++) {
        try {
        	System.out.println("Enter age:");
            int age=sc.nextInt();
        if(age>18 &&age<60) {
        	System.out.println("it is valid age");
        	break;
        }else {
        	
        	throw new InvalidAge("Age should between 18 and 60:");
        	
        }
        
        }catch(InvalidAge e)
        {
         System.out.println(e.getMessage());
         if(i==2) {
        	 throw new AttemptEnds("Your Attempts ends");
         }
        }
        	
        }
       }catch(AttemptEnds e) {
    	   System.out.println(e.getMessage());
       }
	}

}
