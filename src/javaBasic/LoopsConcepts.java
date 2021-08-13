package javaBasic;

import java.util.Scanner;

public class LoopsConcepts {
	/*
	 * 1. initialize 2. condition 3. increment/decrement
	 */

	public static void main(String[] args) {
//		// while loop
//		int i = 50;
//		while (i >= 10) {
//			System.out.println(i);
//			i--;
//
//		}
//		System.out.println("________________________________________");
//
//		// do while loop
//		int x = 10;
//		do {
//			System.out.println(x);
//			x++;
//		} while (x <= 20);
//
//		System.out.println();
//
//		// for loop
//		for (int a = 0; a <= 100; a++) {
//			System.out.println(a);
//		}
//
//		String word = "Hello World";
//		for (int word1 = 0; word1 < 10; word1++) {
//			System.out.println(word);
//		}
//
//		String greeting = "Good morning!";
//		int b = 1;
//		do {
//			System.out.println(greeting);
//			b++;
//		} while (b <= 10);
//		
		String sentence;
		int manyTimes;
		System.out.println("What is your sentence?");
		Scanner scan = new Scanner(System.in);
		sentence = scan.nextLine();
		System.out.println("How many times do you want to pirnt your sentence?");
		manyTimes = scan.nextInt();
		scan.close();
		
        //while loop
//		int in = 0;
//		while(in<manyTimes) {
//			System.out.println(sentence);
//			System.out.println("_________");
//			in++;
//		}
		
         //for loop
//		for(int in=0; in<manyTimes; in++) {
//			System.out.println(sentence);
//		}
		
		//do while loop
		int i = 0;

		do {
			System.out.println(sentence);
			i++;
		} while (i < manyTimes);

	}

}
