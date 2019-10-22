package com.plantform;

class Car {
	private String carName;
	private String engine;
	private int cylinders;
	private int wheels;
	
	public Car(String carName) {
		this.carName = "Car";
		this.engine = "Turbo";
		this.cylinders = 4;
		this.wheels = 4;
	}

	public String getEngine() {
		return engine;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getWheels() {
		return wheels;
	}
	
	public void startEngine() {
		System.out.println("The engine is started.");
	}
	public void accelerate() {
		System.out.println("The speed increased!");
	}
	public void slow() {
		System.out.println("The car slowed to a stop.");
	}
}

class Volkswagon extends Car {
	
	public Volkswagon() {
		super("Volkswagon");		
	}
	
	@Override
	public void startEngine() {
		System.out.println("The volkswagon engine is started.");
	}
@Override	
	public void accelerate() {
		System.out.println("The volkswagon speed increased!");
	}
@Override	
	public void slow() {
		System.out.println("The volkswagon slowed to a stop.");
	}
}

class Dodge extends Car {
	public Dodge() {
		super("Dodge");		
	}
	
	@Override
	public void startEngine() {
		System.out.println("The dodge engine is started.");
	}
@Override	
	public void accelerate() {
		System.out.println("The dodge speed increased!");
	}
@Override	
	public void slow() {
		System.out.println("The dodge slowed to a stop.");
	}
}

class Honda extends Car {
	public Honda() {
		super("Honda");		
	}
	
	@Override
	public void startEngine() {
		System.out.println("The honda engine is started.");
	}
	@Override
	public void accelerate() {
		System.out.println("The honda speed increased!");
	}
//	public void slow() {
//		System.out.println("The honda slowed to a stop.");
//	}
}

public class Main {

	public static void main(String[] args) {

		Volkswagon volkswagon = new Volkswagon();
		Dodge dodge = new Dodge();
		Honda honda = new Honda();

		volkswagon.startEngine();
		volkswagon.accelerate();
		volkswagon.slow();

		dodge.startEngine();
		dodge.accelerate();
		dodge.slow();

		honda.startEngine();
		honda.accelerate();
		honda.slow();

	}

	public static void randomCar() {
		int select = (int) Math.random() * 10 + 4;
		switch(select) {
			case 1: Car Volkswagon = new Volkswagon();
			break;
		}
	}

}
