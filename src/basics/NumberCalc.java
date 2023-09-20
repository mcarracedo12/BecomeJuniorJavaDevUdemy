package basics;

public class NumberCalc {

	public static void main(String[] args) {
		System.out.println("Program is starting");
		printName();
		int numA = 5;
		int numB = 7;
		addNumbers(numA,numB);
		System.out.println("The product of the numbers is " +multiplyNumbers(numA,numB));

	}
	
	static void printName(){
		System.out.println("My name is Tim");
	}
	
	static void addNumbers(int A, int B ) {
		int sum = A + B;
		System.out.println("The sum of the numbers " + A + " and " + B + " is: " + sum);
	}
	
	static int multiplyNumbers(int A, int B) {
		int mult = A * B;
		return mult;
	}

}
