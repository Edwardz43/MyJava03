package tw.org.iii;

import java.util.Scanner;

public class ed03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers :");
		System.out.print("m = ");
		double m = scan.nextInt();
		
		System.out.print("n =");
		double n = scan.nextInt();
		
		System.out.println("GCD :" + (int)(gcd(m, n)));
		System.out.println("LCM :" + (int)(lcm(m, n)));
	}
	private static double gcd(double m, double n){
		if(n == 0){
			return m;
		}else{
			return gcd(n, m % n);
		}		
	}
	
	private static double lcm(double m, double n){
		return (m * n /gcd(m, n));
	}
}
