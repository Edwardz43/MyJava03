package tw.org.iii;

public class Ed17_calender {

	public static void main(String[] args) {
		int[] year = new int [360];
		for(int i=0; i<year.length;i++){
			year[i]= i;
		}
			
		//切割  撲克牌的延伸
		int[][]date = new int[12][30];
		for(int i=0;i<year.length;i++){
			date[i/30][i%30]=year[i];
		}
		for(int[] ds:date){
			for(int d :ds){
				System.out.print((d%30+1)+"\t");
				if((d+1)%7==0){
					System.out.println();
				}
			}
			System.out.println("\n-------   分隔線      ---------");
		}

		
		
	}

}
