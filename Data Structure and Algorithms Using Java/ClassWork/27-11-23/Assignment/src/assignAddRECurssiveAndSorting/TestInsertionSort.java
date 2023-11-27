package assignAddRECurssiveAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class TestInsertionSort {

	public static void main(String[] args) {
		int[] arr= {65,35,26,13,23,12,91};
		System.out.println("Given Array:");
		System.out.println(Arrays.toString(arr)+"\n");
		
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1.Insertion Sort in Ascending Order\n2.Insertion Sort in Descending Order\n 3.exit \n  choice--> ");
			choice=sc.nextInt();
			switch(choice){
				case 1:
					InsertionSortAsc(arr);
					System.out.println("After Sort(Ascending):");
					System.out.println(Arrays.toString(arr));
					break;
				case 2:
					InsertionSortDesc(arr);
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

	private static void InsertionSortDesc(int[] arr) {
		
		int n=arr.length;
		//i represents begining of unsorted portion
		for(int i=1;i<n;i++) {
			int key=arr[i];//the data to be inserted into sorted part
			int j=i-1; //end of sorted portion
			//move the elments of arr[0...i-1],that are >key
			//one location on the right side till j>=
			for(;j>=0 && arr[j]<key;j--) {
			arr[j+1]=arr[j];	
			}
			arr[j+1]=key; //assign key to the sorted array
			System.out.println(Arrays.toString(arr));
			
		}
	}

	private static void InsertionSortAsc(int[] arr) {
		int n=arr.length;
		//i represents begining of unsorted portion
		for(int i=1;i<n;i++) {
			int key=arr[i];//the data to be inserted into sorted part
			int j=i-1; //end of sorted portion
			//move the elments of arr[0...i-1],that are >key
			//one location on the right side till j>=
			for(;j>=0 && arr[j]>key;j--) {
			arr[j+1]=arr[j];	
			}
			arr[j+1]=key; //assign key to the sorted array
			System.out.println(Arrays.toString(arr));
			
		}
		
	}

}
