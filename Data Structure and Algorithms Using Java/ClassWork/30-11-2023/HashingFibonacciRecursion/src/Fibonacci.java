import java.util.HashMap;
public class Fibonacci {
	private static HashMap<Integer,Long> memo=new HashMap<> ();
	
	public static void main (String[] args) {
		 int n=4;
		 long result=fibonacci(n);
		 System.out.println("Fibonacci"+"-"+n+" "+"="+result);
	}
	private static long fibonacci(int n) {
		
		if(n<0) {
			throw new IllegalArgumentException("I/P must be non negative integer");
		}
		if(memo.containsKey(n)) {
			return memo.get(n);
		}
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		
		long result=fibonacci(n-1)+fibonacci(n-2);
		memo.put(n,result);
		return result;
	}
	

}

