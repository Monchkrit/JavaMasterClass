
public class Car extends Vehicle {
	
	private int tires;
	private int engine;
	private int doors;
	private int trunk;
	private int gears;
	private boolean isManual;
	private int currentGear;

	public Car() {
		this("Default", "Default", 4, 4, 4, 1, false, -1);
	}

	public Car(String name, String size) {
		this(name, size, 4, 4, 4, 0, false, -1);		
	}

	public Car(String name, String size, int tires, int engine, int doors, 
			int trunk, boolean isManual, int gears) {
		super(name, size);
		
		this.gears = gears;
		this.tires = tires;
		this.engine = engine;
		this.doors = doors;
		this.trunk = trunk;
		this.isManual = isManual;
		this.currentGear = 0;
	}
	
	public boolean getIsManual() {
		return isManual;
	}
	
	public int getGears() {
		return gears;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public int getTires() {
		return tires;
	}

	public void setTires(int tires) {
		this.tires = tires;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getTrunk() {
		return trunk;
	}

	public void setTrunk(int trunk) {
		this.trunk = trunk;
	}
	public void changeGear(int shift) {
		switch(shift) {
		case -1:
			System.out.println("You are in reverse");
			this.currentGear = -1;
			break;
		case 0:
			System.out.println("You are in neutral");
			this.currentGear = 0;
			break;
		case 1:
			System.out.println("You are in first gear");
			this.currentGear = 1;
			break;
		case 2:
			System.out.println("You are in second gear");
			this.currentGear = 2;
			break;
		case 3:
			System.out.println("You are in third gear");
			this.currentGear = 3;
			break;
		case 4:
			System.out.println("You are in fourth gear");
			this.currentGear = 4;
			break;
		}
	}
	public void changeVelocity(int speed, int direction) {
		System.out.println("Car.changeVelocity() : Velocity "+speed+" direction"+direction);
		move(speed, direction);
	}	
}
