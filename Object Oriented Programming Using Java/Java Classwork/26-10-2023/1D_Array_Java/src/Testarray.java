import java.util.Scanner;
public class Testarray {

	public static void main(String[] args) {
		int [] arr=new int[10];
		ArrayService.acceptData(arr);
		ArrayService.DisplayData(arr);
		int sum=ArrayService.findSum(arr);
		System.out.println("Sum of array elemets :"+sum);
		
		int val=5;
		int [] arr1=ArrayService.findAllGreaterValue(arr,val);
		ArrayService.DisplayData(arr1);
		int val1=7;
		int pos=ArrayService.SearchValue(arr, val1);
		System.out.println("Value at Index"+pos);
		
	}

}
