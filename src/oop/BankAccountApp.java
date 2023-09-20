package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new Bank Account
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount("Checking account");
		BankAccount acc3 = new BankAccount("Checking account", 45000);
		acc3.setName("Roger");
		System.out.println(acc3.getName());
		System.out.println(acc3.toString());
		acc3.setSsn("123456");
		System.out.println(acc3.getSsn());
		System.out.println(acc3.toString());
		
		// Demo for inheritance
		CDAccount CD1 = new CDAccount();
		CD1.balance = 3000;
		CD1.setName("CD1");
		CD1.accountType = "CD Account";
		CD1.interestRate = "4.5";
		System.out.println(CD1.toString());
		CD1.compound();
		CD1.deposit(500);
		
		acc1.setRate();
		acc1.increaseRate();

	}

}
