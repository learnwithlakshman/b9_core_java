package com.careerit.cj.oop.interfaceandabstractclass;

interface Game {
	void start();

	void play();

	default void fly() {
		System.out.println(this.getClass().getSimpleName() + " is going to fly");
	}

	void stop();
}

abstract class AbstractGame implements Game {
	@Override
	public void start() {
		System.out.println(this.getClass().getSimpleName() + " game is going to start");

	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName() + " game is going to stop");

	}
}

class Bike extends AbstractGame implements Game {

	@Override
	public void play() {
		System.out.println("You are playing bike game don't go more 80 KMPH....");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		super.fly();
	}

}

class Car extends AbstractGame implements Game {

	@Override
	public void play() {
		System.out.println("You are playing Car game don't go more 120 KMPH....");

	}

}

@FunctionalInterface
interface NumberOperation {
	public double perform(double... a);
	default void printMessage() {
		
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		Game game = getSomeGameFromHaven();
		game.start();
		game.play();
		game.fly();
		game.stop();

		NumberOperation obj = (a) -> {
			double sum = 1;
			for (double ele : a) {
				sum *= ele;
			}
			return sum;
		};
		System.out.println(obj.perform(3, 4, 5, 6));
	}

	private static Game getSomeGameFromHaven() {
		// TODO Auto-generated method stub
		return new Car();

	}
}
