package exceptionsFiles;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Program starts");
		doMath(12,0);
		System.out.println("Program ends");

	}

	public static void doMath(int a, int b) {
		answer(a,b);
	}
	
	public static double answer(int a, int b) {
		//catch Error
		return a/b;
	}
}
