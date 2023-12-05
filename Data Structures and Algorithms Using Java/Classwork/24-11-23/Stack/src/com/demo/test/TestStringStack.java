package com.demo.test;

//import java.util.Arrays;
import java.util.Scanner;

import com.demo.beans.MyStackString;

public abstract class TestStringStack {

	public static void main(String[] args) {
		MyStackString s=new MyStackString(100);
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
       String s1=sc.nextLine();
       String [] str=new String[100];
       str=s1.split(" ");
       
//       System.out.println(Arrays.toString(str));
       for(int i=0;i<3;i++) {
    	   s.push(str[i]);
       }
       System.out.println(s.pop()+" "+s.pop()+" "+s.pop());
       sc.close();
	}
}
