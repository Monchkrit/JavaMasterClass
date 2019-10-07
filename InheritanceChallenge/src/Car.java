
public class Car extends Vehicle {
	
	private int tires;
	private int engine;
	private int doors;
	private int trunk;
	private int gears;
	private boolean isManual;
	private int currentGear;

	public Car() {
		this("Default", "Default", 0, 4, 4, 4, 1);
	}

	public Car(String name, String size) {
		this(name, size, 0, 4, 4, 4, 0);		
	}

	public Car(String name, String size, int gear, int tires, int engine, int doors, int trunk) {
		super(name, size);
		
		this.gear = gear;
		this.tires = tires;
		this.engine = engine;
		this.doors = doors;
		this.trunk = trunk;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
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
	public void changeGears(int gear) {
		switch(gear) {
		case -1:
			System.out.println("You are in reverse");
			this.gear = -1;
			break;
		case 0:
			System.out.println("You are in neutral");
			this.gear = 0;
			break;
		case 1:
			System.out.println("You are in first gear");
			this.gear = 1;
			break;
		case 2:
			System.out.println("You are in second gear");
			this.gear = 2;
			break;
		case 3:
			System.out.println("You are in third gear");
			this.gear = 3;
			break;
		case 4:
			System.out.println("You are in fourth gear");
			this.gear = 4;
			break;
		}
	}
}
