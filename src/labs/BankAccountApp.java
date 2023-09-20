package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("1234565", 1000);
		BankAccount acc2 = new BankAccount("3456125", 2000);
		BankAccount acc3 = new BankAccount("5654685", 1500);
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc3.makeDeposit(500);
		acc2.payBill(200);
		acc2.accrue();
		System.out.println(acc3.toString());
		

	}
}


class BankAccount implements IInterface {
		//Properties
		private static int ID = 100;
		private String accountNumber; // iD + random 2 digit number + first 2 of SSN
		private static final String routingNumber = "005400657";
		private String SSN;
		private String name;
		private double balance;
		
		
		// Constructors
		
		public BankAccount( String SSN, double initDeposit) {
			//super();
			balance = initDeposit;
			this.SSN = SSN;
			System.out.println("New account created");
			setAccountNumber();
			ID ++;
			System.out.println("Next ID is " + ID);
			
		}
		
		private void setAccountNumber() {
			int random = (int)(Math.random() * 100);
			System.out.println(random);
			accountNumber = ID + ""+ random + SSN.substring(0,2);
			System.out.println("Account number is: " + accountNumber);
		}
		
		public void setName(String name) {
			this.name= name;
		}
		public String getName() {
			return name;
		}
		
		public void payBill(double amount) {
			balance -= amount;
			showBalance();
		}
		public void makeDeposit(double amount) {
			balance += amount;
			showBalance();
		}
		
		public void showBalance() {
			System.out.println("The balance is " + balance);
		}

		@Override
		public void accrue() {
			balance = balance * (1 + rate/100);
			showBalance();
		}
		
		@Override
		public String toString() {
			return "Name: " + name + " Account Number: " + accountNumber + " Routing Number: " + routingNumber + " Balance: " + balance;
		};
}

