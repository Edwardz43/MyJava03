package tw.org.iii;

import java.util.Scanner;

public class Ed12_pascal {
	
	private static int comb(int r, int n){  //數學公式  C(組合): r中取n的方法 巴斯卡三角的公式  先不管他
		int p = 0;
		for(int i = 0; i <= n; i++){  ////解決第一行和尾巴的1  加個判斷  
			if(i == 0 || r ==0){  
				p = 1;
			}else{
			p = p * (r- i + 1) / i;
			}
		}return p;
	}
	
	public static void loop(int input){	
		for(int i = 0; i <= input; i++){
			System.out.printf(String.format("%%%ds", (input - i + 1) * 3), "");  
			for(int j = 0; j <= i; j++){
				System.out.printf("%6s", comb(i,j));
			}	
			System.out.println();	
		}
		//畫出1~N層
		
		for(int i = input - 1; i >= 0; i--){              //反過來畫 所以迴圈的順序想了一下 讓他顛倒
			System.out.printf(String.format("%%%ds", (input - i + 1) * 3), "");
			for(int j = 0; j <= i; j++){
				System.out.printf("%6s", comb(i, j));
			}	
			System.out.println();	
		}
	}
	
	
	public static void main(String[] args) {   //主要方法  
		System.out.print("輸入大小:");
		Scanner scan = new Scanner(System.in);
		int INPUT = scan.nextInt();
		//決定圖形的大小 
		loop(INPUT);
	}

}
