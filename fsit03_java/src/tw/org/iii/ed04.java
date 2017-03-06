package tw.org.iii;

public class ed04 {

	public static void main(String[] args) {
		for(int i = 1; i < 10; i++ ){
			for(int j = 1; j < 10; j++){
				int m = i * j;
				if(j == 9){
					System.out.printf(i + "x" + j + "=" + "%2d" + "\n", m);
				}else{
				System.out.printf(i + "x" + j + "=" + "%2d" + " ", m);
				}
			}
		}

	}

}
