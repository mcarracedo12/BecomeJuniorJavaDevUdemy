package dataStructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> animals = new HashSet<String>(); // Random Order
		//HashSet<String> animals = new LinkedHashSet<String>(); //Changes the Order
		//Set<String> animals = new TreeSet<String>(); // Alphabetical Order
		
		animals.add("Dog");
		animals.add("Pig");
		animals.add("Frogg");
		animals.add("Cat");
		System.out.println(animals.size()+ "" + animals);
		// Random order
		// Does not take duplicates
		
		
		Set<String>farmAnimals = new HashSet<String>();
		farmAnimals.add("Doggie");
		farmAnimals.add("Dog");
		farmAnimals.add("Piggie");
		
		System.out.println(farmAnimals);
		
		Set<String> intersectionSet = new HashSet<>(animals);
		System.out.println(intersectionSet);
		intersectionSet.retainAll(farmAnimals);
		System.out.println(intersectionSet);
		intersectionSet.addAll(farmAnimals);
		System.out.println(intersectionSet);
		intersectionSet.removeAll(animals);
		System.out.println(intersectionSet);

	}

}
