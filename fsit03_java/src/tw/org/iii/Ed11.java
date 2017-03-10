package tw.org.iii;

import java.util.Scanner;

public class Ed11 {
		
	private static char draw(int i){	
		return '*';
	}
//	draw方法  畫星星 
	
	
	public static void loop(int input){	//改造成loop方法  練習一下
		for(int i = 1; i < input; i++){
			System.out.printf(String.format("%%%ds", (input - i) * 2), "");//這段不太了解  是看書上的範例  
			for(int j = 1; j <= i; j++){//主要是算出每行前面要空幾格讓形狀對齊
				System.out.printf("%4s", draw(j));//呼叫draw方法  畫星星  %4s讓每行的星星間隔一樣
			}	
			System.out.println();	
		}
		//畫出1~N層
		
		for(int i = input - 2; i > 0; i--){              //反過來畫 所以迴圈的順序想了一下 讓他顛倒
			System.out.printf(String.format("%%%ds", (input - i) * 2), "");
			for(int j = 1; j <= i; j++){
				System.out.printf("%4s", draw(j));
			}	
			System.out.println();	
		}
		//畫出反方向的(N-1)~1層	
	}
	
	
	public static void main(String[] args) {   //主要方法  
		System.out.print("輸入大小:");
		Scanner scan = new Scanner(System.in);
		int INPUT = scan.nextInt() + 1;
		//決定圖形的大小 每邊有幾個*
		loop(INPUT);
	}
	
}
