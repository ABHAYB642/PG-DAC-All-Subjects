import java.util.Scanner;

public class ArrayService2D {

	public static void acceptData2D(int [][]a)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter 2D array elements ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				System.out.println("enter the value "+i+"   "+j);
				a[i][j]=sc.nextInt();
			}
		}
	}
	public static void displayData2D(int [][]a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
				System.out.println();
		}
	}
	public static void DisplayData(int []a) {
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
//		
		System.out.println("Array Element are ");
		for(int val:a)
		{
			System.out.println(val+" ");
		}
	}
	public static int[] sumrow(int [][] arr) {
		int [] temp=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				temp[i]+=arr[i][j];
			}
		}
		return temp;
	}
	
	public static int[] sumcolumn(int [][] arr) {
		int [] temp=new int[arr[0].length];
		for(int i=0;i<arr[0].length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				temp[i]+=arr[j][i];
			}
		}
		return temp;
	}
	
	public static void acceptDataDynamic(int[][]a)
	{
		
			Scanner sc = new Scanner(System.in);
		for(int i=0;i<a.length;i++)	
		{

			System.out.println("enter no col");
			int c=sc.nextInt();
			a[i]=new int [c];
			for(int j=0;j<c;j++)
			{
				System.out.println("enter data "+i+"   "+j);
				a[i][j]=sc.nextInt();
			}
		}
		sc.close();
	}
}
