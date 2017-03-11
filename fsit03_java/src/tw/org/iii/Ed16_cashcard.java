package tw.org.iii;

public class Ed16_cashcard {

	String account;
	int balance;
	int bonus;
	
	void cashcard(String account, int balance, int bonus){
		this.account = account;
		this.balance = balance;
		this.bonus = bonus;
	}
	
	void store(int number){
		if(number >= 0){
			balance += number;
		}else{
			System.out.println("Error!");
		}
	}
	
	void charge(int number){
		
	}
	
	void exchange(int number){
		
	}
	
	public static void main(String[] args) {
	}
}