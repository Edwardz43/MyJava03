package tw.org.iii;

import java.util.Scanner;

public class ed03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers :");
		System.out.println("m = ");
		int m = scan.nextInt();
		
		System.out.println("n =");
		int n = scan.nextInt();
		
		System.out.println("GCD :" + gcd(m, n));
		System.out.println("LCM :" + (m * n / gcd(m, n)));
	}
	private static int gcd(int m, int n){
		if(n == 0){
			return m;
		}else{
			return gcd(n, m % n);
		}
		
	}
}
