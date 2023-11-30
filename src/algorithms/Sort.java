package algorithms;

public class Sort {
	
	public static void bubbleSort(int[]dataset) {
		boolean swapped;
		do {
			swapped= false;
			for (int i = 1; i < dataset.length; i++) {
				if (dataset[i - 1] > dataset[i]) {
					int temp = dataset[i - 1];
					dataset[i - 1] = dataset[i];
					dataset[i] = temp;
					
					swapped= true;
					printArray(dataset);

				}

			} 
			
		} while (swapped);
		
		
	}
	
	private static void printArray(int[]arr) {
		for(int i:arr) {
			System.out.println(i);
		}
	}

}
