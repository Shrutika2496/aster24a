package Encapsulation;

public class ATM {
	private String accountNo;
	private double balance;
	private int pin;
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance>=0)
			this.balance=balance;
		else {
			System.out.println("Invalid balance so default balance 0");
			this.balance=0;
		}
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	//pin authenticate
	public  boolean AuthenticatePin(int enteredPin) {
		return this.pin==enteredPin; //set pin == user pin
	}

	//withdraw money
	public void withdraw(double amount)
	{
		if(amount>0 && amount<=balance) {
			this.balance=balance-amount;
			System.out.println("Withdraw amount : " +amount);
			System.out.println("Actual balance : " +balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
	//deposit money
	public void deposit(double amount) {
		if(amount>0) {
			this.balance=balance+amount;
			System.out.println("Deposit amount : " +amount);
			System.out.println("Actual balance : " +balance);
		}	
		else {
			System.out.println("Invalid deposit amount");
		}
	}
}
