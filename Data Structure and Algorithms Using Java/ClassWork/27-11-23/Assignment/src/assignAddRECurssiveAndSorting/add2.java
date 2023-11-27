package assignAddRECurssiveAndSorting;
import java.util.Scanner;
public class add2 {

	

	

	
		public static int addRecurssive(int num) {
			if(num<1)
				return -1;
			else if(num==1)
			{
				return 1;
			}
			else
				return num+addRecurssive(num-1);
			
		}
		
	          public static void main(String[] args) {
				int num=0;
				Scanner sc=new Scanner(System.in);
				num=sc.nextInt();
				int sum=addRecurssive(num);
				System.out.println("Sum of N numbers is"+sum);
			}

			
	}


