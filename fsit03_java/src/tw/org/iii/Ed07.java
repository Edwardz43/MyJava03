package tw.org.iii;

import java.util.Scanner;

public class Ed07 {

	public static void main(String[] args) {
		
		System.out.println("Enter Number :");
		
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		
		fib(i);
	}
	
	private static void fib(int i){	
		int[] fib = new int[i];
		
		for(i = 0; i < fib.length; i++){
			if(i == 0){
				fib[i] = 0;
			
			}else if(i == 1){
				fib[1] = 1;
			
			}else{
				fib[i] = fib[i - 2] + fib[i - 1];
			}
			
			System.out.printf(fib[i] + " ");
		}
	}

}
