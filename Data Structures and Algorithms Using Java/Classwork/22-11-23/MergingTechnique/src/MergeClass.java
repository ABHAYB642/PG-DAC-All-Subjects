import java.util.Arrays;

public class MergeClass {
	
	public static void merge(int[] a1, int[] a2, int[] a3) {
		int i=0,j=0,k=0;
		while(i<a1.length && j<a2.length)
		{
			if(a1[i]<a2[j])
			{
				a3[k]=a1[i];
				i++;
				k++;
			}
			else {
				a3[k]=a2[j];
				j++;
				k++;
			}
		}
		while(i<a1.length) {
			a3[k]=a1[i];
			i++;
			k++;
		}
		while(j<a2.length)
		{
			a3[k]=a2[j];
			j++;
			k++;
		}
	}

	public static void main(String[] args) {
		int [] a2= {2,3,5,10,12,18,19,1,2,54,7};
		int [] a1= {1,6,9,20};
		int [] a3=new int[a1.length+a2.length];
		merge(a1,a2,a3);
		System.out.println("First Array is: "+Arrays.toString(a1));
		System.out.println("Second Array is: "+Arrays.toString(a2));
		System.out.println("Merged Array is: "+Arrays.toString(a3));

	}

	

}
