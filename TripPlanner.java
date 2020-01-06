import java.util.Scanner;
public class TripPlanner {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		greeting(input);
		budget(input);
		time(input);
		distance(input);
	}
	
	//user name and destination
	public static void greeting (Scanner input) {
		System.out.println("Welcome to Trip Planner!");
		System.out.print("What is your name? ");
		String name = input.nextLine();
		System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
		String place = input.nextLine();
		System.out.println("Great! " + place + " sounds like a great trip");
		System.out.println("************"); 
		System.out.println();
		
	}
	
	//days planned on trip, allowance, and converting info
	public static void budget (Scanner input) {
		System.out.print("How many days are you going to spend travelling? ");
		int days = input.nextInt();
		System.out.print("How much money, in USD, are you planning to spend on your trip? ");
		int money = input.nextInt();
		System.out.print("What is the three letter currency symbol for your travel destination? ");
		String currency = input.next();
		System.out.print("How many " + currency + " are there in 1 USD? ");
		double rate = input.nextDouble();
		System.out.println("");
		int hours = days * 24; 
		int minutes = hours * 60; 
		System.out.println("If you are travelling for " + days + " days that is the same as " + hours + " hours or " + minutes + " minutes");
		double dailyRate = (double)money / days;
		int dailyRate1 = (int)(dailyRate * 100);
		double daily = dailyRate1 / 100.0;
		System.out.println("If you are going to spend $" + money + " USD that mean per day you can spend up to $" + daily + " USD");
		double budget = money * rate;
		double currencyDaily1 = budget / days;
		int currencyDaily2 = (int)(currencyDaily1 * 100);
		double currencyDaily = currencyDaily2 / 100.0;
		System.out.println("Your total budget in " + currency + " is " + budget + " " + currency + " ,  which per day is " + currencyDaily + " " + currency);
		System.out.println("************"); 
		System.out.println();
	}
	
	//time difference between home and destination
	public static void time (Scanner input) {
		System.out.print("What is the time difference, in hours, between your home and your destination? ");
		int hoursDif = input.nextInt();
		System.out.println("That means that when it is midnight at home it will be " + ((24 + hoursDif) % 24) + ":00 in your travel destination" + "\nand when it is noon at home it will be " + ((hoursDif + 12) % 24) + ":00");
		System.out.println("************"); 
		System.out.println();
	}
	
	//distance between home and destination in square kilometers and converts to square miles
	//kilometer*0.62137 = miles
	public static void distance (Scanner input) {
		System.out.print("What is the square area of your destination country in km2? "); 
		int kmSquare = input.nextInt();
		double mileSquare1 = kmSquare * 0.38610216;
		int mileSquare2 = (int)(mileSquare1 * 100);
		double mileSquare = mileSquare2 / 100.0;
		System.out.println("In miles2 that is " + mileSquare);
		System.out.println("************"); 
		System.out.println();	
	}
}
