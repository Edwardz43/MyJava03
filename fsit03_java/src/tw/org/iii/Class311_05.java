package tw.org.iii;

public class Class311_05 {

	public static void main(String[] args) {
		int[] prime = new int[]{2,3,5,7};
		for(int j = 0; j < 10; j++ ){
			for(int i = 1; i <= 10; i ++){
				int newi = i + j *10;
				//for(int k = 1; k <= newi; k ++){
				boolean isPrime = true;
				for(int k=1; k<=newi; k++){
					if(newi % prime[k] != 0){
						isPrime = false;
						System.out.print(newi+"\t");
						break;
					}else{
						System.out.print(newi+"*"+"\t");
						break;
					}
					
				}
			}
			System.out.println();
		}	
	}
	

}
