import java.util.Arrays;
public class quickSortString {
	

		public static void main(String[] args) {
			String []arr= {"abhay","sujit","dyan","sakshi"};
			System.out.println(Arrays.toString(arr));
			quicksort(arr,0,arr.length-1);
			System.out.println(Arrays.toString(arr));
		}
		

		private static void quicksort(String[] arr, int start, int end) {
			if(start<end)
			{
				int p=partition(arr,start,end);
				quicksort(arr,start,p-1);
				quicksort(arr,p+1,end);
				
			}	
		}

		private static int partition(String[] arr, int start, int end) {
			
			int pivot = start;
			Integer i=start;
			Integer j=end;
			
			while(i<j) {
				while(Integer.compare(i,end)==-1 && (arr[i].compareTo(arr[pivot])==-1 || arr[i].compareTo(arr[pivot])==-1)) {
					i++;
				}
				while(Integer.compare(j,pivot)==1 && arr[i].compareTo(arr[pivot])==1 ) {
					j--;
				}
			
				if(i<j) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
			String temp=arr[j];
			arr[j]=arr[pivot];
			arr[pivot]=temp;
			
			return j;
		}
	}


