package com.demo.service;

import java.util.Arrays;
import java.util.Scanner;

public class SortClass {

	public static void Sort(int[] arr) {
		int ch;
		do {
			System.out.println("1.Bubble Sort Ascending \n2.Bubble Sort Descending \n3.Selection Sort ascending\n4.Selection sort descending\n5.Insertion Sort ascending \n6.Insertion Sort descending\n7.Exit ");
			System.out.println("Enter choice");
			int n = arr.length;
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				// i for iterate
				int cnt=0;
	
				for (int i = 0; i < n; i++) {
					// j for swap
					int swap=0;
					boolean flag=false;
					for (int j = 0; j < n - i - 1; j++) {
						
						if (arr[j] > arr[j + 1]) {
							//System.out.println("@@@@");
							int temp = arr[j];
							arr[j] = arr[j + 1];
							arr[j + 1] = temp;
							flag=true;  
							swap++;
						}
					}
					if(!flag) {
						break;
					}
					System.out.println(Arrays.toString(arr));
					cnt++;
					System.out.println("No of swap = " + swap);
				}
				System.out.println("No of passes = " + cnt);
				
				break;
			case 2:

				// i for iterate
				for (int i = 0; i < n; i++) {
					// j for swap
					for (int j = 0; j < n - i - 1; j++) {
						if (arr[j] < arr[j + 1]) {
							int temp = arr[j];
							arr[j] = arr[j + 1];
							arr[j + 1] = temp;
						}
					}
				}
				System.out.println(Arrays.toString(arr));
				break;
				
				
			case 3:
				for(int i=0;i<n-1;i++) {
					int min_idx=i;

					for(int j=i+1;j<n;j++) {
						if(arr[j]<arr[min_idx]) {
							min_idx=j;
						}
					}
					int temp=arr[i];
					arr[i]=arr[min_idx];
					arr[min_idx]=temp;
//					System.out.println(Arrays.toString(arr));
				}
				
				System.out.println(Arrays.toString(arr));
				break;
				
			case 4:
				for(int i=0;i<n-1;i++) {
					int max_idx=i;
					for(int j=i+1;j<n;j++) {
						if(arr[j]>arr[max_idx]) {
							max_idx=j;
						}
					}
					int temp=arr[i];
					arr[i]=arr[max_idx];
					arr[max_idx]=temp;
					//System.out.println(Arrays.toString(arr));
				}
				
				System.out.println(Arrays.toString(arr));
				break;
			case 5:
					//i represents begining of unsorted portion
					for(int i=1;i<n;i++) {
						int key=arr[i]; //the data to be inserted into sorted part
						int j=i-1;      //end of sorted portion
						//move the elements of arr[0..i-1], that are > key
						//one location on the right side
						//till j>0
						for(;j>=0 && arr[j]>key;j--) {
							arr[j+1]=arr[j];
						}
						arr[j+1]=key;//assign the key in the sorted part
						System.out.println(Arrays.toString(arr));
					}
					
				
				break;
			case 6:
				//i represents begining of unsorted portion
				for(int i=1;i<n;i++) {
					int key=arr[i]; //the data to be inserted into sorted part
					int j=i-1;      //end of sorted portion
					//move the elements of arr[0..i-1], that are > key
					//one location on the right side
					//till j>0
					for(;j>=0 && arr[j]<key;j--) {
						arr[j+1]=arr[j];
					}
					arr[j+1]=key;//assign the key in the sorted part
					System.out.println(Arrays.toString(arr));
				}
				break;
			case 7:
				System.out.println("Exited");
				sc.close();
				//System.out.println(Arrays.toString(arr));
				break;
			default:
				System.out.println("Enter correct choice");
			}
		} while (ch != 7);

	}

	

}
