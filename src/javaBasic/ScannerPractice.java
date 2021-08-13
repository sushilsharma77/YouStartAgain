package javaBasic;

import java.util.Scanner;

public class ScannerPractice {
	public static void main(String args[]) {

		System.out.println("Enter a season of the year");
		Scanner scan = new Scanner(System.in);
		String season = scan.next();

		System.out.println("Enter how many cup of coffee do you drink");
		int cupCoffee = scan.nextInt();

		System.out.println("Please descrive the season");
		String seasonAdjective = scan.next();
		scan.close();

		System.out.println("On a " + seasonAdjective + " " + season + " " + "day," + 
		" I drink a minimum of "+ cupCoffee + " " + "cups of coffee.");

	}

}
