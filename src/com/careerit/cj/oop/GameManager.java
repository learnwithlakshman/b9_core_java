package com.careerit.cj.oop;

class Game{
	public void start() {
		System.out.println("Game is going to start");
	}
	public void play() {
		System.out.println("You are plying game");
	}
	public void stop() {
		System.out.println("Game is going to stop");
	}
}
class Car extends Game{
	
	@Override
	public void play() {
		System.out.println("You are playing car game, please wear seat belt");
	}
}

class Ship extends Game{
	
	@Override
	public void play() {
		System.out.println("You are playing car game, please wear Water jacket");
	}
}

class Bike extends Game{
	
	@Override
	public void play() {
		System.out.println("You are playing car game, please wear Helmt");
	}
}
public class GameManager {

		public static void main(String[] args) {
			
				// Create 10 game object ( random 1.Car,2.Bike,3,Ship) then start playing one by one game
		}
}
