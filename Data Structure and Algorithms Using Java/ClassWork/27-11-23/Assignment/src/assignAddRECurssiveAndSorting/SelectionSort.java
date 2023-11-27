package assignAddRECurssiveAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	
		public static void main(String[] args) {
			int[] arr= {65,35,26,13,23,12,91};
			System.out.println("Given Array:");
			System.out.println(Arrays.toString(arr)+"\n");
			
			int choice;
			Scanner sc=new Scanner(System.in);
			do {
				System.out.println("1.Selection Sort in Ascending Order\n2.Selection Sort in Descending Order\n 3.exit \n  choice--> ");
				choice=sc.nextInt();
				switch(choice){
					case 1:
						SelectionSortAsc(arr);
						System.out.println("After Sort(Ascending):");
						System.out.println(Arrays.toString(arr));
						break;
					case 2:
						SelectionSortDesc(arr);
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

		private static void SelectionSortDesc(int[] arr) {
			int n=arr.length;
			boolean flag;
			for(int i=0;i<n-1;i++) {
				int minInd=i;//i th element is smallest assume
				flag=false;
				for (int j=i+1;j<n;j++) {
					if(arr[j]>arr[minInd]) {
						minInd=j;//check smallest element in array and put in minInd
                        flag=true;					
					}
				}
				//put smallest element at i th location
				int temp=arr[i];
				arr[i]=arr[minInd];
				arr[minInd]=temp;
				System.out.println(Arrays.toString(arr));
				if(!flag)
					break;
				
			}
			
		}

		private static void SelectionSortAsc(int[] arr) {
			int n=arr.length;
			boolean flag;
			for(int i=0;i<n-1;i++) {
				int minInd=i;//i th element is smallest assume
				flag=false;
				for (int j=i+1;j<n;j++) {
					if(arr[j]<arr[minInd]) {
						minInd=j;//check smallest element in array and put in minInd
                        flag=true;					
					}
				}
				//put smallest element at i th location
				int temp=arr[i];
				arr[i]=arr[minInd];
				arr[minInd]=temp;
				System.out.println(Arrays.toString(arr));
				if(!flag)
					break;
				
			}
			
			
		}
	}


