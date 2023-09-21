package exceptionsFiles;

import java.util.Scanner;

public class PaymentsApp {

	public static void main(String[] args) {
		double payment =0;
		 boolean positivePayment = true;
		
		// Take payment from user
					System.out.print("Please insert amount to pay: ");
					// Get the amount and test the value
					Scanner in = new Scanner(System.in);			
		do {
			positivePayment = false;
			// Handle exceptions
			try {
				payment = in.nextDouble();
				if (payment <= 0) {
					throw new NegativePaymentException(payment);
				}
				else {
					positivePayment = true;
				}
				
			} catch (NegativePaymentException e) {
				System.out.println("ERROR: " + e.toString());
				
				System.out.println("Please enter new amount: ");
				// Get the amount and test the value
				positivePayment= false;
				
			} 
		} while (!positivePayment);
				
		//Print confirmation
		System.out.println("Thank you for your payment of: " + payment);
	}
}
