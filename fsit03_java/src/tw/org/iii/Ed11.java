package tw.org.iii;

import java.util.Scanner;

public class Ed11 {
	
	private static String draw(){
		System.out.print("*");	
		return "";
	}
	//draw方法  畫星星
	
	public static void main(String[] args) {
		System.out.print("輸入大小:");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt() + 1;
		//決定圖形的大小 每邊有幾個*
		
		for(int i = 1; i < input; i++){
			System.out.printf(String.format("%%%ds", (input - i) * 3), "");//這段不太了解  是看書上的範例  
			for(int j = 0; j < i; j++){									   //主要是算出每行前面要空幾格讓形狀對齊
				System.out.printf("%5s", draw());//呼叫draw方法  畫星星  %5s讓每行的星星間隔一樣
			}	
			System.out.println();	
		}
		//畫出1~N層
		
		
		for(int i = input - 2; i > 0; i--){              //反過來畫 所以迴圈的順序想了一下 讓他顛倒
			System.out.printf(String.format("%%%ds", (input - i) * 3), "");
			for(int j = 0; j < i; j++){
				System.out.printf("%5s", draw());
			}	
			System.out.println();	
		}
		//畫出反方向的(N-1)~1層
	}	
}
