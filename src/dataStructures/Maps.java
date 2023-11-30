package dataStructures;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		// Implement Map interfaces
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		//HashMap en Random
		//TreeMap en orden alfabetico
		//LinkedHashMap en orden de ingreso
		mapUtil(hMap);
		
	}
	public static void mapUtil(Map<Integer, String>map) {
		map.put(101, "Steve");
		map.put(202,  "Sandra");
		map.put(303, "Daiana");
		System.out.println("See all "+ map.keySet());
		System.out.println("Strings are: " + map);
		
		for(int key: map.keySet()) {
			System.out.println("key: " + key + " Name is: " + map.get(key));
		}
	}

}
