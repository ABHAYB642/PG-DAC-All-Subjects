package assignAddRECurssiveAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
	int[] arr= {5,2,7,8,1,3};
	System.out.println("Given Array:");
	System.out.println(Arrays.toString(arr)+"\n");
	
	int choice;
	Scanner sc=new Scanner(System.in);
	do {
		System.out.println("1.Bubble Sort in Ascending Order\n2.Bubble Sort in Descending Order\n 3.exit \n  choice--> ");
		choice=sc.nextInt();
		switch(choice){
			case 1:
				bubbleSort(arr);
				System.out.println("After Sort(Ascending):");
				System.out.println(Arrays.toString(arr));
				break;
			case 2:
				bubbleSortDesc(arr);
				System.out.println("After Sort(Descending):");
				System.out.println(Arrays.toString(arr));
				break;
			case 3:
				sc.close();
				System.out.println("Thank you for visiting...");
				break;
		}
	}while(choice!=3);
	
	

	}

	private static void bubbleSortDesc(int[] arr) {
		
		int n=arr.length;
		int temp=0;
		boolean flag;
		int cnt=0;
		for(int i=0;i<n;i++) {
			flag=false;
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=true;
			}
		}
			cnt++;
			System.out.println("Count is:"+cnt);
		System.out.println(Arrays.toString(arr));
		if(!flag)
			break;
		
		}		
	}
	

	private static void bubbleSort(int[] arr) {
		int n=arr.length;
		int temp=0;
		boolean flag;
		int cnt=0;
		for(int i=0;i<n;i++) {
			flag=false;//The boolean variable is used to check whether 
		              	//the values are swapped at least once in the inner loop
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=true;
			}
		}
			cnt++;
			System.out.println("Count is:"+cnt);
		System.out.println(Arrays.toString(arr));
		if(!flag)
			break;
		
		}		
	}

}
