package com.demo.test;

import java.util.Scanner;

public class SearchData {

	public static void acceptdata(int[] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter Number"+(i+1));
			arr[i]=sc.nextInt();
		}
	}
	
	private static int linearsearch(int[] arr, int search) {
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]==search) {
				return i;
			}
		}
		return -1;
	}
	
	
	private static int binarysearch(int[] arr, int search) {
		int first=0,last=arr.length-1;
		while(first<=last) {
			int mid=(first+last)/2;
			if(arr[mid]==search) {
				return mid;
			}
			else if(arr[mid]<search) {
				first=mid+1;
			}
			else {
				last=mid-1;
			}
		}
		return -1;
	}
	
	private static int binarySearchRecursion(int i, int j, int[] arr, int search) {
		if(i>=j) {
			return -1;
		}
		else
		{
			int mid=(i+j)/2;
			if(arr[mid]==search)
			{
				return mid;
			}
			else if(arr[mid]<search)
			{
				return binarySearchRecursion(mid+1,j,arr,search);
			}
			else
			{
				return binarySearchRecursion(i,mid-1,arr,search);
			}
		}
	
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr=new int[5];
		acceptdata(arr);
		System.out.println("Enter Element to search:");
		int search=sc.nextInt();
//		int pos=linearsearch(arr,search);
//		System.out.println(pos);
		//int pos=binarysearch(arr,search);
		//System.out.println(pos);
	int pos=binarySearchRecursion(0,arr.length,arr,search);
	System.out.println(arr.length);
	System.out.println(pos);
	}

	

	
	

}
