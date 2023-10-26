import java.util.Scanner;

public class ArrayService {

	
	public static void acceptData(int []a) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter The Array Element "+(i+1));
			a[i]=sc.nextInt();
			
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
	public static int findSum(int []a)
	{
		int s=0;
//		for(int i=0;i<a.length;i++)
//		{
//			s=s+a[i];
//		}
		//for each
		for(int val:a) {
			s=s+val;
		}
		return s;
	}
	public static int[] findAllGreaterValue(int []a,int v)
	{
		int temp []=new int [a.length];
		int cnt=0;
		for(int val:a)
		{
			if(val>v) {
				temp[cnt]=val;
				cnt++;
			}
		}
		for(int i=cnt;i<temp.length;i++)
		{
			temp[cnt]=-1;
		}
		return temp;
	}
	public static int SearchValue(int []a,int v) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==v) {
				return i;
			}
		}
		return -1;
	}
}
