package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// Find the file to write
		String fileName = "C:\\Users\\marina.carracedo\\Desktop\\newFileToWrite.txt";
		String message = "I am writing data that will be placed to a file";
		// Create the file in Java
		File file = new File(fileName);
				
		// Open the file
		FileWriter fw;
		try {
			fw = new FileWriter(file);
			// Write
			fw.write(message);
			System.out.println("writing... " + message);
			// Close the file
			fw.close();
			System.out.println("File closed");
			
		} catch (IOException e) {
			System.out.println("Error: could not read the file " + fileName);
			System.out.println(e.toString());
			e.printStackTrace();
		}finally {
			System.out.println("Closing fileWriter");
		}


		

	}

}
