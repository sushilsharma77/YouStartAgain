package javaBasic;

import java.util.Scanner;

/*
 * All salse people are expected to make at least 10 sales each week
 * for those who do, they recive congratulatory message
 * for those who don't, they are informed for how many sales they were short
 */
public class IfElseCondition {
	public static void main(String[] args) {
		
		int quota = 10;
		System.out.println("How many sales did you made last week?");
		Scanner scan  = new Scanner (System.in);
		int sales = scan.nextInt();
		scan.close();
		
		if(sales>=quota){
			System.out.println("Conratulation! you complete your quota");
		}else {
			int shorts = quota-sales;
			System.out.println("you didn't fullfill your quota, you are short of "+ shorts );
			System.out.println("Please, work hard to make it next week.");
		}
		
	}

}
