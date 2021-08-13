package javaBasic;

import java.util.Scanner;

public class LoopExcercise {

	public static void main(String[] args) {
		// we are playing a lottery and a lucky number is 17;
		// we want to keep asking user any number from 1-20
		// until he guess the lucky number --> congrat
		
		int luckyNumber = 17;
		int anyNumber;
		
		do {
			System.out.println("Enter your number");
			Scanner scan = new Scanner(System.in);
			anyNumber = scan.nextInt();
		}while(anyNumber!=luckyNumber);
		System.out.println("Congratulation!");

	}

}
