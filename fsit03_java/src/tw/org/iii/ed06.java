package tw.org.iii;

public class ed06 {

	public static void main(String[] args) {
		for(int i = 100; i < 1000; i++){
			if(i == Math.pow((i / 100),3) + Math.pow(((i % 100) / 10) ,3) +
			Math.pow((i % 10),3)){
				System.out.println(i);
			}
		}

	}

}
