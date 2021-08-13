package javaBasic;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// get the exam grade from user based on that
		// give them a message.

		System.out.println("Enter your grade:");
		Scanner scan = new Scanner(System.in);
		String grade = scan.next();
		String message;

		switch (grade) {
		case "A":
			message = "Excellent Job";
			break;
		case "B":
			message = "great job";
			break;
		case "C":
			message = "Good job";
			break;
		case "D":
			message = "You need work bit harder";
			break;
		case "E":
			message = "oh nhee";
			break;
		default:
			message = "Invalid grade";

		}
		System.out.println(message);

	}

}
