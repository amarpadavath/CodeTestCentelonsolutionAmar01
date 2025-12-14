package Test005oopsconcepts3;

public abstract class Test014Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test013BankAccount acc = new Test013BankAccount("124578",500.00);
		
		System.out.println("Account no"+acc.getAccountNumber());
		
		System.out.println("balance"+acc.getbalance());
		
		acc.deposit(200.00);
		
		System.out.println("current balance "+acc.getbalance());
		
		acc.withdraw(100.00);
		
		System.out.println(" current balance after 100 withdraw "+acc.getbalance());
		
		acc.withdraw(700.00);
		
		System.out.println(" current balance after 700 withdraw "+acc.getbalance());
		
		

	}

}
