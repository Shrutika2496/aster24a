package Encapsulation;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ATM account=new ATM(); //OBJECT CREATION
		//Set
		account.setAccountNo("SBI1661");
		account.setBalance(620); //-620 else part me jayega
		account.setPin(2301);
		
		//get
		System.out.println("Enter ATM pin");
		int enteredPin=sc.nextInt();
		if(account.AuthenticatePin(enteredPin)) {
			System.out.println("Login Successful");
			System.out.println("Account number : " +account.getAccountNo());
			System.out.println("Account balance : " +account.getBalance());
			
			//deposit
			System.out.println("Entered amount of deposit");
			double depositeAmt=sc.nextDouble(); //user entered amount deposit
			account.deposit(depositeAmt);
			System.out.println("Updated balance : " +account.getBalance());
			
			//withdraw
			System.out.println("Entered amount of Withdraw");
			double withdrawAmt=sc.nextDouble(); //user entered amount deposit
			account.withdraw(withdrawAmt);
			System.out.println("Updated balance : " +account.getBalance());
		}
		else {
			System.out.println("Enterd invalid pin");
		}
	}
}
