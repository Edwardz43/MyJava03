package tw.org.iii;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ed17_calender {
	/*	keypoint:
	 * 	利用其中的資料 https://goo.gl/nKAXwX 找出y年m月的第一天
	 *  然後延伸至整個月!
	 *  W=(d + [2.6*m -0.2]+5*(y%4)+3*y+5*(c%4))%7  
	 *  c:世紀-1
	 *  y:年分後兩位(1,2月y-1)
	 *  m:月份-2 (1,2月 =>11,12)
	 *  d:日期
	*/
	static void result(int w, int d){
		int[] day = new int[d];
		for(int i=0;i<day.length;i++){
			day[i]=i;
		}
		for(int i=0;i<w;i++){
			System.out.print("\t");
		}	
		for(int i=0;i<7-w;i++){
			System.out.print(day[i]+1+"\t");
		}
		System.out.println();
		for(int i=0;i<day.length-8+w;i++){
			System.out.print((i+1)%7==0?day[i]+8-w+"\t"+"\n":day[i]+8-w+"\t");
		}
	}
	
	static int week(int y, int m){
		int C = y/100;
		int Y = (y%100);
		int M = m-2;
		if(m==1){
			Y=Y-1;
			M=11;
		}
		if(m==2){
			Y=Y-1;
			M=12;
		}
		int W =(1 + (int)(2.6*M -0.2)+5*(Y%4)+3*Y+5*(C%4))%7;
		return W;
	}

	static boolean learyear(int year, int month){
		boolean learyear = true;
		if(year % 4 ==0){
			if(year % 100 == 0){
				if(year % 400 == 0){
					return true;
				}else{
					return false;
				}
			}else{
				return true;
			}
		} 
	    return false;
	}
	
	public static void main(String[] args) {
		System.out.println("請輸入日期:\n(格式:yyyy mm)");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int month = scan.nextInt();
		int w = week(year,month);
		int d = 30;
		
		if(learyear(year, month)){
			d = 29;
		}
		
		
		String[] week = {"日","一","二","三","四","五","六"};
		for(String v :week){
			System.out.print(v+"\t");
		}
		System.out.println();
		result(w,30);
//		String[] week = {"日","一","二","三","四","五","六"};
//		for(String v :week){
//			System.out.print(v+"\t");
//		}
	}
}
//int[] year = new int [360];
//for(int i=0; i<year.length;i++){
//	year[i]= i;
//}
//	
////切割  撲克牌的延伸
//int[][]date = new int[12][30];
//for(int i=0;i<year.length;i++){
//	date[i/30][i%30]=year[i];
//}
//
//for(int[] ds:date){
//	for(int d :ds){
//		System.out.print((d%30+1)+"\t");
//		if((d+1)%7==0){
//			System.out.println();
//		}
//	}
//	System.out.println("\n-------   分隔線      ---------");
//}