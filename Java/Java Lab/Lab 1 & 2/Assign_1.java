package Lab1;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Assign_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opt;
		do {
			System.out.println("Select one option :");
			System.out.println("1. Print Table\n2. Prime Number\n3. Display diamond pattern\n4.Exit");
			opt = sc.nextInt();
			switch (opt) {
				case 1:
					System.out.print("Enter a number to view table : ");
					int num = sc.nextInt();
					AssignDriver.displayTable(num);
					break;
					
				case 2 :
					System.out.print("Enter a number to check prime or not : ");
					int num1 = sc.nextInt();
					boolean ans = AssignDriver.ifPrime(num1);
					if(ans) {
						System.out.println(num1+" is a prime number!!");
					}
					else {
						System.out.println(num1+" is not a prime number!!");
					}
					break;
					
				case 3 :
					System.out.print("Enter height of diamond : ");
					int ht = sc.nextInt();
					AssignDriver.printDiamond(ht);
					System.out.println();
					break;
					
				case 4 :
					System.out.println("Bye.....");
					System.exit(0);
					
				default:
					System.out.println("Select correct option!!!");
					break;
			}
		} while (opt!=4);
		
	}

}
