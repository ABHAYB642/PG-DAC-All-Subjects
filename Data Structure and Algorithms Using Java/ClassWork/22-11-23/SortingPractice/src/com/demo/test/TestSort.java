package com.demo.test;

import java.util.Arrays;

import com.demo.service.SortClass;

public class TestSort {

	public static void main(String[] args) {
		int []arr= {5,2,7,8,1,3};
		System.out.println("Original Array is:-");
		System.out.println(Arrays.toString(arr));
		SortClass.Sort(arr);
		
	}
	

}
