package basics;

public class Cities {

	public static void main(String[] args) {
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		//System.out.println(cities[2]);
		
		String[] states = new String[5];
		states[0]= "California";
		states[1]= "Ohio";
		states[2]= "New Jersey";
		states[3]= "Texas";
		states[4]= "Utah";
		
		//System.out.println(states[5]);// Exception out of Bound
		for(int i=0; i< states.length; i++) {
			System.out.println(states[i]);
		}
		
		
		int i=0;
		boolean stateFound = false;
		while(!stateFound) {
			System.out.println(states[i]);
			String state = states[i];
			if(state == "Texas") {
				System.out.println("FOUND!");
				stateFound = true;
			}
			
			i++;
		}
	}
}
