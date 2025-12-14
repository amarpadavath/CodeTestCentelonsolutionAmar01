package Test005oopsconcepts3;

public class Test013BankAccount {
	
	private double balance;
	private String accountNumber;
	
	public Test013BankAccount(String accountNumber,double balance )
	{
		this.accountNumber=accountNumber;
		this.balance = balance;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getbalance()
	{
		return balance;
	}
	
	public void deposit(double amount) 
	{
		if(amount>0)
		{
			balance += amount;
			
			System.out.println("successfully deposited"+amount);
			
		}
		else
		{
			System.out.println("deposite mist be valid");
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount >0 && amount <= balance)
		{
			balance -= amount;
			
			System.out.println("Successful widraw"+amount);
			
		}
		else
		{
			System.out.print("insufficeits balance or amount");
		}
	}

}
