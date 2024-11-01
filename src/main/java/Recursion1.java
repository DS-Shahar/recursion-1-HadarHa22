import java.util.*;
public class Recursion1 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		//System.out.println(*enter name of method*(num));
		System.out.println(isPrime(10,2));
	}
	
	// q1
	public static int add(int n) {
		if (n==0) {
			return 0;
		}
		return n+add(n-1);
	}
	
	// q2
	public static int f(int n) {
		if (n==0) {
			return 1;
		}
		return n*f(n-1);
	}
	// q3
	public static int mul(int n) {
		if (n < 1) {
			return 1;
		}
		if (n%2!=0) {
			return n*mul(n-2);
		}
		return mul(n-1);
	}
	
	// q4
	public static int count(int n, int counter) {
		if (n==0) {
			return counter;
		}
		return count(n/10,counter+1);
	}
	
	//q5
	public static int div(int a, int b, int count) {
		if(a<b) {
			return count;
		}
		return div(a-b,b,count);
	}
	
	// q6
	public static double modo(int a, int b) {
		if(a<b) {
			return a;
		}
		return modo(a-b,b);
	}
	
	// q7
	public static boolean isKfo(int x, int y) {
		if (x==0) {
			return false;}
		if (y==0) {
			return true;}
		if (x<y) {
			return false;}
		return isKfo(x-y,y);
	}
	
	// q8
	public static boolean isPrime(int n, int d) {
		if (n<=1) {
			return false;
		}
		if (d>Math.sqrt(n)) {
			return true;
		}
		if (n%d==0) {
			return false;
		}
		return isPrime(n,d+1);
	}
	
	
	
	
}
