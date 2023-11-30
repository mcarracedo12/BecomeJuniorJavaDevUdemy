package dataStructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		// Create a collection
		ArrayList<String> cities = new ArrayList <String>();
		
		// Add some elements
		cities.add("Cleveland");
		cities.add("Toronto");
		cities.add("Chicago");
		cities.add("Miami");
		System.out.println(cities);
		
		// Iterate
		for(String city : cities) {
			System.out.println(city);
		}
		System.out.println("There are " + cities.size() + " cities\n");
		cities.remove(3);
		for(String city : cities) {
			System.out.println(city);
		}
		System.out.println("There are " + cities.size() + " cities\n");

	}
	

}
