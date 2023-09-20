package exceptionsFiles;

public class CommonExceptions {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		// 1 Identify the problem area
		// 2 surround with try and catch block
		try {
		int c = a/b;
		} catch(ArithmeticException e) {
			System.out.println("Cannot divide by 0");
			System.out.println(e.toString());
		}
		
		
		String [] states = {"CA", "NY", "TX", "FL"};
		for (int i =0; i<= states.length; i++) {
			try {
			System.out.println(states[i]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.toString());
			}finally {
				System.out.println("Iterating through array");
			}
		}
		System.out.println("Program is closing");
	}

}
