package com.careerit.cj.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

abstract class Game {
	public void start() {
		System.out.println("Game is going to start");
	}

	public abstract void play();

	public void stop() {
		System.out.println("Game is going to stop");
	}
}

class Car extends Game {

	@Override
	public void play() {
		System.out.println("You are playing car game, please wear seat belt");
	}
}

class Ship extends Game {

	@Override
	public void play() {
		System.out.println("You are playing ship game, please wear Water jacket");
	}
}

class Bike extends Game {

	@Override
	public void play() {
		System.out.println("You are playing bike game, please wear Helmt");
	}
	public void fly() {
		System.out.println("Bike can fly when your time is bad");
	}
}

public class GameManager {

	public static void main(String[] args) {

		// Create 10 game object ( random 1.Car,2.Bike,3,Ship) then start playing one by
		// one game
		
		List<Game> games = getRandomGames(10);
		for(Game game:games) {
			game.start();
			game.play();
			if(game instanceof Bike) {
				Bike bike = (Bike)game;
				bike.fly();
			}
			game.stop();
			System.out.println("*".repeat(100));
			
			
			
		}

	}

	private static List<Game> getRandomGames(int n) {

		List<Game> games = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			int num = ThreadLocalRandom.current().nextInt(1, 4);
			if (num == 1)
				games.add(new Car());
			else if (num == 2)
				games.add(new Bike());
			else
				games.add(new Ship());
		}
		return games;

	}
}
