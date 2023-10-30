import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
	int [][]a= new int [3][3];
	int [][]b=new int [3][3];
	ArrayOps.acceptData2D(a);
	ArrayOps.acceptData2D(b);	
	int choice;
	Scanner sc = new Scanner(System.in);
	do
	{
		System.out.println("1.ADD TWO ARRAY");
		System.out.println("2.FIND TRANSPOSE");
		System.out.println("3. find minimum number from 2D array");
		System.out.println("4. find maximum number from 2D array");
		 System.out.println(" 5. display array");
		 System.out.println("6. check a particular number appears how many times in 2D array");
		 System.out.println("7. exit");
		 System.out.println("ENTER YOUR CHOICE");
		 choice=sc.nextInt();
		 
		 switch(choice) {
		 case 1:
			 int [][]add=ArrayOps.addArr(a,b);
			 	System.out.println("SUM is ");
			 	ArrayOps.displayData2D(add);
			 	break;
		 case 2:
			 int[][]transpose=ArrayOps.TransposeArr(a);
				ArrayOps.displayData2D(transpose);
				break;
		 case 3:
			 int min=ArrayOps.Minele(a);
			 System.out.println("MIN ELEMENT IS "+min);
			 break;
		 case 4:
			 int max=ArrayOps.Maxele(a);
			 System.out.println("MAX ELEMENT IS "+max);
	     break;
		 case 5:
				ArrayOps.displayData2D(a);
				break;
		 case 6:
			 int cnt=ArrayOps.Countele(a,5);
				System.out.println("COUNT OF ELEMENT IS "+cnt);
				break;
		 case 7:
			 System.out.println("EXITED");
			 break;
			 
		default:
			System.out.println("Option madun tak");
		 }
	}while(choice!=7);
	sc.close();
	
	
	}


}
