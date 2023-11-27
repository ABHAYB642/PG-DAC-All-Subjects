package assignAddRECurssiveAndSorting;

import java.util.Arrays;

public class Testmerge {

	public static void main(String[] args) {
		
		int[] arr = {65,25,45,1,45,78};
		System.out.println(Arrays.toString(arr));
		mergesort(arr,0,arr.length);
	}

	private static void mergesort(int[] arr, int start, int end) {
		if(start<end)
		{
		
			int mid=(start+end)/2;
			mergesort(arr,start,mid);
			mergesort(arr,mid+1,end);
			merge(arr,start,end,mid);
	}
	
}

	private static void merge(int[] arr, int start, int end, int mid) {
		int i,j,k;
		int temp=0;
		int n1=mid-start+1;
		int n2=end-mid;
		
		int[] leftarr = new int[n1];
		int[] rightarr=new int[n2];
		
		for(i=0;i<n1;i++)
		{
			leftarr[i]=arr[start+i];
		}
		for(i=0;i<n2;i++)
		{
			rightarr[i]=arr[mid+i+1];
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
		  }
			else

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
	