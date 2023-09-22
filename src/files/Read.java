package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		// Define a path we want to read
		String filename= "C:\\Users\\marina.carracedo\\eclipse-workspace\\JavaProgrammingForBeginners\\FileToRead.txt";

		// Create the file in Java
		File file = new File(filename);
		String text= null;
		// Open the File
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			// Read the file
			text = br.readLine();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error file not found " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error could not read Data of "+ filename);
			e.printStackTrace();
		}finally {
			System.out.println("Finished reading the file");
		}
		System.out.println(text);
		
		
		
		
	}

}
