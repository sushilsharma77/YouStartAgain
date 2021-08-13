package javaBasic;

import java.util.Scanner;

//find out the largest number
public class HighestNumber {

	public static void main(String[] args) {
		int x = 55;
		int y = 155;
		int z = 275;

		if (x > y & x > z) {
			System.out.println("x is the largest number");
		} else if (y > z) {
			System.out.println("y is the largest number");
		} else {
			System.out.println("z is the laargest number");
		}
		
		//if else another example
		double examScore;
		char grade;
		
		System.out.println("Enter your exam score");
		Scanner scan = new Scanner(System.in);
		examScore = scan.nextDouble();
		scan.close();
		
		if(examScore<60) {
			grade = 'F';
		}
		else if(examScore<70 & examScore==60) {
			grade = 'D';
		}
		else if (examScore<80 & examScore==70) {
			grade = 'C';
		}
		else if (examScore<90 & examScore==80) {
			grade = 'B';
		}
		else {
			grade = 'A';
		}
		System.out.println("Your grade is " + grade );

	}

}
