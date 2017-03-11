package tw.org.iii;

public class Class311_05 {
	public static void main(String[] args) {
		int[] prime = new int[]{2,3,5,7};
		String[] primeFirst = new String[]{"1","2*","3*","4","5*","6","7*","8","9","10"};//第一行的質數很難處理 所以選擇直接手動印出
		for(int i = 0; i <primeFirst.length; i ++){
			System.out.print(primeFirst[i]+"\t");
		}
		System.out.println();
		
		for(int j = 1; j < 10; j++ ){         //開始處理11~100
			for(int i = 1; i <= 10; i ++){
				int newi = i + j *10;
				boolean isPrime = true;       //撲克牌的類似應用  判斷是否質數
				for(int k=0; k<prime.length; k++){
					if(newi % prime[k] == 0){
						isPrime = false;
						break;
					}					
				}
				if(!isPrime){                 //用if判斷 是質數就+*號
					System.out.print(newi+"\t");
				}else{
					System.out.print(newi+"*"+"\t");
				}
			}
			System.out.println();
		}	
	}
	

}
