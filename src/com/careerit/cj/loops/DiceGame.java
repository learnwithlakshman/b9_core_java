package com.careerit.cj.loops;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {

	public static void main(String[] args) {

		int rnum = ThreadLocalRandom.current().nextInt(1, 7);
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a number 1-6 only ");

		for (int i = 1; i <= 3; i++) {
			int gnum = sc.nextInt();
			if (gnum == rnum) {
				System.out.println("Congratulations.... you guessed number :" + i + " attempts ");
				break;
			} else {
		    	if (i == 3) {
					System.out.println("Sorry wrong guess, you have reached max attempts... see you...");
					break;
				} 
				if(gnum > rnum) {
					System.out.println("Guessed number > than actual number");
				}else {
					System.out.println("Guessed number < than actual number");
				}
			}
		}
		sc.close();
	}
}
