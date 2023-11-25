package com.demo.test;

import java.util.Arrays;

public class TestMergeSort {
	public static void main(String[] args) {
		int[] arr= {65,35,26,13,23,12,91};
		System.out.println(Arrays.toString(arr));
		mergeSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr, int start, int end) {
		if(start<end) {
			int mid=(start+end)/2;
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
			merge(arr,start,end,mid);
		}
		
	}

	private static void merge(int[] arr, int start, int end, int mid) {
		int n1=mid-start+1;
		int n2=end-mid;
		int [] leftarray=new int[n1];
		int [] rightarray=new int[n2];
		for(int i=0;i<n1;i++)
		{
			leftarray[i]=arr[start+i];
		}
		for(int i=0;i<n2;i++)
		{
			rightarray[i]=arr[mid+1+i];
		}
		int i=0;
		int j=0;
		int k=start;
		while(i<n1 && j<n2) {
			if(leftarray[i]<rightarray[j]) //for desc leftarray[i]>rightarray[j]
			{
				arr[k]=leftarray[i];
				i++;
				k++;
			}
			else {
				arr[k]=rightarray[j];
				j++;
				k++;
			}
			
		}
		while(i<n1) {
			arr[k]=leftarray[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=rightarray[j];
			j++;
			k++;
		}
		//System.out.println(Arrays.toString(arr));
	}
}
