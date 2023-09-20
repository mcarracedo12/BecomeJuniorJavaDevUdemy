package basics;

public class FibonacciApp {

	public static void main(String[] args) {
		System.out.println(fib(7));
		System.out.println(fact(3));
		System.out.println(sumToN(4));
		int[] numeros = {3,9,6,5,1,4,10};
		System.out.println(min(numeros));
		System.out.println(max(numeros));
		System.out.println(average(numeros));
	}
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;	
		}
		return fib(n-1) + fib(n-2);
	}
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
	else if (n==1) {
			return 1;
		}
		else  {
			return n * fact(n-1);
		}
	}
	public static int sumToN(int n) {
		if(n==1) {
			return 1;
		}else return n + sumToN(n-1);
	}
	// Teachers example:
	public static int sum(int[] numbers) {
	    int sum=0;
	    for (int i = 0; i < numbers.length; i++) {
	        sum=sum+numbers[i];
	    }
	    return sum;
	}
	
	public static int min(int[] nros) {
		int min = nros[0];
		for (int i=0; i< nros.length; i++) {
			if(nros[i]<min) { min =  nros[i];
			}
		}
		return min;
	}
	
	public static int max(int[] nros) {
		int max= nros[0];
		for (int i=0; i< nros.length; i++) {
			if(nros[i]>max) { max=  nros[i];
			}
		}
		return max;
	}
	
	public static int average(int[]numbers) {
		int suma =0;
		for (int i =0; i< numbers.length; i++) {
			suma += numbers[i]; 
		}
		return suma/numbers.length;
	}
}
