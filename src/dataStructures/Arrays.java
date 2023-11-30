package dataStructures;

public class Arrays {

	public static void main(String[] args) {
		
		String[] alphabet = {"a", "b", "c", "d"};
		
		for (int i=0;i< alphabet.length; i++ ) {
			System.out.println(alphabet[i]); 
		}
		
		for (String letter : alphabet) {
			System.out.println(letter);
		}
		
		String [][] users = {
				{"John", "Williams", "J.Williams@gmail.com", "30048465"},
				{"Sarah", "Jackson", "sj45@gmail.com", "45563354"},
				{"Rachel", "Wallace", "rw@gmail.com", "6155635"}
				};
		int nrOfUsers= users.length;
		int nrOfFields = users[0].length;
		
		System.out.println(nrOfUsers);
		System.out.println(nrOfFields);
		
		for(String[] user : users) {
			for(String field : user) {
				System.out.println(field);
			}
		}

	}

}
