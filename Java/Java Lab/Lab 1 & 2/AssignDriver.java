package Lab1;

public class AssignDriver {

	public static boolean ifPrime(int num1) {
		int ct = 0;
		for(int i=2;i<=(num1)/2;i++) {
			if(num1 % i != 0) {
				ct++;
			}
		}
		if(ct == (num1/2)-1) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void displayTable(int num) {
		int i = 1;
		while(i<=10) {
			System.out.println((num)+" * "+(i)+" = "+(num*i));
			i++;
		}
	}

	public static void printDiamond(int ht) {
		if(ht % 2 == 0) {
			ht-=1;
		}
		for(int i = 1;i<=ht/2;i++) {
			for(int j =i;j<=ht/2;j++) {
				System.out.print(" ");
			}
			for(int k = (i*2)-1 ;k != 0;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = ht/2;i<ht;i++) {
			for(int j =ht/2;j<i;j++) {
				System.out.print(" ");
			}
			for(int k = i;k < (ht*2)-i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
