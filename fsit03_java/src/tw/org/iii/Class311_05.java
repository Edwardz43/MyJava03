package tw.org.iii;

public class Class311_05 {
	
	static boolean Prime(int input){
			int sum = 0;
			for(int i=1;i<=input;i++){
				if(input%i ==0){
					sum++;
				}
			}
			if(sum ==2){
				return true;
			}else{
				return false;
			}
		}
		
	public static void main(String[] args) {		
		for(int j = 0; j < 10; j++ ){         //開始處理11~100
			for(int i = 1; i <= 10; i ++){
				int newi = i + j *10;		
				System.out.print(Prime(newi)?newi+"*"+"\t":newi+"\t");
			}
		System.out.println();
		}
	}	
}