package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordCriteriaApp {

	// 1. A number
	// 2. A letter
	// 3. Special character (! @ #)
	
	public static void main(String[] args) {
		String fileName = "C:\\Users\\marina.carracedo\\eclipse-workspace\\JavaProgrammingForBeginners\\Passwords.txt";
		File file = new File(fileName);
		
		String passwords[]= new String[13];
		
			try{
				BufferedReader br = new BufferedReader(new FileReader(file));
				for (int i= 0; i< passwords.length; i++) {
				passwords[i] = br.readLine();
				}
				br.close();
			}
			catch(FileNotFoundException e){
				System.out.println("No se encontro el archivo");
				e.printStackTrace();
			}
			catch(IOException e) {
				System.out.println("No se puede leer el archivo");
				e.printStackTrace();
			}
			
			//Test against our criteria
			for(String password : passwords) {	// Recorre todas las passwords
				System.out.println("**********\n\n"+password);
						
				boolean hasNumber= false;
				boolean hasSpecialCharacter = false;
				boolean hasLetter = false;
				boolean hasInvalidCharacter = false;
					for (int i= 0; i< password.length(); i++) { // Recorre las letras de toda la password
				
					if(("1234567890".contains(password.substring(i, i+1)))) {
						hasNumber= true;
					//	System.out.println(password + " contains a number at position " + i);
					}
					
					else if(("@!#*=&{}%.:,-;?$/()+_".contains(password.substring(i, i+1)))) {
						hasSpecialCharacter = true;
					//	System.out.println(password + " contais a Special character at position " + i);					
					}
					
					else if(("abcdefghijklmnopqrstuvwxyz".contains(password.substring(i, i+1).toLowerCase()))) {
						hasLetter = true;
					//	System.out.println(password + " contains a letter at position " + i);
					}
					else {
						try {throw new HasInvalidCharacterException();
						} catch (HasInvalidCharacterException e) {	e.toString();break;	}					
					}	
		
					}// Termina el LOOP
					
					//Test and exception handling
					try {
					if(!hasNumber) {
						throw new HasNoNumberException();
					}
					else if(!hasLetter) {
						throw new HasNoLetterException();
					}
					else if(!hasSpecialCharacter) {
						throw new HasNoSpecialCharacterException(); 
					}
					else {
						System.out.println("Valid password");
						}
					}
					catch(HasNoNumberException |HasNoLetterException | HasNoSpecialCharacterException e) {
						System.out.println(e.toString());
					}
			}
	}
}

class HasNoNumberException extends Exception{
	public HasNoNumberException(){
	}
	public String toString(){
		return "No tiene numeros";
	}
}

class HasNoLetterException extends Exception{
	public HasNoLetterException(){
	}
		public String toString(){
			return "No tiene letras";
	}
}

class HasNoSpecialCharacterException extends Exception{
	public HasNoSpecialCharacterException(){
	}
		public String toString() {
			return "No tiene caracteres especiales";
	}
}

class HasInvalidCharacterException extends Exception{
	public HasInvalidCharacterException(){
	}
	public String toString() {
		return "Has InvalidCharacter";
	}
}
