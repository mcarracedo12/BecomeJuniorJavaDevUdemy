package exceptionsFiles;

public class NegativePaymentException extends Exception{
	
	double payment;
	
	public NegativePaymentException(double payment) {
		this.payment= payment;
		System.out.println("Error: Negative Payment of " + payment);
	}
	
	public String toString() {
		return "Cannot take negative payment of " + payment;
	}
}
