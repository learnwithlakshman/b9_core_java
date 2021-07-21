package com.careerit.cj.strexamples;

public class SwitchExample {

	public static void main(String[] args) {

		int num = 8;// ThreadLocalRandom.current().nextInt(1, 8);

		System.out.println(num);

		// 1,2 => Weekdays are bad
		// 3,4,5 => Weekdays are ok
		// 6,7 => Weekends are good

		switch (num) {

		case 1:
		case 2:
			System.out.println("Weekdays are bad");
			break;

		case 3:
		case 4:
		case 5:
			System.out.println("Weekdays are ok");
			break;
		case 6:
		case 7:
			System.out.println("Weekends are good");

		default:
			System.out.println("You are in the wrong place");
			break;
		}

	}
}
