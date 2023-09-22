package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// Read a file and retrieve a phone number
		// Valid phone number 10: digit long
		// Area code cannot start with 0 or 9 
		// phone number cannot contain 911

		String fileName = "C:\\Users\\marina.carracedo\\eclipse-workspace\\JavaProgrammingForBeginners\\PhoneNumber.txt";
		String phoneNumber= null;
		String [] phoneNumbers = new String[9];
		File file = new File(fileName);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			for(int i=0; i < phoneNumbers.length; i++) {
				
				phoneNumbers[i] = br.readLine();
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Could not find file");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Could not read file");
			e.printStackTrace();
		}
		
		for(int i=0; i < phoneNumbers.length; i++) {
			phoneNumber= phoneNumbers[i];
		try {
			
			if(phoneNumber.length()!=10) {
				throw new TenDigitsException(phoneNumber);
			}
			if ((phoneNumber.substring(0, 1).equals("0")) || (phoneNumber.substring(0, 1).equals("9"))) {
				throw new AreaCodeException(phoneNumber);
			}
			for(int n = 0; n< phoneNumber.length()-2; n++){
				if (phoneNumber.substring(n, n+3).equals("911")){				
				throw new EmergencyException();
				}
			}
			System.out.println(phoneNumber);
		} catch(TenDigitsException e) {
			System.out.println("The number is not 10 digits");
			System.out.println(e.toString());
		}catch(AreaCodeException e) {
			System.out.println(e.toString());
		}
		catch(EmergencyException e) {
			System.out.println(e.toString());
		}
		}
	}

}

class TenDigitsException extends Exception{
	String number;
	TenDigitsException(String number){
		this.number= number;
	}
	public String toString() {
		return ("TenDigitsException " + number + " is " + number.length() + " digits");
	}
}

class AreaCodeException extends Exception{
	String number;
	AreaCodeException(String number){
		this.number= number;
	}
	public String toString() {
		return "The area code cannot be " + number.substring(0,1);
	}
}

class EmergencyException extends Exception{
	public EmergencyException() {
		
	}
	public String toString() {
		return "The number is invalid. It contains 911";
	}
}