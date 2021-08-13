package javaBasic;

import java.util.Scanner;

/*
 * To qulify for a loan, a person must make at least 30,000 
 * and have been working at their current job for at least 2 years
 */
public class NestedIf {
	public static void main (String args []) {
		
		int requiredSalary = 30000;
		int requiredYear = 2;
		
		System.out.println("What is your salary?");
		Scanner scan = new Scanner(System.in);
		double salary = scan.nextDouble();
		System.out.println("How many year did you work for your current job");
		double year = scan.nextDouble();
		scan.close();
		
		if(salary>=requiredSalary) {
			System.out.println("Congratulation! you are eligible for a loan. your salary"  +
					"matches with the requirement.");
			if(year>=requiredYear) {
				System.out.println("Congratulation! you are eligible for a loan." +
			"your working year is match");
			}else {
				System.out.println("Sorry, your are not eligible for loan"+
			"you are working in your current job for more than " + requiredYear );
			}
		}
		
		else {
			System.out.println("Sorry, you are not eligible for loan"
					+ " because your salary is low ");
		}
		
		
		
		
	}

}
