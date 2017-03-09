package tw.org.iii;

import java.util.Scanner;

public class Fee {

	public static void main(String[] args) {
		System.out.printf("請輸入時間, 格式 hh rr hh rr(以空格分開) :");
		Scanner scan = new Scanner(System.in);
		int t1 = scan.nextInt();
		int t2 = scan.nextInt();
		int t3 = scan.nextInt();
		int t4 = scan.nextInt();
		
		int time = (t3 * 60 + t4) - (t1 * 60 + t2);
		
		System.out.println(fee(time));
	}
	
	
	private static int fee(int TIME){
		if(TIME > 240){
			int fee = 280 + (TIME - 240) / 30 * 60;
			return fee;
		}else if(TIME > 120 && TIME <= 240){
			int fee = 120 + (TIME - 120) /30 * 40;
			return fee;
		}else{
			int fee = (TIME / 30)* 30;
			return fee;
		}
	}	
	

}
