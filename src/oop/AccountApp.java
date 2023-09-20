package oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setTerm(5);
		
		//Polymorphism It changes where we are pointing
		IRate account1 = new LoanAccount(); // Creates a variable based on the propperties of IRate, but that point to Loan Account
		account1.increaseRate();
		account1.setRate();
	}

}
