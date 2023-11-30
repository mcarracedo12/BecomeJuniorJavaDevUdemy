package labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Payments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				List<String[]> transactions = new ArrayList<String[]>();
				String filename= "C:\\Users\\marina.carracedo\\eclipse-workspace\\JavaProgrammingForBeginners\\payments.csv";
				double balance = 0;
				try {
					String datarow;
					// Open the file
					BufferedReader br = new BufferedReader(new FileReader(filename));
					// Read the data if its not empty
					
					try {
						while((datarow = br.readLine())!= null) {
							// Parse the data by commas
							String[] line = datarow.split(",");
							transactions.add(line); // add the data to the collection
						}
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				for (String[]transaction : transactions) {
					String date = transaction[0];
					String type = transaction[1];
					String vendor = transaction[2];
					double ammount = Double.parseDouble(transaction[3]);
					System.out.println(vendor);
					if (type.equalsIgnoreCase("CREDIT")) {
						balance += ammount;
					}else if (type.equalsIgnoreCase("DEBIT")) {
						balance -= ammount;
					}else {
						System.out.println("Another transaction");
					}
					if (balance<0) {
						System.out.println("Balance is lower than $0: " + balance);
						double fee = balance*0.1;
						System.out.println("Your fee is: " + fee);
						balance += fee;
					}else if (balance==0) {
						System.out.println("Thank you for your payment");
					}
					System.out.println("New balance is: " + balance);
				}

			}

		}
