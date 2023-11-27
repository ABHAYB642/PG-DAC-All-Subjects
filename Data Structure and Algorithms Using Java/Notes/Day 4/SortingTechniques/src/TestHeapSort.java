import java.util.Arrays;

public class TestHeapSort {

	public static void main(String[] args) {
		int[] arr= {55,1,99,7,33,103};
	
		System.out.println("Given array :");
		System.out.println(Arrays.toString(arr));
		heapSort(arr);
		System.out.println("sorted Array : ");
		System.out.println(Arrays.toString(arr));

	}

	private static void heapSort(int[] arr) {
		int n=arr.length;
		//convert the array into max heap
		for(int i= n/2-1;i>=0;i--) {
			heapify(arr,n,i);
			System.out.println("heapSort : "+Arrays.toString(arr));
		} 
		// System.out.println(Arrays.toString(arr));
		
		for(int i=n-1;i>=0;i--) {
		int temp=arr[0];
		arr[0]=arr[i];
		 arr[i]=temp;
		 System.out.println("heapSort -2-: "+Arrays.toString(arr));
		 System.out.println("i----"+i+" ----n---"+n);
		 heapify(arr,i,0);
		 System.out.println("size:"+i);
		 System.out.println(Arrays.toString(arr));
		}
		
	}

	//arr is array, n number of elements in the array, 
	//index of root of the tree the one which we want to heapify
	private static void heapify(int[] arr, int n, int i) {
		System.out.println("aaaaaaaaaaaa");
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		if(l<n && arr[l]>arr[largest] ) {
			largest=l;
		}
		if(r<n && arr[r] >arr[largest]) {
			largest=r;                    
		}
		if(largest!=i) {
			int temp=arr[largest];
			arr[largest]=arr[i];
			arr[i]=temp;
			System.out.println("largest "+largest);
			System.out.println("array "+arr[largest]);
			heapify(arr,n,largest);
			
		}
		
	}

}
