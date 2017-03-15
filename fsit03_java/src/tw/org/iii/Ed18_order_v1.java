package tw.org.iii;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ed18_order_v1 {
	//隨機產生10個1~100的亂數  模擬考試成績  並將齊排序
	public static void main(String[] args) {
		int[]score = new int[10];
		for(int i=0;i<10;i++){
			int j =(int)(Math.random()*100+1);
			score[i]=j;
		}
		int[]order= new int[score.length];
		makeOrder(score,order);
		
		for(int i=0;i<score.length;i++){
			System.out.printf("<%d>\t%d\n",order[i],score[i]);
		}
	}
	
	static void makeOrder(int[] score, int[] order){
		for(int i=0;i<score.length;i++){
			order[i]=1;
			for(int j=0;j<score.length;j++){
				if(score[j]>score[i]){
					order[i]++;
				}
			}
		}
	}
}
