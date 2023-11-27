package assignAddRECurssiveAndSorting;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TestMergeSort {

	public static void main(String[] args) {
		int[] arr1= {5,7,10,12,30};
		int[] arr2= {8,9,10,12,15,18,35,45};
		int[] arr3=new int[arr1.length+arr2.length];
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1.Merge Sort in Ascending Order\n2.Merge Sort in Descending Order\n 3.exit \n  choice--> ");
			choice=sc.nextInt();
			switch(choice){
				case 1:
					MergeSortAsc(arr1,arr2,arr3);
					System.out.println("After Sort(Ascending):");
					System.out.println(Arrays.toString(arr3));
					break;
				case 2:
					MergeSortDesc(arr1,arr2,arr3);
					System.out.println("After Sort(Descending):");
					System.out.println(Arrays.toString(arr3));
					break;
				case 3:
					sc.close();
					System.out.println("Thank you for visiting...");
					break;
			}
		}while(choice!=3);
		
		
	}

	private static void MergeSortDesc(int[] arr1, int[] arr2, int[] arr3) {
		int i=arr1.length-1,j=arr2.length-1,k=0;
		while(i>=0&& j>=0) {
			if(arr1[i]>arr2[j]) {
				arr3[k]=arr1[i];
				i--;
				k++;
			}
			else {
				arr3[k]=arr2[j];;
				j--;
				k++;
			}
		}
		while(i>=0) {
			arr3[k]=arr1[i];
			i--;
			k++;
		}
		while(j>=0) {
			arr3[k]=arr2[j];
			j--;
			k++;
		}
		
	}

	private static void MergeSortAsc(int[] arr1, int[] arr2, int[] arr3) {
		int i=0,j=0,k=0;
		while(i<arr1.length&& j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				arr3[k]=arr1[i];
				i++;
				k++;
			}
			else {
				arr3[k]=arr2[j];;
				j++;
				k++;
			}
		}
		while(i<arr1.length) {
			arr3[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			arr3[k]=arr2[j];
			j++;
			k++;
		}
		
	}

}
