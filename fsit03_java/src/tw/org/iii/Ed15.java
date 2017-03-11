package tw.org.iii;

public class Ed15 {

	public static void main(String[] args) {
		int [] number = new int []{70, 80, 31, 37, 10, 1, 48, 60, 33, 80};
		int [] rank = new int[number.length];
//		for(int i = 0; i < number.length; i++){
//			System.out.printf(rank[i] + ",");
//		} 測試用!
		
		for(int i = 0; i < number.length; i++){
			rank[i] = 1;
			for(int j = 0; j < number.length; j++){
				if(number[j] < number[i]){
					rank[i]++;
				}
			}
		}
		for(int i = 0; i < number.length; i++){
			System.out.printf("%2d(No.%2d)\n", number[i],rank[i]);
		}
		
	}

}
