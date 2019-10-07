
public class Car extends Vehicle {
	
	private int tires;
	private int engine;
	private int doors;
	private int trunk;
	private int gear;

	public Car() {
		this(0, 0, 0, 4, 4, 4, 0);
	}

	public Car(int steer) {
		this(steer, 0, 0, 4, 4, 4, 0);		
	}

	public Car(int steer, int gear, int moving, int tires, int engine, int doors, int trunk) {
		super(steer, moving);
		
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
	
}
