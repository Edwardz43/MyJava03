package tw.org.iii;

public class Class311_05 {
	
	static boolean getPrime(int input){
		int[] prime = new int[]{2,3,5,7};
		for(int i = 0; i < prime.length; i++){
			if(input == prime[i]){
				return true;
			}else if (input % prime[i]==0){
				return false;
			}else{
				return true;
			}
		}
		return true;
	}
	public static void main(String[] args) {		
		for(int j = 0; j < 10; j++ ){         //開始處理11~100
			for(int i = 1; i <= 10; i ++){
				int newi = i + j *10;		
				System.out.print(getPrime(newi)?newi+"*":newi+"");
			}
		System.out.println();
		}
	}	
}