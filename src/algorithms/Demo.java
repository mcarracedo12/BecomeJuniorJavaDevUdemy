package algorithms;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = {10, 25, 50, 125, 145, 175, 205, 2015};
		//int[] sortedNumbers = {10, 25, 50, 125, 145, 175, 205};
		int[]messedNumbers = {152, 365, 8522, 12, 41, 78, 24};
		
		//int pos = algorithms.Search.linearSearch(numbers, 50);
	//	System.out.println("Number found at position: " + pos);
		
		
		//int binaryPos = algorithms.Search.binarySearch(numbers, 11, 0, numbers.length-1);
		//System.out.println("Number found at position: " + binaryPos + " in the binary tree");
		
		
		Sort.bubbleSort(messedNumbers);
		

	}

}
