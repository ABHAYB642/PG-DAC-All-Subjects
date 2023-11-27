package assignAddRECurssiveAndSorting;

import java.util.Scanner;

public class Factorial {
	
	public static int factorialRe(int num) {
		
		if(num==0)
			return -1;
		else if(num==1)
			return 1;
		else {
		return num *factorialRe(num-1);
		}
	}
	
	public static void main(String[] args) {
		
	   Scanner sc = new Scanner(System.in);
	   int num = sc.nextInt();
	   int fact = factorialRe(num);
	   System.out.println(fact);
	}

	
}
