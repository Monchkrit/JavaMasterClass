
public class Mercedes extends Car {
	public String model;
	public int turbo;
	public int backupCamera;

	public Mercedes() {
		this(0, 0, 0, 4, 4, 2, 1, 0, 0);
	}

	public Mercedes(int steer, int moving) {
		super(steer, 0, moving, 4, 4, 2, 1);
	}

	public Mercedes(int steer, int gear, int moving, int tires, int engine, int doors, int trunk, 
			int turbo, int backupCamera) {
		super(steer, gear, moving, tires, engine, doors, trunk);
		
	}

	public void changeGears(int gear) {
		switch(gear) {
		case -1:
			System.out.println("You are in reverse");
			gear = -1;
			break;
		case 0:
			System.out.println("You are in neutral");
			gear = 0;
			break;
		case 1:
			System.out.println("You are in first gear");
			gear = 1;
			break;
		case 2:
			System.out.println("You are in second gear");
			gear = 2;
			break;
		case 3:
			System.out.println("You are in third gear");
			gear = 3;
			break;
		case 4:
			System.out.println("You are in fourth gear");
			gear = 4;
			break;
		}
	}
}
