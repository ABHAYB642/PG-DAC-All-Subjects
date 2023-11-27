package assignAddRECurssiveAndSorting;

import java.util.Scanner;

public class Febonacii {
    static int n1=0,n2=1,n3=0;
	public static void fibo(int count) {
	
	if(count>0) {
	n3=n1+n2;
	n1=n2;
	n2=n3;
	System.out.print(","+n3);
	fibo(count-1);
	}
}	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(n1+","+n2);
		fibo(n-2);
		}
	
}
