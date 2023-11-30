package algorithms;

public class Search {
	public static int linearSearch(int[] dataset, int target) {
		for(int i= 0; i<dataset.length; i++) {
			if (target== dataset[i]) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static int binarySearch(int[] dataset, int target, int start, int end) {
		//binary search assumes a sorted array and continually splits the array in half
		int midpoint = (int)(start+ end)/2;
		int value = dataset[midpoint];
		
		if (target<=dataset[end] && target>=dataset[start]) {
			if (target < value) {

				System.out.println(target + " < " + value);
				return binarySearch(dataset, target, start, midpoint-1);
			} else if (target > value) {

				System.out.println(target + " > " + value);
				return binarySearch(dataset, target, midpoint+1, end);
			}
			return midpoint;
		}
		else return -1;
	}
	
	

}
