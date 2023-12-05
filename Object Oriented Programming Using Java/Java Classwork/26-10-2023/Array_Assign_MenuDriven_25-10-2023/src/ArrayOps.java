import java.util.Scanner;

public class ArrayOps {
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
	public static int[][] addArr(int [][]a,int [][]b){
		int [][]temp=new int[3][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				temp[i][j]=a[i][j]+b[i][j];
			}
		}
		return temp;
	}
	
	public static int Minele(int [][]a) {
		int min=a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if (a[i][j]<min) {
					min=a[i][j];
				}
			}
		}return min;
	}
	
	public static int Maxele(int [][]a) {
		int max=a[0][0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if (a[i][j]>max) {
					max=a[i][j];
				}
			}
		}return max;
	}
	
	public static int Countele(int [][]a,int v) {
		int cnt=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if (a[i][j]==v) {
					cnt++;
				}
			}
		}return cnt;
	}
	
	public static int[][] TransposeArr(int [][]a) {
	int [][] temp=new int[3][3];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			temp[i][j]=a[j][i];
		}
	}
	return temp;	
}
}
