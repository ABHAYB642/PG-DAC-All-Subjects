package assignAddRECurssiveAndSorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr = {65,34,26,12,23,12,91};
		System.out.println("Given Array");
		System.out.println(Arrays.toString(arr));
		mergesort(arr,0,arr.length-1);
		System.out.println("Sorted Array : ");
		System.out.println(Arrays.toString(arr));
	}

	private static void mergesort(int[] arr, int start, int end) {
		if(start<end) {
		int mid =(start+end)/2;
		mergesort(arr,start,mid);
		mergesort(arr,mid+1,end);
		merge(arr,start,end,mid);
		}
	}

	private static void merge(int[] arr, int start, int end, int mid) {
		int i,j,k;
		int n1=mid-start+1;
		int n2=end-mid;
		
		int[] leftarr=new int[n1];
		int[] rightarr=new int[n2];
		
		for(i=0; i<n1; i++)
		{
			leftarr[i]=arr[start+i];
		}
		for(i=0; i<n2;i++)
		{
			rightarr[i]=arr[mid+1+i];
		}
		i=0;
		j=0;
		k=start;
		while(i<n1 && j<n2)
		{
			if(leftarr[i]<rightarr[j])
			{
				arr[k]=leftarr[i];
				i++;
				k++;
			}else
			{
				arr[k]=rightarr[j];
				j++;
				k++;
			}
		}
		while(i<n1)
		{
			arr[k]=leftarr[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=rightarr[j];
			j++;
			k++;
		}
	System.out.println(Arrays.toString(arr));
	}
}
