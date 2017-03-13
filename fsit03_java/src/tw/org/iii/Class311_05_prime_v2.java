package tw.org.iii;

public class Class311_05_prime_v2 {		
	public static void main(String[] args) {
		for(int i=1; i<=100; i++){
			  //~~~這邊改成1
			
			boolean isPrime = true;
			for(int j=2; j<i;j++){
				  //~~~~~~~~因為j從2開始  而且j要<i  所以當i=1的時候 迴圈不會執行  所以1會被判定成質數		
				if(i % j==0){
					isPrime = false;
					break;
				}
			}
			if(isPrime&& i!=1){
					//~~~~~~~~在印出前  加個條件 !=1  這樣1就不會出現*號		
				System.out.print(i+"*"+"\t");
			}else{
				System.out.print(i+"\t");
			}
			if(i % 10==0){
				System.out.println();
			}
		}
		
	}
}