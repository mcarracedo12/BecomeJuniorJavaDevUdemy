package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle = "The Lord of the Rings";
		String wordChoice = "Ring";
		if(bookTitle.contains(wordChoice)) {
			System.out.println("The title contains the word " + wordChoice);
		}
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is Chrome");
		}
		
		// Print the initials plus last 4 digits of SSN
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "984162168";
		System.out.println("There are " +SSN.length()+ " int the SSN");
		
	System.out.println(	firstName.substring(0,1)+ lastName.substring(0,1) + SSN.substring(5));
	}

}
