package javaBasic;

import java.util.Scanner;

public class IfCondition {
	/*
	 * All salse people get a payment of $1000 for the week Sales people who exceed
	 * 10 sales get an additional bonuses of $250. Ask a sales person how many sales
	 * he/she did last week and find out the total pay.
	 */

	public static void main(String[] args) {

		int salary = 1000;
		int bonuses = 250;
		int quota = 10;

		System.out.println("how many sale did you have?");
		Scanner scan = new Scanner(System.in);
		int sale = scan.nextInt();
		scan.close();

		if (sale > quota) {
			salary = salary + bonuses;
		}
		System.out.println("the employee total salary is $" + salary);

	}

}
