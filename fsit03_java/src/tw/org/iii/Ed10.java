package tw.org.iii;

public class Ed10 {

	public static void main(String[] args) {
		int [] ct = new int []{0,0,0,0,3,0,0,4,0};
		int [] isl = new int []{4,0,0,2,0,0,5,4,0};
		System.out.printf("CT" + "\t");
		for(int i=0;i<9;i++){
			System.out.printf("%2d",ct[i]);	
		}
		System.out.println();
		System.out.printf("ISL" + "\t");
		for(int i=0;i<9;i++){
			System.out.printf("%2d",isl[i]);	
		}

	}

}
