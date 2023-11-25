package com.demo.test;

import com.demo.beans.MyStack;

public class TestStackArray {

	public static void main(String[] args) {
		MyStack s=new MyStack(3);
		//s.pop();
		//boolean status=s.push(10);
        //System.out.println(s.push(10));
//		int x=s.pop();
//		System.out.println(x);
        System.out.println(s.push(10));
        System.out.println(s.push(20));
        System.out.println(s.push(30));
        int x=s.pop();
         System.out.println(x);
	}

}
