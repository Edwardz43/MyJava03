package tw.org.iii;

import java.util.Scanner;

public class Ed09 {

	public static void main(String[] args) {
		
		int ans = (int)(Math.random()*100);
		while(true){
			System.out.print("Enter Number :");
			Scanner scan = new Scanner(System.in);
			int guess = scan.nextInt();
			
			if(ans > guess){
				System.out.println("Too small !");
			}else if(ans < guess){
				System.out.println("Too big !");
			}else{
				System.out.println("Bingo !");
				break;
			}
		}
	}
}
