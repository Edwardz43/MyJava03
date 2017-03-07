package tw.org.iii;

import java.util.Scanner;

public class ed03 {
	
	private static int gcd(int m, int n){
		if(n == 0){
			return m;
		}else{
			return gcd(n, m % n);
		}		
	}
	
	private static int lcm(int m, int n){
		return (m * n /gcd(m, n));
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers :");
		System.out.print("m=");
		int m = scan.nextInt();
		
		System.out.print("n=");
		int n = scan.nextInt();
		
		System.out.println("GCD:" + (gcd(m, n)));
		System.out.println("LCM:" + (lcm(m, n)));
	}
}
