package com.demo.test;

import com.demo.service.CmdService;

public class Testcmd {
	public static void main(String[] args) {
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);
	    int [] arr=new int[3];
	    arr[0]=num1;
	    arr[1]=num2;
	    arr[2]=num3;
	    for(int i=0;i<arr.length;i++) {
	    	boolean status=CmdService.isprime(arr[i]);
	    	if(status) {
	    		CmdService.printtable(arr[i]);
	    	}
	    	else {
	    		int ans=arr[i]/10;
	    		System.out.println(ans);
	    	}
	    }
	}
}
