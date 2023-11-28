package Hashing;

import java.util.Scanner;

public class testHashing {
	public static void main(String[] args) {
		singleLinkedList[] hashArr=new singleLinkedList[7];
		int[] arr= {23,45,34,54,77,38,92};
		for(int i=0; i < hashArr.length; i++) {
			hashArr[i]=new singleLinkedList();
		}
		for(int i=0; i < arr.length; i++) {
			int index=arr[i]%arr.length;
			hashArr[index].addAtStart(arr[i]);
		}
		for(int i=0; i < hashArr.length; i++) {
			hashArr[i].displaydata();
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to search");
		int numSearch=sc.nextInt();
		int idx=numSearch%arr.length;
		hashArr[idx].search(numSearch);
		
	}
}
