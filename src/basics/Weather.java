package basics;

public class Weather {
		public static void main(String[] args) {
			// This program will give suggestions on what to wear based on the temperature
			int temperature = 65;
			String sunCondition = "Overcast";
			if(temperature > 80) {
				System.out.println("Its pleasant, wear shorts and T-shirts");				
			}
			else if((temperature > 60) && (sunCondition =="Sunny")) {
				System.out.println("Its a little cooler, Perhaps wear a long sleeve shirt and jeans");
				System.out.println("Wear a hat to block the Sun");
			}
			else if((temperature > 50) && (sunCondition =="Overcast")) {
				System.out.println("Cool day, wear warmer clothes");
				
			}
			else {
				System.out.println("Cold, bring a sweater");
			}
			System.out.println("Program is ending");
		}
}
