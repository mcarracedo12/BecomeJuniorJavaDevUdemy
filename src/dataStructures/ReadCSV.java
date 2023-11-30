package dataStructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String[]> data = new ArrayList<String[]>();
		String filename= "C:\\Users\\marina.carracedo\\eclipse-workspace\\JavaProgrammingForBeginners\\accounts.csv";
		try {
			String datarow;
			// Open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			// Read the data if its not empty
			
			try {
				while((datarow = br.readLine())!= null) {
					// Parse the data by commas
					String[] line = datarow.split(",");
					data.add(line); // add the data to the collection
				}
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for (String[]account : data) {
			System.out.println("\n");
			for(String field: account) {
				System.out.println(field);
			}
		}

	}

}
