package com.demo.test;

import com.demo.beans.SingleLinkedList;

public class TesthHashing {

	public static void main(String[] args) {
		SingleLinkedList [] hashtab = new SingleLinkedList[5];
		
		for(int i=0;i<hashtab.length;i++) {
			hashtab[i] = new SingleLinkedList();
		}
		int[] arr= {25,11,12,15,8,45,23,78,34};
		for(int i=0;i<arr.length;i++) {
			int pos=arr[i]%hashtab.length;
			hashtab[pos].addatfirst(arr[i]);
		}
		
		for(int i=0;i<hashtab.length;i++) {
			hashtab[i].displaydata();
		}
		int searchnum=23;
		int pos=(searchnum)%hashtab.length;
		boolean status=hashtab[pos].search(searchnum);
		System.out.println(status);
        

	}

}
