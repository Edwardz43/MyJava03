package tw.org.iii;

import java.util.Scanner;

public class Ed13_fee {
public static void main(String[] args){	
	System.out.printf("請輸入時間, 格式 hh mm(以空格分開) :");
	Scanner scan = new Scanner(System.in);
	int t1 = scan.nextInt();
	int t2 = scan.nextInt();
	
	int time = (t1 * 60 + t2);
	
	System.out.println(fee(time));
}


private static int fee(int TIME){
	if(TIME > 1500){
		int fee = (int)(TIME * 0.9 * 0.79) + 1;
		return fee;
	}else if(TIME > 800 && TIME <= 1500){
		int fee = (int)(TIME  * 0.9 *0.9) + 1;
		return fee;
	}else{
		int fee = (int)(TIME * 0.9) + 1;
		return fee;
	}
}
}
