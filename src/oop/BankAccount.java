package oop;

public class BankAccount implements IRate{
	//Define variables
		// static belongs to the class, not the object instance
		// final constant often static final
	private String accountNumber;
	private static final String routingNumber = null;
	private String name;
	private String ssn;
	String accountType;
	double balance;
	
	// Constructor definitions: unique methods
		// Define / setup / initialize properties of an object
		// Constructors are implicitly called upon instantiation
		// the same name as the Class itself
		// have no return type
	BankAccount(){
		System.out.println("New account created");
	}
	// Overloading same method name with different arguments (Polymorphism)
	BankAccount(String accountType){
		System.out.println("New account created with type " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
		String message;
		if(initDeposit < 1000) {
			 message = "Error: minimum deposit must be $1000";
			
		}
		else {
			 message = "New account created with type " + accountType + " with a deposit of $" + initDeposit;
			 balance += initDeposit;
		}
		System.out.println(message);
		checkBalance();
	}
	
	// Getters and Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	// Interface Methods 
	public void setRate() {
		System.out.println("Setting Rate");
	}
	
	public void increaseRate() {
		System.out.println("Increasing Rate");
	}
	
	
	
	// Define Methods
	public void deposit(double amount) {
		balance += amount;
		showActivity("Deposit");
	};
	
	void withdraw(double amount) {
		balance -= amount;
		showActivity("Withdaw");
	};
	
	//private can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("Showing recent activities: " + activity);
		checkBalance();
	}
	
	void checkBalance() {
		System.out.println("Your balance is: " + balance);
	};
	
	void getStatus() {
		
	};
	@Override // Polymorphism though overriding
	public String toString() {
		return "[" + name + " tiene un saldo de $"+ balance + "]";
	}

}
